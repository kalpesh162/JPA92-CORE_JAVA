public class Address implements Cloneable{
	private String landMark;
	private String city;
	private int pincode;

	public Address(String landMark, String city, int pincode) {
		super();
		this.landMark = landMark;
		this.city = city;
		this.pincode = pincode;
	};

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [landMark=" + landMark + ", city=" + city + ", pincode=" + pincode + "]";
	}

	@Override
	public Address clone() throws CloneNotSupportedException{
		 return (Address)super.clone();
	}

}
