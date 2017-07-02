package pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pharmacy.model.Drug;
import pharmacy.model.DrugCategory;
import pharmacy.model.DrugDosage;
import pharmacy.model.DrugFrequency;
import pharmacy.model.DrugType;
import pharmacy.service.DrugService;

@CrossOrigin
@RestController
public class DrugController {

	@Autowired
	private DrugService drugService;

	@Autowired
	MongoOperations mongoOperations;
	
	
	// Add New Drug Category
	@CrossOrigin
	@RequestMapping(value = "/drugCategory", method = RequestMethod.POST)
	ResponseEntity<?> addDrugCategory(@RequestBody DrugCategory drugCategory) {

		DrugCategory savedCategory = this.drugService.addDrugCatergory(drugCategory);

		if (savedCategory != null) {
			return new ResponseEntity<DrugCategory>(savedCategory, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<DrugCategory>(HttpStatus.NO_CONTENT);
		}

	}

	// Add New Drug Frequency
	@CrossOrigin
	@RequestMapping(value = "/drugFrequency", method = RequestMethod.POST)
	ResponseEntity<?> addDrugFrequency(@RequestBody DrugFrequency drugFrequency) {

		DrugFrequency savedDrugFrequency = this.drugService.addDrugFrequency(drugFrequency);

		if (savedDrugFrequency != null) {
			return new ResponseEntity<DrugFrequency>(savedDrugFrequency, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<DrugFrequency>(HttpStatus.NO_CONTENT);
		}

	}

	// Add New Drug Dosage
	@CrossOrigin
	@RequestMapping(value = "/drugDosage", method = RequestMethod.POST)
	ResponseEntity<?> addDrugDosage(@RequestBody DrugDosage drugDosage) {

		DrugDosage savedDrugDosage = this.drugService.addDrugDosage(drugDosage);

		if (savedDrugDosage != null) {
			return new ResponseEntity<DrugDosage>(savedDrugDosage, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<DrugDosage>(HttpStatus.NO_CONTENT);
		}

	}

	// Add New Drug
	@CrossOrigin
	@RequestMapping(value = "/drug", method = RequestMethod.POST)
	ResponseEntity<?> addDrug(@RequestBody Drug drug) {

		Drug savedDrug = this.drugService.addDrug(drug);

		if (savedDrug != null) {
			return new ResponseEntity<Drug>(savedDrug, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Drug>(HttpStatus.NO_CONTENT);
		}

	}

	// Add New Drug Type
	@CrossOrigin
	@RequestMapping(value = "/drugType", method = RequestMethod.POST)
	ResponseEntity<?> addDrugType(@RequestBody DrugType drugType) {

		DrugType savedDrugType = this.drugService.addDrugType(drugType);

		if (savedDrugType != null) {
			return new ResponseEntity<DrugType>(savedDrugType, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<DrugType>(HttpStatus.NO_CONTENT);
		}

	}

	// Get All Drug Categories
	@CrossOrigin
	@RequestMapping(value = "/drugCategory", method = RequestMethod.GET)
	ResponseEntity<List<DrugCategory>> getDrugDosages() {
		return new ResponseEntity<List<DrugCategory>>(this.drugService.getAllDrugCategories(), HttpStatus.OK);
	}

	// Get All Drug Dosages
	@CrossOrigin
	@RequestMapping(value = "/drugDosage", method = RequestMethod.GET)
	ResponseEntity<List<DrugDosage>> getDrugCategories() {
		return new ResponseEntity<List<DrugDosage>>(this.drugService.getAllDrugDosages(), HttpStatus.OK);
	}

	// Get All Drug Frequencies
	@CrossOrigin
	@RequestMapping(value = "/drugFrequency", method = RequestMethod.GET)
	ResponseEntity<List<DrugFrequency>> getDrugFrequencies() {
		return new ResponseEntity<List<DrugFrequency>>(this.drugService.getAllDrugFrequencies(), HttpStatus.OK);
	}

	// Get All Drug Types
	@CrossOrigin
	@RequestMapping(value = "/drugType", method = RequestMethod.GET)
	ResponseEntity<List<DrugType>> getDrugTypes() {
		return new ResponseEntity<List<DrugType>>(this.drugService.getAllDrugTypes(), HttpStatus.OK);
	}
	
	// Get All Drug Types
	@CrossOrigin
	@RequestMapping(value = "/drug", method = RequestMethod.GET)
	ResponseEntity<List<Drug>> getDrug() {
		return new ResponseEntity<List<Drug>>(this.drugService.getAllDrugs(), HttpStatus.OK);
	}

}
