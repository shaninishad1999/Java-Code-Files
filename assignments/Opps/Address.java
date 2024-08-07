class Address{
private int flatNumber=410,PinCode=24561;
private String BuildingName="1",Locality="pa",City="Ma",Distict="ka",State="Ma",Country="I";


public address(){
System.out.println("Default Constructor");
}

public address(){
System.out.println("Parameterize Constructor");
}

public int getFlatNumber(){
return flatNumber;
}
public int getPinCode(){
return PinCode;
}

public String getBuildingName(){
return BuildingName;
}
public String getLocality(){
return Locality;
}
public String getCity(){
return City;
}
public String getDistict(){
return Distict;
}
public String getState(){
return State;
}
public String getCountry(){
return Country;
}


public static String fullAddress(){


return 
}


public static void main(String[] args){

	Address obj=new Address();
	System.out.println("Flat number -"+obj.getFlatNumber());
	System.out.println("Building name - "+obj.);
	System.out.println("Locality - "+);
	System.out.println("City - "+);
	System.out.println("District - "+);
	System.out.println("State - "+);
	System.out.println("Country - "+);
	System.out.println("Pincode - "+);

}
}