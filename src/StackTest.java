import org.junit.*;

public class StackTest {
    private Stack stack;
    private int[] expected;
    @Before
    public void init(){
        stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

    }
    @Test
    public void Tview(){
        stack.push(50);
        stack.pop();
        stack.push(55);
        stack.view();
    }

    @Test
    public void push() {
        stack.push(50);
        expected = new int[]{10,20,30,40,50};
        Assert.assertArrayEquals(expected, stack.arr);
    }

    @Test
    public void peek() {
        stack.push(50);
        stack.peek();
        expected = new int[]{10,20,30,40,50};
        Assert.assertArrayEquals(expected, stack.arr);
    }

    @Test
    public void pop() {
        expected = new int[]{10,20,30,40};
        Assert.assertEquals(expected[expected.length-1], stack.pop());
    }

    @Test
    public void isEmpty() {
        Assert.assertFalse(stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void isFull() {
        Assert.assertFalse(stack.isFull());
        stack.push(50);
        Assert.assertTrue(stack.isFull());
    }
}