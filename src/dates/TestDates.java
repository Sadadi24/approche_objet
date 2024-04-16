package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
       
        Date dateDuJour = new Date();
        Date dateSpecifique = new Date(116, 4, 19, 23, 59, 30);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(dateDuJour);
        String formattedDate1 = dateFormat.format(dateSpecifique);
        System.out.println(formattedDate1);
        

//        // Création d'une instance de la classe Date pour la date du 19/05/2016 à 23:59:30
//        Date dateSpecifique = new Date(116, 4, 19, 23, 59, 30);
//        afficherDate("Date spécifique", dateSpecifique);
//
//        // Création d'une instance de la classe Date pour la date/heure système
//        Date dateSysteme = new Date();
//        afficherDate("Date système", dateSysteme);
//    }
//
//    // Méthode pour afficher une date dans un format spécifique
////    private static void afficherDate(String label, Date date) {
////        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
////        String formattedDate = sdf.format(date);
////        System.out.println(label + " : " + formattedDate);
////    }
}}