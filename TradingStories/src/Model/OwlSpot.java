package Model;

public class OwlSpot {

	private String address;

	private String reference;

	private String name;

	public OwlSpot(String name,String address, String reference) {
		this.address = address;
		this.reference = reference;
		this.name = name;
	}

	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

	public String getReference() {
		return reference;
	}

}
