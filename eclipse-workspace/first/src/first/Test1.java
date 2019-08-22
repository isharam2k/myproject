package first;
interface Printable{
	void print();
}
interface Showable extends Printable{
	int p=1;
	void show();
	static void display() {
		System.out.println("hey");
	}
	
}
 
public class Test1 implements Showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		t.show();
		t.print();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("inside show");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("inside print");
	}

}
