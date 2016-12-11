package com.sd.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.*;

public class YutStart extends Yutgame{
  static int p1where = 0;
  static int p2where = 0;
  static String makelable;
  public static void startGame1(){
    String makelable;
    Player p1=new Player("A");
    p1.play();
    if(p1.getNum()==1){
        p1where = p1where+1;
        if (p1where >20){
            alarm.setText("A won!!");
        }else{
            alarm.setText("A is do");
            System.out.println(p1where);
            makelable = List[p1where];
            System.out.println(makelable);
            for(int i = 0; i <20 ; i++){
                if (List[i]==makelable){
                    JList.get(i).setIcon(smallredicon);
                }
                else if(List[i]!=makelable){
                    JList.get(i).setIcon(smallicon);
                }
            }
        }
    }else if(p1.getNum()==2){
        p1where = p1where+2;
        if (p1where >20){
            alarm.setText("A won!!");
            
        }else{
            alarm.setText("A is gae");
            System.out.println(p1where);
            makelable = List[p1where];
            System.out.println(makelable);
            for(int i = 0; i <20 ; i++){
                if (List[i]==makelable){
                    JList.get(i).setIcon(smallredicon);
                }
                else if(List[i]!=makelable){
                    JList.get(i).setIcon(smallicon);
                }
            }
        }
    }else if(p1.getNum()==3){
        p1where = p1where+3;
        if (p1where >20){
            alarm.setText("A won!!");
            
        }else{
            alarm.setText("A is gur");
            System.out.println(p1where);
            makelable = List[p1where];
            System.out.println(makelable);
            for(int i = 0; i <20 ; i++){
                if (List[i]==makelable){
                    JList.get(i).setIcon(smallredicon);
                }
                else if(List[i]!=makelable){
                    JList.get(i).setIcon(smallicon);
                }
            }
        }
    }else if(p1.getNum()==4){
        p1where = p1where+4;
        if (p1where >20){
            alarm.setText("A won!!");
            
        }else{
            alarm.setText("A is yut");
            System.out.println(p1where);
            makelable = List[p1where];
            System.out.println(makelable);
            for(int i = 0; i <20 ; i++){
                if (List[i]==makelable){
                    JList.get(i).setIcon(smallredicon);
                }
                else if(List[i]!=makelable){
                    JList.get(i).setIcon(smallicon);
                }
            }
        }
    }else if(p1.getNum()==5){
        p1where = p1where+5;
        if (p1where >20){
            alarm.setText("A won!!");
            
        }else{
            alarm.setText("A is mo");
            System.out.println(p1where);
            makelable = List[p1where];
            System.out.println(makelable);
            for(int i = 0; i <20 ; i++){
                if (List[i]==makelable){
                    JList.get(i).setIcon(smallredicon);
                }
                else if(List[i]!=makelable){
                    JList.get(i).setIcon(smallicon);
                }
            }
        }
    }
  }
  public static void startGame2(){ 
    Player p2=new Player("B");
    p2.play();
    if(p2.getNum()==1){
        p2where = p2where+1;
        if (p2where >20){
            alarm.setText("B won!!");
            
        }else{
            alarm.setText("B is do");
            System.out.println(p2where);
            makelable = List[p2where];
            System.out.println(makelable);
            for(int i = 0; i <20 ; i++){
                if (List[i]==makelable){
                    JList.get(i).setIcon(smallblueicon);
                }
                else if(List[i]!=makelable){
                    JList.get(i).setIcon(smallicon);
                }
            }
        }

    }else if(p2.getNum()==2){
        p2where = p2where+2;
        if (p2where >20){
            alarm.setText("B won!!");
            
        }else{
            alarm.setText("B is gae");
            System.out.println(p2where);
            makelable = List[p2where];
            System.out.println(makelable);
            for(int i = 0; i <20 ; i++){
                if (List[i]==makelable){
                    JList.get(i).setIcon(smallblueicon);
                }
                else if(List[i]!=makelable){
                    JList.get(i).setIcon(smallicon);
                }
            }
        }

    }else if(p2.getNum()==3){
        p2where = p2where+3;
        if (p2where >20){
            alarm.setText("B won!!");
            
        }else{
            alarm.setText("B is gur");
            System.out.println(p2where);
            makelable = List[p2where];
            System.out.println(makelable);
            for(int i = 0; i <20 ; i++){
                if (List[i]==makelable){
                    JList.get(i).setIcon(smallblueicon);
                }
                else if(List[i]!=makelable){
                    JList.get(i).setIcon(smallicon);
                }
            }
        }

    }else if(p2.getNum()==4){
        p2where = p2where+4;
        if (p2where >20){
            alarm.setText("B won!!");
            
        }else{
            alarm.setText("B is yut");
            System.out.println(p2where);
            makelable = List[p2where];
            System.out.println(makelable);
            for(int i = 0; i <20 ; i++){
                if (List[i]==makelable){
                    JList.get(i).setIcon(smallblueicon);
                }
                else if(List[i]!=makelable){
                    JList.get(i).setIcon(smallicon);
                }
            }
        }

    }else{
        p2where = p2where+5;
        if (p2where >20){
            alarm.setText("B won!!");
            
        }else{
            alarm.setText("B is mo");
            System.out.println(p2where);
            makelable = List[p2where];
            System.out.println(makelable);
            for(int i = 0; i <20 ; i++){
                if (List[i]==makelable){
                    JList.get(i).setIcon(smallblueicon);
                }
                else if(List[i]!=makelable){
                    JList.get(i).setIcon(smallicon);
                }
            }
        }

    } 
  }
}

