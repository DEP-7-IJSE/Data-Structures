import java.util.ArrayList;
import java.util.Arrays;

public class Stack {
    private int[] dataArray;
    private int nextIndex;
    public Stack(int size) {
        dataArray=new int[size];
    }
    public void push(int data){
        dataArray[nextIndex++]=data;
    }
    public void printStack(){
        System.out.print("[");
        for(int i=nextIndex-1; i>=0; i--){
            System.out.print(dataArray[i]+", ");
        }
        System.out.println("\b\b]");
    }
    public void pop(){
        nextIndex--;
    }
}
