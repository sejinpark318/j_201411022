public class MultipleSum{

    public int MSTwoNum(int num1, int num2){
        int sum=0;
        for(int i=0;i<1000;i++){
            if(i%num1==0 || i%num2==0){
                sum=+i;
            }
            else if (i%num1==0&& i%num2==0){
                sum=-i;
            }
        }
        return sum;
    }
    
    public static void main(String[] args){
        MultipleSum ms = new MultipleSum();
        System.out.println(ms.MSTwoNum(3,5));
    }

}