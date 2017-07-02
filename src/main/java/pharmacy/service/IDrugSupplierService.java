package pharmacy.service;

import java.util.List;

import pharmacy.model.DrugRequest;
import pharmacy.model.DrugSupplier;
import pharmacy.model.DrugSupply;

public interface IDrugSupplierService {
	public DrugSupply addDrugSupply(DrugSupply drugSupply);
	public List<DrugSupply> getAllDrugSupplies();
	public List<DrugSupply> getDrugSupplyByDrugId(String drugId);
	public List<DrugRequest> getPendingDrugRequests();
	public DrugRequest addNewDrugRequest(DrugRequest drugRequest);
	public DrugRequest updateDrugRequest(DrugRequest drugRequest);
	public DrugSupplier addDrugSupplier(DrugSupplier supplier);
	public List<DrugSupplier> getAllDrugSuppliers();
}
