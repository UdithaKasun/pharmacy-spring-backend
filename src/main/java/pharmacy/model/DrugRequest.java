package pharmacy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="pharm_drug_request")
public class DrugRequest {
	
	@Id
	private String request_id;
	private String requestedUser;
	@DBRef
	private Drug requestedDrug;
	private int requestedQuantity;
	private String requestStatus;
	private String assignedSuppier;
	
	public DrugRequest(){
		
	}

	public String getRequestedUser() {
		return requestedUser;
	}

	public void setRequestedUser(String requestedUser) {
		this.requestedUser = requestedUser;
	}

	public Drug getRequestedDrug() {
		return requestedDrug;
	}

	public void setRequestedDrug(Drug requestedDrug) {
		this.requestedDrug = requestedDrug;
	}

	public int getRequestedQuantity() {
		return requestedQuantity;
	}

	public void setRequestedQuantity(int requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getAssignedSuppier() {
		return assignedSuppier;
	}

	public void setAssignedSuppier(String assignedSuppier) {
		this.assignedSuppier = assignedSuppier;
	}

	public String getRequest_id() {
		return request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	
	
}
