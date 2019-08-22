package com.pelatro.SecondTest;

import java.util.ArrayList;
import java.util.List;

public class Check {
	
	List<String> s=new ArrayList<String>();
	public List<String> find(List<Integer> l){
		if(l==null)
			return null;
		if(l.isEmpty()==true) {
			s.add("empty");
			return s;
		}
		for(Integer i:l) {
			if(i==null)
				s.add(null);
			else if((i%3 ==0 )&& (i%5==0)) 
				s.add("fuss buzz");
			else if((i%3)==0)
				s.add("fuzz");
			else if((i%5)==0)
				s.add("Buzz");
			else
				s.add(Integer.toString(i));
			
		}
		
		return s;
		
	}
	
}
