package first;


abstract class Bike{  
	  abstract void run();  
	  public void naRun() {
		  System.out.println("heyy");
	  }
	}  



public class Test2 extends Bike{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t=new Test2();
		t.run();
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run");
		
	}

}
