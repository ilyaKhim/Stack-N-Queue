public class Queue implements AbstractStructure {
    private int maxSize;
    private int items;
    protected int[] arr;
    protected int head;
    protected int tail;
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        items = 0;
        arr = new int[maxSize];
        head = 0;
        tail = -1;
    }

    @Override
    public void push(int value) {
        if(!this.isFull()){
            if(tail == maxSize-1) tail=-1;
            arr[++tail]=value;
            this.items++;
        } else System.out.println("Очередь полна. Подождите на улице");
    }

    @Override
    public int pop() {
        int temp = arr[head++];
        if(head==maxSize) head=0;
        items--;
        return temp;
    }

    @Override
    public int peek() {
        return arr[head];
    }

    @Override
    public boolean isEmpty() {
        return items==0;
    }

    @Override
    public boolean isFull() {
        return items==maxSize;
    }

    public void view(){
        for (int i = 0; i<this.maxSize; i++,head++){
            System.out.printf("%d ",arr[head]);
        }
    }
}
