package com.sd.game;

public class Yut{
  private int number=0;
  public void roll(){
    this.number=(int)((Math.random()*5)+1);
  }
  public int getNum(){
    return this.number;
  }
}