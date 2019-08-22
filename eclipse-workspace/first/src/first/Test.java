package first;
interface Drawable{
	void draw();
}

class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  

class Circle implements Drawable{
	public void draw() {
		System.out.println("drawing circle");
	}
}
class Square implements Drawable{
	public void draw() {
		System.out.println("drawing square");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner();
		Drawable d=new Circle();
		d.draw();
		
	}

}


