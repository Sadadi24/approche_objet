package chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		long debut = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		String chaines = "";
		for (int i = 1; i <= 100000; i++) {
            stringBuilder.append(i);
            chaines+= i;
        
        }
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
	}

}
