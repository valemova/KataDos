package com.cenfotec.patrones.logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosPrimosTest {

	@Test
	public void allTest() {
		
		String [][] values = {
			{"1",""},
			{"2","2,"},
			{"3","3,"},
			{"4","2,2,"},
			{"5","5,"},
			{"6","2,3,"},
			{"7","7,"},
			{"8","2,2,2,"},
			{"9","3,3,"},
			{"36","2,2,3,3,"},
			{"42","2,3,7,"},
			{"4620","2,2,3,5,7,11,"}
			};
		
		String lists;
		
		NumerosPrimos nums = new NumerosPrimos();
		
		for(int i=0; i<values.length; i++) {
			
			lists = nums.generate(Integer.parseInt(values[i][0]));
			assertEquals(lists,values[i][1]);
        }
	}
}
