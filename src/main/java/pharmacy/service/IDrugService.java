package pharmacy.service;

import java.util.List;

import pharmacy.model.Drug;
import pharmacy.model.DrugCategory;
import pharmacy.model.DrugDosage;
import pharmacy.model.DrugFrequency;
import pharmacy.model.DrugSupply;
import pharmacy.model.DrugType;

public interface IDrugService {
	public DrugCategory addDrugCatergory(DrugCategory drugCategory);
	public Drug addDrug(Drug drug);
	public Drug updateDrug(Drug drug);
	public List<Drug> getAllDrugs();
	public List<DrugCategory> getAllDrugCategories();
	public List<DrugDosage> getAllDrugDosages();
	public List<DrugFrequency> getAllDrugFrequencies();
	public DrugDosage addDrugDosage(DrugDosage drugDosage);
	public DrugFrequency addDrugFrequency(DrugFrequency drugFrequency);
	public List<DrugType> getAllDrugTypes();
	public DrugType addDrugType(DrugType drugType);
	public void deleteDrug(Drug drug);
}
