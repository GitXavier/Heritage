public class Boat extends Vehicule  {

    // attributes
    private int hours;

    // constructors
	public Boat(String brand, int hours) {  
	    super(brand);  
	    this.hours = hours;
	}
  
    // methods abstraite
    @Override
    public String doStuff() {
        return "glou glou !";
    }
  
    // getters and setters
    public int gatHours() {  
        return this.hours;  
    }  
  
    public void setHours(int hours) {  
        this.hours = hours; 
    } 
}