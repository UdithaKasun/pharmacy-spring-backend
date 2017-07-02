package pharmacy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="pharm_drug")
public class Drug {

	@Id
	private String drug_srno;
	private String drug_name;
	@DBRef
	private DrugType drug_type;
	private Boolean drug_active;
	private String drug_remarks;
	private double drug_price;
	@DBRef
	private DrugCategory drug_categoryid;
	private int drug_reorderlevel;
	private int drug_dangerlevel;
	@DBRef
	private DrugDosage drug_dosage;
	@DBRef
	private DrugFrequency drug_frequency;

	public Drug() {

	}

	public String getDrug_srno() {
		return drug_srno;
	}

	public void setDrug_srno(String drug_srno) {
		this.drug_srno = drug_srno;
	}

	public String getDrug_name() {
		return drug_name;
	}

	public void setDrug_name(String drug_name) {
		this.drug_name = drug_name;
	}

	public Boolean getDrug_active() {
		return drug_active;
	}

	public void setDrug_active(Boolean drug_active) {
		this.drug_active = drug_active;
	}

	public String getDrug_remarks() {
		return drug_remarks;
	}

	public void setDrug_remarks(String drug_remarks) {
		this.drug_remarks = drug_remarks;
	}

	public int getDrug_reorderlevel() {
		return drug_reorderlevel;
	}

	public void setDrug_reorderlevel(int drug_reorderlevel) {
		this.drug_reorderlevel = drug_reorderlevel;
	}

	public int getDrug_dangerlevel() {
		return drug_dangerlevel;
	}

	public void setDrug_dangerlevel(int drug_dangerlevel) {
		this.drug_dangerlevel = drug_dangerlevel;
	}
	
	public double getDrug_price() {
		return drug_price;
	}

	public void setDrug_price(double drug_price) {
		this.drug_price = drug_price;
	}

	public DrugCategory getDrug_categoryid() {
		return drug_categoryid;
	}

	public void setDrug_categoryid(DrugCategory drug_categoryid) {
		this.drug_categoryid = drug_categoryid;
	}

	public DrugDosage getDrug_dosage() {
		return drug_dosage;
	}

	public void setDrug_dosage(DrugDosage drug_dosage) {
		this.drug_dosage = drug_dosage;
	}

	public DrugFrequency getDrug_frequency() {
		return drug_frequency;
	}

	public void setDrug_frequency(DrugFrequency drug_frequency) {
		this.drug_frequency = drug_frequency;
	}

	public DrugType getDrug_type() {
		return drug_type;
	}

	public void setDrug_type(DrugType drug_type) {
		this.drug_type = drug_type;
	}

	
}
