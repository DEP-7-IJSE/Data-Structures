package ds;

public class Queue {
    protected int[] dataArray;

    public void enQueue(int data){
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
    public void deQueue(){
        if(isEmpty()){
            System.err.println("[Can't deQueue from empty Array]");
        }else if(dataArray.length==1){
            dataArray = null;
            return;
        }else {
            int temp[] = new int[dataArray.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = dataArray[i + 1];
            }
            dataArray = temp;
        }
    }
    public void clear(){
        dataArray = null;
    }
    public void printQueue(){
        if(isEmpty()){
            System.err.println("Empty ds.Queue");
        }else {
            System.out.print("[");
            for (int i = dataArray.length - 1; i >= 0; i--) {
                System.out.print(dataArray[i] + ", ");
            }
            System.out.println("\b\b]");
        }
    }
    public boolean contains(int data){
        if(isEmpty()){
            return false;
        }else{
            for (int i = 0; i < dataArray.length; i++) {
                if (dataArray[i] == data) {
                    return true;
                }
            }
        }
        return false;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("ds.Queue is empty");
        }
        return dataArray[dataArray.length-1];
    }
    public boolean isEmpty(){
        return dataArray==null;
    }
    public int size(){
        return isEmpty() ? 0 : dataArray.length;
    }
}
