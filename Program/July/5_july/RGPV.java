Abstract class RGPV{
	public abstract void lab();
	public abstract void cctv();
	//abstract

	public void examCopyCheck(){
	System.out.println("This is RGPV non abstract method");
}
	public RGPV(){
	System.out.println("This is RGPV Constructor");
}
}

class College extends RGPV{

	public void cctv(){
	System.out.println("This is CCTV method Rule by RGPV");
}
	public void lap(){
	System.out.println("This is lab method Rule by RGPV");
}
	public void staff(){
	System.out.println("This is college class staff method");
}
	public void College(){
	System.out.println("This is college Constructor");
}

public static void main(String args[]){
//RGPV obj=new RGPV(); //C.E.
RGPV obj=new College();
obj.cctv();
obj.lab();
obj.examCopyCheck();
c.cctv();
c.lab();
c.examCopyCheck();
c.staff();

}
}




