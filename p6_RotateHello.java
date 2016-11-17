public class p6_RotateHello{

    public void RotateWord(){
        String hello = "hello";
        char[] chArr = hello.toCharArray();
        StringBuilder olleh = new StringBuilder();
        
        for(int i =chArr.length-1; i>=0; i--){
            olleh.append(chArr[i]);
        }
        System.out.println(olleh);
    }
    
    public static void main(String[] args){
        p6_RotateHello rh = new p6_RotateHello();
        
        rh.RotateWord();
        
    }

}