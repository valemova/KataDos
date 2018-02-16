package com.cenfotec.patrones.logica;

import java.util.ArrayList;

public class NumerosPrimos {

private int num;
	
	public NumerosPrimos() {
		num = 0;
	}
	
	public NumerosPrimos(int pnum) {
		num = pnum;
	}
	
	public void setNum(int pnum) {
		num = pnum;
	}
	
	public int getNum() {
		return num;
	}
	
	public String generate(int pnum){
		
		ArrayList<Integer> listaFactPrims = new ArrayList<Integer>();
		int divisor = 2;
		setNum(pnum);
		String listaString = "";
		
		if(num != 1) {
			while(num != 1){
	            if(num % divisor == 0){
	                num = num/divisor;
	                listaFactPrims.add(divisor);
	            }else{
	                divisor++;
	            }
	        }
		}
		
        for(int i=0; i<listaFactPrims.size(); i++) {
			listaString = listaString + listaFactPrims.get(i) + ",";
        }
        
        return listaString;
	}
	}