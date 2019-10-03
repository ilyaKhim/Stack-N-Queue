import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QueueTest {
    private Queue queue;
    private int[] expected;

    @Before
    public void init(){
        queue = new Queue(5);
        queue.push(5);
        queue.push(15);
        queue.push(25);
        queue.push(35);
        expected = new int[]{5,15,25,35};

    }
    @Test
    public void push() {
        queue.push(45);
        expected = new int[]{5,15,25,35,45};
        Assert.assertArrayEquals(expected,queue.arr);
    }

    @Test
    public void pop() {
        assertEquals(expected[0], queue.pop());
    }

    @Test
    public void peek() {

        assertEquals(expected[0],queue.arr[queue.head]);
    }

    @Test
    public void isEmpty() {
        assertFalse(queue.isEmpty());
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void isFull() {
        assertFalse(queue.isFull());
        queue.push(45);
        assertTrue(queue.isFull());
    }
}