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
    public void push() {
        stack.push(50);
        expected = new int[]{10,20,30,40,50};
        Assert.assertArrayEquals(expected, stack.stack);
    }

    @Test
    public void pop() {
        stack.pop();
        expected = new int[]{10,20,30,40};
        Assert.assertArrayEquals(expected, stack.stack);
    }

    @Test
    public void peek() {
        stack.peek();
        expected = new int[]{10,20,30,40,50};
        Assert.assertArrayEquals(expected, stack.stack);
    }

    @Test
    public void isEmpty() {
        Assert.assertEquals(false, stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        Assert.assertEquals(true, stack.isEmpty());
    }

    @Test
    public void isFull() {

    }
}