package test.com.pelatro.SecondTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import com.pelatro.SecondTest.Check;

public class CheckTest {
	Check c;
	@Before
	public void setUp() {
		c=new Check();
	}
	@Test
	public void checkInputEmpty(){
		List<Integer> l=new ArrayList<Integer>();
		List<String> s=new ArrayList<String>();
		s=c.find(l);
		Assert.assertEquals(s.get(0), "empty");
	}
	
	
	
	@Test
	public void checkInputNull(){
		//c.find(null);
		
		Assert.assertNull(c.find(null));
	}
	@Test
	public void checkSimpleInput(){
		//c.find(null);
		List<Integer> l=new ArrayList<Integer>();
		l.add(15);
		l.add(3);
		l.add(5);
		List<String> s=new ArrayList<String>();
		s=c.find(l);
		Assert.assertEquals(s.get(0),"fuss buzz" );
		Assert.assertEquals(s.get(1),"fuzz" );
		Assert.assertEquals(s.get(2),"Buzz" );
	}
	@Test
	public void checkInputNullInBetween(){
		//c.find(null);
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(null);
		l.add(5);
		List<String> s=new ArrayList<String>();
		s=c.find(l);
		Assert.assertEquals(s.get(0),"1" );
		Assert.assertEquals(s.get(1),null);
		Assert.assertEquals(s.get(2),"Buzz" );

		
	}
	@Test
	public void checkBoundaryInput() {
		List<Integer> l=new ArrayList<Integer>();
		List<String> s=new ArrayList<String>();
		l.add(Integer.MAX_VALUE);
		l.add(Integer.MIN_VALUE);
		s=c.find(l);
		Assert.assertEquals(s.get(0),Integer.toString(Integer.MAX_VALUE ));
		Assert.assertEquals(s.get(1),Integer.toString(Integer.MIN_VALUE));
		
		
		
	}
	
	@Test
	public void checkNegativeInput() {
		List<Integer> l=new ArrayList<Integer>();
		List<String> s=new ArrayList<String>();
		l.add(-15);
		l.add(-2);
		s=c.find(l);
		Assert.assertEquals(s.get(0),"fuss buzz" );
		Assert.assertEquals(s.get(1),"-2");
		
		
		
		
	}
	
	
	
}