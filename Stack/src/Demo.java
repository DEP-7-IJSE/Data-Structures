public class Demo {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack();
        s1.pop();
        s1.pop();
        s1.printStack();
        int peek=s1.peek();
        System.out.println(peek);
        System.out.println(s1.contains(40));
    }
}