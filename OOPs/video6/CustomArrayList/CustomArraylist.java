package OOPs.video5;

public class vid6 {
    // Costum Arraylist
    private int [] data;
    private static int DEFUALT_SIZE= 10;
    private int size= 0;

    public void CustomArraylist(){
        this.data=new int[DEFUALT_SIZE];
    }

    public void add(int num){
        if (ifFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
    }

    private boolean ifFull() {
        return size==data.length;
    }

    public int remove(){
        int removed=data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index, int value){
        data[index]= value;
    }

    public static void main(String[] args) {
        CustomArraylist list =new CustomArraylist();
    }


}
