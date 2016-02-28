import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Thomas BENABENT on 28/02/2016.
 */
public class SimpleStackImplTest {

    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl();
        System.out.println("Je suis executé avant chaqie test");
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true, simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        Assert.assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(0, simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        simpleStack.push(new Item(new String(element1+"2")));
        //La taille doit augmenter de 2
        Assert.assertEquals(2, simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(ita);
        //LA taille doit augmenter d'un item
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        //On doit retourner l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);

    }

    @Test
    public void testPeek() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.peek();
        //on ne doit pas retirer l'objet de la pile
        Assert.assertEquals(1, simpleStack.getSize());
        //on doit retrouver l'object initial
        Assert.assertTrue(o.getValue());
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

    @Test
    public void testPop() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        //On doit retirer l'objet de la pile
        Assert.assertEquals(0, simpleStack.getSize());
        //One doit retourner l'object initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }
}