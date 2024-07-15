class AB{

	public void hi(){
	System.out.println("AB class ");
	}
}
class BC extends AB{

	public void hi(){
	System.out.println("Bc Main method");
	}
public static void main(String args[]){
	AB obj=new BC();
	obj.hi();

	}
}