package pharmacy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="pharm_drug_supply")
public class DrugSupply {
	
	@Id
	private String drug_supplied_srno;
	private int drug_supplied_qty;
	private String drug_supplied_manufact_date;
	private String drug_supplied_expirydate;
	@DBRef
	private Drug drug_supplied_drug;
	private int drug_current_quantity;
	private String batch_added_date;
	private String batch_id;
	
	
	public DrugSupply(){
		
	}

	public String getDrug_supplied_srno() {
		return drug_supplied_srno;
	}

	public void setDrug_supplied_srno(String drug_supplied_srno) {
		this.drug_supplied_srno = drug_supplied_srno;
	}

	public int getDrug_supplied_qty() {
		return drug_supplied_qty;
	}

	public void setDrug_supplied_qty(int drug_supplied_qty) {
		this.drug_supplied_qty = drug_supplied_qty;
	}

	public String getDrug_supplied_manufact_date() {
		return drug_supplied_manufact_date;
	}

	public void setDrug_supplied_manufact_date(String drug_supplied_manufact_date) {
		this.drug_supplied_manufact_date = drug_supplied_manufact_date;
	}

	public String getDrug_supplied_expirydate() {
		return drug_supplied_expirydate;
	}

	public void setDrug_supplied_expirydate(String drug_supplied_expirydate) {
		this.drug_supplied_expirydate = drug_supplied_expirydate;
	}

	public Drug getDrug_supplied_drug() {
		return drug_supplied_drug;
	}

	public void setDrug_supplied_drug(Drug drug_supplied_drug) {
		this.drug_supplied_drug = drug_supplied_drug;
	}

	public int getDrug_current_quantity() {
		return drug_current_quantity;
	}

	public void setDrug_current_quantity(int drug_current_quantity) {
		this.drug_current_quantity = drug_current_quantity;
	}

	public String getBatch_added_date() {
		return batch_added_date;
	}

	public void setBatch_added_date(String batch_added_date) {
		this.batch_added_date = batch_added_date;
	}

	public String getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}
	
	
	
	
}
