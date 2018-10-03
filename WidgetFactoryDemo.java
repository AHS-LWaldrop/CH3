/**
 * Lucas Waldrop
 * CH3PC6
 * Programming III - AP CS
 * 10/3/18
 */
public class WidgetFactoryDemo {

    public static void main(String[] args) {
        
        WidgetFactory Jimmy = new WidgetFactory(500);
        Jimmy.Production();
        System.out.println(Jimmy.getDay());
    }

}
