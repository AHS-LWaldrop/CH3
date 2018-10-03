/**
 * Lucas Waldrop
 * Programming III - AP CS
 * CH3PC2
 * 9/28/18
 */
public class Car {
    
    /**
     * This declares the fields of yearModel, make, and speed.
     */
    
    private int yearModel;
    private int speed;
    private String make; 
    
    /*
    * Car class constructor initializes the yearModel, make, and
    * speed fields.
    */
    
    public Car(int yearM, String mak){
        yearModel = yearM;
        make = mak;
        speed = 0;
    }
    
    /**
     * The setYearModel method accepts an argument
     * that is stored in the yearModel field.
     */
    
    public void setYearModel(int YM){
        yearModel = YM;
    }
    
     /**
     * The getYearModel method returns the
     * value stored in the YearModel field.
     */
    
    public int getYearModel(){
        return yearModel;
    }
    
    /**
     * The setMake method accepts an argument
     * that is stored in the make field.
     */
    
    public void setMake(String mk){
        make = mk;
    }
    
    /**
     * The getMake method returns the
     * value stored in the make field.
     */
    
    public String getMake(){
        return make;
    }
    
    /**
     * The accelerate method adds 5 to speed
     * every time it is called.
     */
    
    public void accelerate(){
        speed += 5;
    }

    /**
     * The brake methods subtracts 5 to speed
     * every time it is called.
     */
    
    public void brake(){
        speed -= 5;
    }
    
    /**
     * The getSpeed method returns the
     * value of the speed field.
     */
    
    public int getSpeed(){
        return speed;
    }
}
