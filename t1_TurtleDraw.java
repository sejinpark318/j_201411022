package com.j1;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

public class t1_TurtleDraw{
  static Turtle t1 = new Turtle();
  static Point2D p1 = new Point2D.Double(10.0,20.0);
  
  public static void drawSquare(int size){
    for(int i=0;i<4;i++){
      t1.forward(size);
      t1.right(90);
    }
  }
  
  public static void drawTriangle(int size){
    for(int i=0; i<3; i++){
      t1.forward(size);
      t1.right(120);
    }
  }
  
  public static void drawSquareAt(int size,double x,double y){
    t1.setPos(x,y);
    for(int i=0;i<4;i++){
      t1.forward(size);
      t1.right(90);
    }
  }
  
  public static void drawTriangleAt(int size,double x,double y){
    t1.setPos(x,y);
    for(int i=0; i<3; i++){
      t1.forward(size);
      t1.right(120);
    }
  }
  
  public static void drawStar(int size){
     for(int i=0;i<5;i++){
     t1.forward(size);
     t1.right(144);
     }
  }
  
  public static void main(String[] args){
    double x=p1.getX();
    double y=p1.getY();
    drawSquare(100);
    drawTriangle(100);
    drawSquareAt(100,x,y);
    drawTriangleAt(100,x,y);
    drawStar(100);
  }
}