package equals;

import listes.Ville;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Ville v1 = new Ville("paris", 2600000);
       Ville v2 = new Ville("paris", 2600000);
       Ville v3 = v1;
       
       System.out.println(v1.equals(v2));
    // meme attribut avec l'operateur == 
       System.out.println(v1== v2);// pour que ca return true avec == on doit faire la comparaisan des attribut mais pas l'objet ville
       System.out.println(v1== v3);
       v2.setNbHabitants(2600001);
       
       
       // Meme ville mais avec une population different
       System.out.println(v1.equals(v2));
    //  attribut different avec l'operateur == 
       System.out.println(v1== v2);
       
	}

}
