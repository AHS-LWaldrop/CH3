/**
 * Lucas Waldrop
 * Programming III - AP CS
 * CH3PC3
 * 10/2/18
 */
public class PersonalInfo {
    
    /**
     * This declares the fields of name, address,
     * age, and phone number.
     */
    
    private String name;
    private String addressLetter;
    private int addressNumber;
    private int age;
    private int areaCode;
    private int number;
    
    /**
     * PersonalInfo class constructor initializes
     * the fields above.
     */
    
    public PersonalInfo(String nm, String AL, int AN, int ag, int AC, int num){
        name = nm;
        addressLetter = AL;
        addressNumber = AN;
        age = ag;
        areaCode = AC;
        number = num;
    }
    
    /**
     * The setName methods accepts an argument
     * that is stored in the name field.
     */
    
    public void setName(String nam){
        name = nam;
    }
    
    /**
     * The getName methods returns the
     * value stored in the name field.
     */
    
    public String getName(){
        return name;
    }
    
    /**
     * The setAddressLetter method accepts an argument
     * that is stored in the name field.
     */
    
   public void setAddressLetter(String addLet){
       addressLetter = addLet;
   }
    
   /**
    * The getAddressLetter method returns the
    * value stored in the addressLetter field.
    */
   
   public String getAddressLetter(){
       return addressLetter;
   }
   
   /**
    * The setAddressNumber method accepts an argument
    * that is stored in the addressNumber field.
    */
   
   public void setAddressNumber(int addNum){
       addressNumber = addNum;
   }
   
   /**
    * The getAddressNumber method returns the
    * value stored in the addressNumber field.
    */
   
   public int getAddressNumber(){
       return addressNumber;
   }
   
   /**
    * The setAge method accepts an argument
    * that is stored in the addressNumber field.
    */
   
   public void setAge(int age2){
       age = age2;
   }
   
   /**
    * The getAge method returns the
    * value stored in the addressNumber field.
    */
   
   public int getAge(){
       return age;
   }
   
   /**
    * The setAreaCode method accepts an argument
    * that is stored in the number field.
    */
   
   public void setAreaCode(int area){
       areaCode = area;
   }
   
   /**
    * The getAreaCode returns the
    * value stored in the areaCode field.
    */
  
   public int getAreaCode(){
       return areaCode;
   }
   
   /**
    * The setNumber method accepts an argument
    * that is stored in the Number field.
    */
   
   public void setNumber(int num2){
       number = num2;
   }
   
   /**
    * The getNumber method returns the
    * value stored in the number field.
    */
   
   public int getNumber(){
       return number;
   }
   
}
