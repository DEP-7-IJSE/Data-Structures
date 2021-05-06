
public class Stack {
    private int[] dataArray;
    private int nextIndex;
    public void push(int data){
        dataArray=new int[nextIndex++];
        dataArray[nextIndex++]=data;
    }
    public void printStack(){
        System.out.print("[");
        for(int i=nextIndex-1; i>=0; i--){
            System.out.print(dataArray[i]+", ");
        }
        System.out.println(isEmpty() ? "empty]":"\b\b]");
    }
    public void pop(){
        nextIndex--;
    }
    public boolean isEmpty(){
        return nextIndex==0;
    }
    public void clear(){
        nextIndex=0;
    }
    public int peek(){
        return isEmpty() ? -1 : dataArray[nextIndex-1];
    }
}