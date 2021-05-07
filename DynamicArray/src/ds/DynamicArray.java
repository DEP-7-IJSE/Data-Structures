package ds;

import java.util.Arrays;

public class DynamicArray {
    private int[] dataArray;

    public void add(int data){
        add(size(),data);
    }
    public void add(int index,int data){
        if(isEmpty()){
            dataArray=new int[1];
            dataArray[0]=data;
        }else{
            if(index>size() || index<0){
              throw new RuntimeException("Invalid index");
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
    }
    public void remove(int index){
        if(index >=size() || index<0){
            throw new RuntimeException("Invalid Index");
        }else{
            int[] temp=new int[dataArray.length-1];
            for (int i = 0; i < index; i++) {
                temp[i]=dataArray[i];
            }
            for (int i = index; i < temp.length; i++) {
                temp[i]=dataArray[i+1];
            }
            dataArray=temp;
        }
    }
    public int get(int index){
        if(index >=size() || index<0){
            throw new RuntimeException("Invalid Array Index");
        }
        return dataArray[index];
    }
    public void print(){
        System.out.println(isEmpty()? "[Empty]":Arrays.toString(dataArray));
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
