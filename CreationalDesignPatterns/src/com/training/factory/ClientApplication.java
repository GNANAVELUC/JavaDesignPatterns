package com.training.factory;

public class ClientApplication {

	
	public static void main(String[] args) {
	
		int ch=2;
		
		try {
		
			Insurance ins=InsuranceFactory.getInsurance(ch);
			
			System.out.println("Quote"+ins.getPolicyQuote());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		/*InsuranceFactory fac=new InsuranceFactory();
		  Insurance insObj =fac.getInsurance(1);
		  
		  System.out.println("Quote"+insObj.getPolicyQuote());*/
		
		  
	}
}
