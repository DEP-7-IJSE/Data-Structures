import ds.DynamicArray;

public class Demo {
    public static void main(String[] args) {
        DynamicArray d1=new DynamicArray();
        d1.add(10);
        d1.add(20);
        d1.add(30);
        d1.add(40);
        d1.print();
        d1.add(2,50);
        d1.print();
        d1.remove(2);
        d1.print();
        System.out.println(d1.get(2));
        System.out.println(d1.contains(30));
        System.out.println(d1.contains(100));
        System.out.println(d1.size());
    }
}
