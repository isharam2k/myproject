package com.pelatro.SecondTest;

import java.util.List;

public class SumProvider {
	long total;
	public Sum getTotal(List<Integer> l) {
		Sum sm=new Sum();
		if(l==null) {
			total=0;
			sm.setSum(total);
			return sm;

		}
		
		
		for(Integer integer:l) {
			total=total+integer;
		}
		sm.setSum(total);
		return sm;
	}
	
}
