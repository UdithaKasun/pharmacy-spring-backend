package pharmacy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="pharm_drug_type")
public class DrugType {
	
	@Id
	private String drug_typeId;
	private String drug_type;
	
	public DrugType(){
		
	}

	public String getDrug_typeId() {
		return drug_typeId;
	}

	public void setDrug_typeId(String drug_typeId) {
		this.drug_typeId = drug_typeId;
	}

	public String getDrug_type() {
		return drug_type;
	}

	public void setDrug_type(String drug_type) {
		this.drug_type = drug_type;
	}
	
	
}
