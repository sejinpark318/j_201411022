class Player{
  private String name=null;
  private int num=0;
  public Player(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }
  public int getNum(){
    return this.num;
  }
  public void play(){
    Dice d=new Dice();
    d.roll();
    num=d.getNum();
  }
}