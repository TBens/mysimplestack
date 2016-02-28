package dcll.tben.MySimpleStack;

import java.util.EmptyStackException;

/**
 * Created by Thomas BENABENT on 28/02/2016.
 */
public interface SimpleStack {

    public boolean isEmpty();

    public int getSize();

    public void push(Item item);

    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;
}
