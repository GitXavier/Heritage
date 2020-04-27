import java.util.ArrayList;

public class Hangar {


    public static void main(String[] args) {

        Car renault  = new Car("Renault"); 
        renault.setKilometers(60);
        System.out.println(
            "Je suis " + renault.getBrand() + 
            ", je fais " + renault.doStuff() + 
            " et j'ai " + String.valueOf(renault.getKilometers()) + 
            " kilomètres."
        );


        Boat titanic = new Boat("Titanic", 10);
        System.out.println(
            "Je suis " + titanic.getBrand() + 
            ", je fais " + titanic.doStuff() + 
            " et j'ai " + String.valueOf(titanic.gatHours()) + 
            " heure(s) de navigation ."
        );

        ArrayList<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(renault);
        vehicules.add(titanic);
        
        System.out.println("Les vécules de ma liste sont: ");

        for (Vehicule vehicule : vehicules) {
            System.out.println("- " + vehicule.getBrand());
        }
    }
   
}