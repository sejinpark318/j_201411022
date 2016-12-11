package com.sd.game;

public class Player{
  private String name=null;
  private int num=0;
  private int where=0;
  public Player(String name){
    this.name=name;
  }
  public int getNum(){
      return this.num;
  }
  public void play(){
    Yut y=new Yut();
    y.roll();
    this.num=y.getNum();
  }
  /*public int movemal(int nowWhere, int kanNum){
    String makelable;
    nowWhere = nowWhere + kanNum;
    System.out.println(nowWhere);
    makelable = List[nowWhere];
    System.out.println(makelable);
    
    for(int i = 0; i <20 ; i++){
      if (List[i]==makelable){
        JList.get(i).setIcon(smallredicon);
      }
      else if(List[i]!=makelable){
        JList.get(i).setIcon(smallicon);
      }
    }
  
    return nowWhere;
  }*/
}