public class MultiplicationTable{

    
    public void Multiply(){
        int[] x ={1,2,3,4,5,6,7,8,9};
        
        for(int i:x){
            System.out.printf("%d dan start!\n",i);
            for(int j:x){
                System.out.printf("%dx%d=%d\t",i,j,i*j);
            }
            System.out.printf("\n");
        }
        
        
    }
    
    public static void main(String[] args){
        MultiplicationTable mt = new MultiplicationTable();
        mt.Multiply();    
    }
    
}