import ds.Queue;

public class Demo {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.enQueue(50);
        q1.printQueue();
        q1.deQueue();
        q1.printQueue();
        q1.enQueue(60);
        q1.enQueue(70);
        q1.enQueue(80);
        q1.enQueue(90);
        q1.printQueue();
        q1.deQueue();
        q1.printQueue();
        System.out.println(q1.contains(40));
        System.out.println(q1.peek());
    }
}
