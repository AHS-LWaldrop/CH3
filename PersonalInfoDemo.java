
/**
 * Lucas Waldrop
 * CH3PC3
 * Programming III - AP CS
 * 10/2/18
 */
public class PersonalInfoDemo {

    public static void main(String[] args) {

        PersonalInfo Me = new PersonalInfo("Lucas", "Northern Ave", 307, 17, 724, 5254497);
        System.out.println("Name: " + Me.getName());
        System.out.println("Address: " + Me.getAddressNumber() + " " + Me.getAddressLetter());
        System.out.println("Age: " + Me.getAge());
        System.out.println("Phone Number: " + Me.getAreaCode() + Me.getNumber());

        PersonalInfo Fitz = new PersonalInfo("Richard", "Toy Road", 2287, 16, 724, 7933119);
        System.out.println("Name: " + Fitz.getName());
        System.out.println("Address: " + Fitz.getAddressNumber() + " " + Fitz.getAddressLetter());
        System.out.println("Age: " + Fitz.getAge());
        System.out.println("Phone Number: " + Fitz.getAreaCode() + Fitz.getNumber());

        PersonalInfo Maddi = new PersonalInfo("Maddison", "Schall Hollow", 378, 15, 724, 2129661);
        System.out.println("Name: " + Maddi.getName());
        System.out.println("Address: " + Maddi.getAddressNumber() + " " + Maddi.getAddressLetter());
        System.out.println("Age: " + Maddi.getAge());
        System.out.println("Phone Number: " + Maddi.getAreaCode() + Maddi.getNumber());

    }
}
