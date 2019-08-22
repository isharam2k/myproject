package test.com.pelatro.SecondTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import com.pelatro.SecondTest.Sum;
import com.pelatro.SecondTest.SumProvider;

public class SumProviderTest {
	private SumProvider sumProvider;
	@Before
	public void setUp() {
		 sumProvider=new SumProvider();
	}
	@Test
	public void testSimpleInput() {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		Sum s=sumProvider.getTotal(l);
		Assert.assertEquals(s.getSum(), 30);

	}

	
	@Test
	public void testInputNull() {
		Sum s=sumProvider.getTotal(null);
		Assert.assertEquals(s.getSum(), 0);
		
	}
	
	
	@Test
	public void testInputBoundary() {
		List<Integer> l=new ArrayList<Integer>();
		l.add(Integer.MAX_VALUE);
		l.add(Integer.MAX_VALUE);
		Sum s=sumProvider.getTotal(l);
		Assert.assertEquals(s.getSum(),(1l* Integer.MAX_VALUE)+Integer.MAX_VALUE);
	}
	
	@Test
	public void testInputEmpty() {
		List<Integer> l=new ArrayList<Integer>();
		
		Sum s=sumProvider.getTotal(l);
		Assert.assertEquals(s.getSum(),0);
	}
	
	
}
