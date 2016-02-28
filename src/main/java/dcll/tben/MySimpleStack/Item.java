package dcll.tben.MySimpleStack;

/**
 * Created by Thomas BENABENT on 28/02/2016.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }

    /**
     * J'ai modifié ça
     * @return
     */

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
