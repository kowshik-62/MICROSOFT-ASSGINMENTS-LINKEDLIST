class MyCircularQueue {
    
    int[] queue;
    int front=0,rear=-1,len=0;
    
    public MyCircularQueue(int k) {
        queue=new int[k];
    }
    
    public boolean enQueue(int val) {
        if(len!=queue.length){
            rear=(rear+1)%queue.length;
            queue[rear]=val;
            len++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(len!=0){
            front=(front+1)%queue.length;
            len--;
            return true;
        }
        return false;
    }
    
    public int Front() {
        return isEmpty() ? -1 : queue[front];
    }
    
    public int Rear() {
        return isEmpty() ? -1 : queue[rear];
    }
    
    public boolean isEmpty() {
        return len==0;
    }
    
    public boolean isFull() {
        return len==queue.length;
    }
}
