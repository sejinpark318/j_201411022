import ch.aplu.turtle.*;

public class drawTorS{
  static Turtle t1= new Turtle();
  enum Shape{TRIANGLE, SQUARE};

  
  public static void drawShape(int size, int sides, double angle){
    for(int i=0; i<sides; i++){
      t1.forward(size);
      t1.right(angle);
    }
  }
  
  public static void main(String[] args){  
    int size=100;
    int sides=0;
    double angle=0.0;
    
    Shape sel = Shape.SQUARE;
    switch (sel){
      case TRIANGLE:
        sides=3;
        angle=120.0;
        break;
      case SQUARE:
        sides=4;
        angle=90.0;
        break;
    }
    
    drawShape(size, sides, angle);
  }
  
}