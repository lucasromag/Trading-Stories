package Model;

public class Complaint {

	
	private String status;

	private String complaint;

	public Complaint(String status, String complaint) {
		this.status = status;
		this.complaint = complaint;

	}

	public String getStatus() {
		return status;
	}

	public String getComplaint() {
		return complaint;
	}

}
