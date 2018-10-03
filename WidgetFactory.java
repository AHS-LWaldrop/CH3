
/**
 * Lucas Waldrop
 * CH3PC6
 * Programming III - AP CS
 * 10/2/18
 */
public class WidgetFactory {

    private int widget;
    private int days;

    /**
     * The WidgetFactory constructor method initializes the fields above.
     */
    public WidgetFactory(int wid) {
        widget = wid;
    }

    /**
     * The setWidget method allows an argument that is stored in the widget
     * field.
     */
    
    public void setWidget(int wid2) {
        widget = wid2;
    }

    /**
     * The getWidget method allows the
     * value stored in the field to return.
     */
    public int getWidget() {
        return widget;
    }

    /**
     * The production method allows an argument that is stored in the widget
     * field.
     */
    
    public void Production() {
        days = widget / 160;
    }

    /**
     * The getDay method allows the value stored in the field to return.
     */
    
    public int getDay() {
        return days;
    }

    
}
