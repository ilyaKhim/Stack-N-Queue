import java.util.Arrays;

public class Stack implements AbstractStructure {
    private int maxSize;
    int[] stack;
    private int top;
    Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.top = -1;
    }

    @Override
    public void push(int value) {
        if(!isFull()){
            this.stack[++top] = value;
        }
        else System.out.println("Стек полон");
    }

    @Override
    public int pop() {
        return this.stack[this.top--];
    }

    @Override
    public int peek() {
        return this.stack[this.top];
    }

    @Override
    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public boolean isFull() {
        return this.top == this.maxSize-1;

    }
    void view(){
        System.out.println(Arrays.toString(Arrays.copyOfRange(this.stack, 0,top+1)));
    }


}
