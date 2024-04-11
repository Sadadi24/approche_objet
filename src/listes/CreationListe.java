package listes;
import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lisInt = new ArrayList<>();
		int index = 0;
		 for (int i = 1; i <= 100; i++) {
			lisInt.add(index+1);
		}
		 
		 System.out.println(lisInt.size());
	}

}
