
public class Stack {
    private int[] dataArray;

    public void push(int data){
        if(isEmpty()){
            dataArray=new int[1];
            dataArray[0]=data;
        }else{
            int [] temp=new int[dataArray.length+1];
            for (int i = 0; i < dataArray.length; i++) {
                temp[i]=dataArray[i];
            }
            temp[temp.length -1]=data;
            dataArray=temp;
        }
    }
    public void printStack(){
        System.out.print("[");
        for(int i=dataArray.length-1; i>=0; i--){
            System.out.print(dataArray[i]+", ");
        }
        System.out.println(isEmpty() ? "empty]":"\b\b]");
    }
    public boolean isEmpty(){
        return dataArray==null;
    }
    public void pop(){
        if(isEmpty()){
            System.err.println("[Can't pop from empty Array]");
        }else if(dataArray.length==1){
            dataArray = null;
            return;
        }else{
            int [] temp=new int[dataArray.length-1];
            for (int i = 0; i < temp.length; i++) {
                temp[i]=dataArray[i];
            }
            dataArray=temp;
        }
    }
    public void clear(){
        dataArray = null;
    }
    public int peek(){
        return isEmpty() ? -1 : dataArray[dataArray.length-1];
    }
    public boolean contains(int data){
        for (int i = 0; i < dataArray.length; i++) {
            if(dataArray[i]==data){
                return true;
            }
        }
        return false;
    }
    public int size(){
        return isEmpty() ? 0 : dataArray.length;
    }
}