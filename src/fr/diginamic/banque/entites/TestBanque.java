package fr.diginamic.banque.entites;

import java.util.Iterator;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte1 = new Compte("s12395f", 500);
		CompteTaux  compteTaux =  new CompteTaux("asad225",500, 0.2);
		CompteTaux  compteTaux1 =  new CompteTaux("56ad245",600, 0.2);
	
		
		System.out.println(compte1.toString());
		
		System.out.println(compte1.getNumCompte());
		System.out.println("\n" + compte1.getSolde());
		Compte [] listCompte = {compte1,compteTaux1,};
	    
	    for(Compte value : listCompte) {
	    	System.out.println(value);
	    }

	}

}
