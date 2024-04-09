package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte1 = new Compte("12395f", 500);
		
		 System.out.println(compte1);
		System.out.println(compte1.getNumCompte());
		System.out.println("\n" + compte1.getSolde());

	}

}
