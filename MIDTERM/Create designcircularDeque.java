class MyCircularDeque {
    class Node{
        Node prev;
        Node next;
        int val;
        public Node(int val){
            this.val=val;
        }
    }
    int size=0;
    int k=0;
    Node head;
    Node tail;

    public MyCircularDeque(int k) {
        head=new Node(-1);
        tail=new Node(-1);
        head.next=tail;
        tail.prev=head;
        this.size=0;
        this.k=k;
    }

    public boolean insertFront(int val) {
        if(isFull()) return false;
        Node node = new Node(val);
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
        size++;
        return true;
    }

    public boolean insertLast(int val) {
        if(isFull()) return false;
        Node node = new Node(val);
        node.next = tail;
        node.prev = tail.prev;
        tail.prev.next = node;
        tail.prev = node;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if(isEmpty()) return false;
        head.next.next.prev = head;
        head.next = head.next.next;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if(isEmpty()) return false;
        System.out.println(tail.prev.val);
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;
        size--;
        return true;
    }

    public int getFront() {
        return head.next.val;
    }

    public int getRear() {
        return tail.prev.val;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==k;
    }
}
