public class Car extends Vehicule {

    // constructors
	public Car(String brand) {  
	    super(brand);  
	}
  
    // methods abstraite
    @Override
    public String doStuff() {
        return "vroum vroum !";
    }
}