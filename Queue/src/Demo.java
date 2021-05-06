public class Demo {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.printQueue();
        q1.deQueue();
        q1.printQueue();
    }
}
