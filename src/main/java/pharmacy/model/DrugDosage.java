package pharmacy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="pharm_drugdosage")
public class DrugDosage {
	
	@Id
	private String drug_dosageId;
	private String drug_dosage;

	public DrugDosage(){
		
	}

	public String getDrug_dosageId() {
		return drug_dosageId;
	}

	public void setDrug_dosageId(String drug_dosageId) {
		this.drug_dosageId = drug_dosageId;
	}

	public String getDrug_dosage() {
		return drug_dosage;
	}

	public void setDrug_dosage(String drug_dosage) {
		this.drug_dosage = drug_dosage;
	}
	
	
}
