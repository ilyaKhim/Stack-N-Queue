import java.util.Arrays;

public class Stack implements AbstractStructure {
    private int maxSize;
    int[] arr;
    private int top;
    Stack(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        this.top = -1;
    }

    @Override
    public void push(int value) {
        if(!isFull()){
            this.arr[++top] = value;
        }
        else System.out.println("Стек полон");
    }

    @Override
    public int pop() {
        return this.arr[this.top--];
    }

    @Override
    public int peek() {
        return this.arr[this.top];
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
        System.out.println(Arrays.toString(Arrays.copyOfRange(this.arr, 0,top+1)));
    }


}
