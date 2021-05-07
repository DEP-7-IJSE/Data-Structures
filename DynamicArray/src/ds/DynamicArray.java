package ds;

public class DynamicArray {
    private int[] dataArray;

    public void add(int data){
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
    public void add(int index,int data){
        if(isEmpty()){
            dataArray=new int[1];
            dataArray[0]=data;
        }else{
            int[] temp = new int[dataArray.length+1];
            for (int i = 0; i < index; i++) {
                temp[i]=dataArray[i];
            }
            temp[index]=data;
            for (int i = index+1; i < temp.length; i++) {
                temp[i]=dataArray[i-1];
            }
            dataArray=temp;
        }
    }
    public void remove(int index){
        int[] temp=new int[dataArray.length-1];
        for (int i = 0; i < index; i++) {
            temp[i]=dataArray[i];
        }
        for (int i = index; i < temp.length; i++) {
            temp[i]=dataArray[i+1];
        }
        dataArray=temp;
    }
    public int get(int index){
        for (int i = 0; i < dataArray.length; i++) {
            if(dataArray[i]==dataArray[index]){
                return dataArray[i];
            }
        }
        return -1;
    }
    public void print(){
        System.out.print("[");
        for(int i=dataArray.length-1; i>=0; i--){
            System.out.print(dataArray[i]+", ");
        }
        System.out.println(isEmpty() ? "empty]":"\b\b]");
    }
    public void clear(){
        dataArray=null;
    }
    public int size(){
        return isEmpty() ? 0 : dataArray.length;
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
    public boolean isEmpty(){
        return dataArray==null;
    }
}
