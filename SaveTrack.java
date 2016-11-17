import ch.aplu.turtle.*;

public class SaveTrack{
  
  public void drawSquareAt(int size){
    Turtle t1 = new Turtle();
    Double[] pos = new Double[2];
    
    t1.penUp();
    t1.setPos(x,y);
    t1.penDown();
    
    pos[0]=t1.getX();
    pos[1]=t1.getY();
    
    ArrayList<Double[]> posArr = new ArrayList<Double[]>();
    for(int i=0; i<4; i++){
      
      
      pos[0]=t1.getX();
      pos[1]=t1.getY();
      
      posArr.add(pos);
      
      t1.forward(size);
      t1.right(90);
      for(Double[] d:posArr)
        System.out.printf("(%.1f,%.1f)",d[0],d[1]);
        
      }
      
    }
    

  
  public static void main(String[] args){
    SaveTrack st = new SaveTrack();
    
    st.drawSquareAt(100);
  }
  
}