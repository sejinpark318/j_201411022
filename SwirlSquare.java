import ch.aplu.turtle.*;
public class SwirlSquare{
    public void makeSwirlSquare(){
        Turtle t1= new Turtle();
        int sides =10;
        int size =5;
        int bigger =15;
        double degree = 90.0;
        
        for(int i = 0; i<10; i++){
            if(i%2!=0){
                size+=bigger;
            }
            t1.forward(size);
            t1.right(degree);
        }
    }
    
    public static void main(String[] args){
        SwirlSquare s = new SwirlSquare();
        s.makeSwirlSquare();
    }
}