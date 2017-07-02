package pharmacy.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import pharmacy.model.Drug;
import pharmacy.model.DrugCategory;
import pharmacy.model.DrugDosage;
import pharmacy.model.DrugFrequency;
import pharmacy.model.DrugRequest;
import pharmacy.model.DrugSupplier;
import pharmacy.model.DrugSupply;
import pharmacy.model.DrugType;
import pharmacy.repository.DrugCategoryRepository;
import pharmacy.repository.DrugDosageRepository;
import pharmacy.repository.DrugFrequencyRepository;
import pharmacy.repository.DrugRepository;
import pharmacy.repository.DrugRequestRepository;
import pharmacy.repository.DrugSupplierRepository;
import pharmacy.repository.DrugSuppliesRepository;
import pharmacy.repository.DrugTypeRepositoy;

@Service
public class DrugService implements IDrugService, IDrugSupplierService {

	@Autowired
	private DrugCategoryRepository drugCategoryRepositoy;

	@Autowired
	private DrugDosageRepository drugDosageRepositoy;

	@Autowired
	private DrugFrequencyRepository drugFrequencyRepositoy;

	@Autowired
	private DrugRepository drugRepositoy;

	@Autowired
	private DrugTypeRepositoy drugTypeRepositoy;

	@Autowired
	private DrugSuppliesRepository drugSuppliesRepositoy;

	@Autowired
	private DrugRequestRepository drugRequestRepositoy;

	@Autowired
	private DrugSupplierRepository drugSupplierRepositoy;
	
	@Autowired
	MongoOperations mongoOperations;
	
	@Override
	public Drug addDrug(Drug drug) {
		return drugRepositoy.save(drug);
	}

	@Override
	public DrugCategory addDrugCatergory(DrugCategory drugCategory) {
		return drugCategoryRepositoy.save(drugCategory);
	}

	@Override
	public List<DrugCategory> getAllDrugCategories() {
		return drugCategoryRepositoy.findAll();
	}

	@Override
	public DrugDosage addDrugDosage(DrugDosage drugDosage) {
		return drugDosageRepositoy.insert(drugDosage);
	}

	@Override
	public DrugFrequency addDrugFrequency(DrugFrequency drugFrequency) {
		return drugFrequencyRepositoy.save(drugFrequency);
	}

	@Override
	public List<DrugDosage> getAllDrugDosages() {
		return drugDosageRepositoy.findAll();
	}

	@Override
	public List<DrugFrequency> getAllDrugFrequencies() {
		return drugFrequencyRepositoy.findAll();
	}

	@Override
	public List<DrugType> getAllDrugTypes() {
		return drugTypeRepositoy.findAll();
	}

	@Override
	public DrugType addDrugType(DrugType drugType) {
		return drugTypeRepositoy.save(drugType);

	}

	@Override
	public List<Drug> getAllDrugs() {
		List<Drug> initialDrugList = drugRepositoy.findAll();
		
		return initialDrugList
				.stream()
//				.map(drug -> {
//					drug.setDrug_categoryid(drugCategoryRepositoy.findOne(drug.getDrug_categoryid().getCategory_id()));
//					return drug;
//				})
				.collect(Collectors.toList());
	}

	@Override
	public Drug updateDrug(Drug drug) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(drug.getDrug_srno()));

		Drug  foundResource = mongoOperations.findOne(query, Drug.class);
		foundResource.setDrug_price(drug.getDrug_price());
		foundResource.setDrug_reorderlevel(drug.getDrug_reorderlevel());
		foundResource.setDrug_name(drug.getDrug_name());
		foundResource.setDrug_dangerlevel(drug.getDrug_dangerlevel());
		mongoOperations.save(foundResource);
		return foundResource;
	}

	@Override
	public DrugSupply addDrugSupply(DrugSupply drugSupply) {
		return drugSuppliesRepositoy.insert(drugSupply);
	}

	@Override
	public List<DrugSupply> getAllDrugSupplies() {
		return drugSuppliesRepositoy.findAll();
	}

	@Override
	public List<DrugSupply> getDrugSupplyByDrugId(String drugId) {
		return drugSuppliesRepositoy.findAll()
				.stream()
				.filter(supply -> supply.getDrug_supplied_drug().getDrug_srno().equals(drugId))
				.collect(Collectors.toList());
	}

	@Override
	public List<DrugRequest> getPendingDrugRequests() {
		return drugRequestRepositoy.findAll()
				.stream()
				.filter(drugRequst -> drugRequst.getRequestStatus().equals("NEW") )
				.collect(Collectors.toList())
				;
	}

	@Override
	public DrugRequest addNewDrugRequest(DrugRequest drugRequest) {
		return drugRequestRepositoy.insert(drugRequest);
	}

	@Override
	public DrugSupplier addDrugSupplier(DrugSupplier supplier) {
		return drugSupplierRepositoy.insert(supplier);
	}

	@Override
	public List<DrugSupplier> getAllDrugSuppliers() {
		return drugSupplierRepositoy.findAll();
	}

	@Override
	public DrugRequest updateDrugRequest(DrugRequest drugRequest) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(drugRequest.getRequest_id()));

		DrugRequest foundResource = mongoOperations.findOne(query, DrugRequest.class);
		foundResource.setAssignedSuppier(drugRequest.getAssignedSuppier());
		foundResource.setRequestStatus(drugRequest.getRequestStatus());
		mongoOperations.save(foundResource);
		return foundResource;
	}

	@Override
	public void deleteDrug(Drug drug) {
		drugRepositoy.delete(drug.getDrug_srno());
		
	}


}
