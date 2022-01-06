package com.te.factorydesignpatterns;

public class Outlet {
	Company company;

	public void outlet(String s) {
		
			if (s.equalsIgnoreCase("TommyHilfiger")) {
				company = new TommyHilfiger();
				company.tshirt();
				company.jeans();
				company.shoes();
			} else if (s.equalsIgnoreCase("Puma")) {
				company = new Puma();
				company.tshirt();
				company.jeans();
				
				company.shoes();
			} else if (s.equalsIgnoreCase("TommyHilfiger")) {
				company = new Addidas();
				company.tshirt();
				company.jeans();
				company.shoes();
			}
			

		}

}
