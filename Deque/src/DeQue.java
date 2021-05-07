public class DeQue extends Queue{
    public void enQueueRear(int data){
        if(isEmpty()){
            dataArray=new int[1];
            dataArray[0]=data;
        }else{
            int [] temp=new int[dataArray.length+1];
            for (int i = 0; i < dataArray.length; i++) {
                temp[i+1]=dataArray[i];
            }
            temp[0]=data;
            dataArray=temp;
        }
    }

    public void deQueueFront(){

    }
}
