public class CreateArray{
    public void sumList(int[] list){
        int sum =0;
        for(int i =0; i<list.length; i++){
            if (list[i]%4==0 && list[i]%5 !=0){
                sum=sum+list[i];
            }
            
        }
        System.out.println(sum);
    
    }
    
    public static void main(String[] args){
        int[] list = new int[1000];
        
        for(int i =0; i<1000; i++){
            list[i]=i+1;
            
        }
        CreateArray ca = new CreateArray();
        ca.sumList(list);
    }
}