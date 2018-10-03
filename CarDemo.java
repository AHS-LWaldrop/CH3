
/**
 * Lucas Waldrop
 * Project
 * Programming III - AP CS
 * Date
 */
public class CarDemo {

    public static void main(String[] args) {

        Car Ford = new Car(2011, "Ford");

        for (int x = 0; x < 5; x++) {
            Ford.accelerate();
            System.out.println(Ford.getSpeed());
        }

        Ford.brake();
        System.out.println(Ford.getSpeed());
        Ford.brake();
        System.out.println(Ford.getSpeed());
        Ford.brake();
        System.out.println(Ford.getSpeed());
        Ford.brake();
        System.out.println(Ford.getSpeed());
        Ford.brake();
        System.out.println(Ford.getSpeed());

    }
}
