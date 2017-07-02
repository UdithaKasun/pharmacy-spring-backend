package pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pharmacy.model.Drug;
import pharmacy.model.DrugCategory;
import pharmacy.model.DrugRequest;
import pharmacy.model.DrugSupplier;
import pharmacy.model.DrugSupply;
import pharmacy.service.DrugService;

@CrossOrigin
@RestController
public class DrugSupplyController {

	@Autowired
	private DrugService drugService;

	// Add New Drug Supplies
	@CrossOrigin
	@RequestMapping(value = "/drugSupply", method = RequestMethod.POST)
	ResponseEntity<?> addDrugCategory(@RequestBody DrugSupply drugSupply) {

		DrugSupply savedSupply = this.drugService.addDrugSupply(drugSupply);

		if (savedSupply != null) {
			return new ResponseEntity<DrugSupply>(savedSupply, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<DrugCategory>(HttpStatus.NO_CONTENT);
		}

	}

	// Get All Drug Supplies
	@CrossOrigin
	@RequestMapping(value = "/drugSupply", method = RequestMethod.GET)
	ResponseEntity<List<DrugSupply>> getDrugSupplies() {
		return new ResponseEntity<List<DrugSupply>>(this.drugService.getAllDrugSupplies(), HttpStatus.OK);
	}

	// Get All Drug Requests
	@CrossOrigin
	@RequestMapping(value = "/drugRequests", method = RequestMethod.GET)
	ResponseEntity<List<DrugRequest>> getPendingDrugRequests() {
		return new ResponseEntity<List<DrugRequest>>(this.drugService.getPendingDrugRequests(), HttpStatus.OK);
	}

	// Get All Supplies for Drug Id
	@CrossOrigin
	@RequestMapping(value = "/drugSupply/{drugId}", method = RequestMethod.GET)
	ResponseEntity<List<DrugSupply>> getDrugSuppliesForDrug(@PathVariable String drugId) {
		return new ResponseEntity<List<DrugSupply>>(this.drugService.getDrugSupplyByDrugId(drugId), HttpStatus.OK);
	}

	// Get All Supplies for Drug Id
	@CrossOrigin
	@RequestMapping(value = "/drugSuppliers", method = RequestMethod.GET)
	ResponseEntity<List<DrugSupplier>> getAllDrugSuppliers() {
		return new ResponseEntity<List<DrugSupplier>>(this.drugService.getAllDrugSuppliers(), HttpStatus.OK);
	}

	// Add New Drug Supplies
	@CrossOrigin
	@RequestMapping(value = "/drugRequests", method = RequestMethod.POST)
	ResponseEntity<?> addDrugRequest(@RequestBody DrugRequest drugRequest) {

		DrugRequest savedDrugRequest = this.drugService.addNewDrugRequest(drugRequest);

		if (savedDrugRequest != null) {
			return new ResponseEntity<DrugRequest>(savedDrugRequest, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<DrugRequest>(HttpStatus.NO_CONTENT);
		}

	}

	// Add New Drug Supplies
	@CrossOrigin
	@RequestMapping(value = "/drugRequests", method = RequestMethod.PUT)
	ResponseEntity<?> updateDrugRequest(@RequestBody DrugRequest drugRequest) {

		DrugRequest savedDrugRequest = this.drugService.updateDrugRequest(drugRequest);

		if (savedDrugRequest != null) {
			return new ResponseEntity<DrugRequest>(savedDrugRequest, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<DrugRequest>(HttpStatus.NO_CONTENT);
		}

	}

	// Add New Drug Supplies
	@CrossOrigin
	@RequestMapping(value = "/drugSuppliers", method = RequestMethod.POST)
	ResponseEntity<?> addNewSupplier(@RequestBody DrugSupplier supplier) {

		DrugSupplier savedDrugSupply = this.drugService.addDrugSupplier(supplier);

		if (savedDrugSupply != null) {
			return new ResponseEntity<DrugSupplier>(savedDrugSupply, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<DrugSupplier>(HttpStatus.NO_CONTENT);
		}

	}
	
	@CrossOrigin
	@RequestMapping(value = "/drug", method = RequestMethod.PUT)
	ResponseEntity<?> updateDrug(@RequestBody Drug drug) {

		Drug savedDrug = this.drugService.updateDrug(drug);

		if (savedDrug != null) {
			return new ResponseEntity<Drug>(savedDrug, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Drug>(HttpStatus.NO_CONTENT);
		}

	}
	
	@CrossOrigin
	@RequestMapping(value = "/drug", method = RequestMethod.DELETE)
	ResponseEntity<?> deleteDrug(@RequestBody Drug drug) {

		this.drugService.deleteDrug(drug);

		return new ResponseEntity<Drug>(HttpStatus.CREATED);

	}
}
