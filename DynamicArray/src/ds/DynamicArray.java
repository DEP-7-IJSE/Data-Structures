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

    }
    public void remove(int index){
        int[] temp=new int[dataArray.length-1];
        for (int i = 0; i < index; i++) {
            temp[i]=dataArray[i];
        }
        for (int i = 0; i < temp.length; i++) {
            temp[index+i]=dataArray[index+i+1];
        }
        dataArray=temp;
    }
    public void get(int index){

    }
    public void print(){

    }
    public void clear(){

    }
    public int size(){
        return 0;
    }
    public boolean contains(int data){
        return false;
    }
    public boolean isEmpty(){
        return false;
    }
}
