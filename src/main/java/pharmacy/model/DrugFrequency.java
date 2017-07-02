package pharmacy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="pharm_drugfrequency")
public class DrugFrequency {
	
	@Id
	private String drug_ferquencyId;
	private String drug_ferquency;
	
	public DrugFrequency(){
		
	}

	public String getDrug_ferquencyId() {
		return drug_ferquencyId;
	}

	public void setDrug_ferquencyId(String drug_ferquencyId) {
		this.drug_ferquencyId = drug_ferquencyId;
	}

	public String getDrug_ferquency() {
		return drug_ferquency;
	}

	public void setDrug_ferquency(String drug_ferquency) {
		this.drug_ferquency = drug_ferquency;
	}
	
}
