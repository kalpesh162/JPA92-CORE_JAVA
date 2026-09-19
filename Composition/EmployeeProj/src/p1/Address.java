package p1;

public  class Address {
	private String landMark;
	private String city;
	private int pincode;

	public  Address(String landMark,String city ,int pincode){
		this.landMark=landMark;this.city=city; this.pincode=pincode;
	}

	public void setLandMark(String landMark){ this.landMark=landMark;}
	public  void setCity(String city){ this.city=city;}
	public void setPincode(int pincode){ this.pincode=pincode;}

	public  String getLandMark(){ return landMark;}
	public  String getCity(){ return city;}
	public  int getPincode(){ return pincode;}

	public void displayAddress(){
		System.out.println(landMark +"  "+city +"  "+pincode+"  ");
	}
	
	@Override
	public String toString(){
			return ""+landMark +" "+city +" "+pincode;
	}
}