 abstract class RGPV{
	public abstract void lab();
	public abstract void cctv();
	//abstract
	
	public void examCopyCheck(){
		System.out.println("This Is RGPV non abstract method");
	}
		
	public RGPV(){
		System.out.println("This is RGPV CONStrUCTOR");
	}

	}

class College extends RGPV{
	public void cctv(){
		System.out.println("This is CCTV Method Rule by RGPV");
	}
	public void lab(){
		System.out.println("This is lab Method Rule by RGPV");
	}
	public void staff(){
		System.out.println("This is College class Staff Method");
	}

	public College(){
		System.out.println("This is College CONStrUCTOR");
	}

	public static void main(String args[]){
	//RGPV obj=new RGPV();//C.E.
	RGPV obj=new College();
	obj.cctv();
	obj.lab();
	obj.examCopyCheck();
	
	//obj.staff();
	College c=new College();
	c.cctv();
	c.lab();
	c.examCopyCheck();
	c.staff();
	}
	
 }
