package pharmacy.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="pharm_drug_supplier")
public class DrugSupplier {

	private String supplier_name;
	private String supplier_id;
	private String email;
	private String contact;
	private String[] drugs;
	
	public DrugSupplier(){
		
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String[] getDrugs() {
		return drugs;
	}

	public void setDrugs(String[] drugs) {
		this.drugs = drugs;
	}
	
	
}
