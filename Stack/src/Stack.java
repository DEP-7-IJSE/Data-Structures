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
        System.out.println(Arrays.toString(dataArray));
    }
}
