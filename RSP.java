public class RSP{

    
    public void PlayRSP(String sel1, String sel2){
        String grade;
        if(sel1.equals("S")){
            if(sel2.equals("P")){
                System.out.println("sel1 won");
            }
            else if(sel2.equals("S")){
                System.out.println("Draw");
            }
            else if(sel2.equals("R")){
                System.out.println("sel2 won");
            }
        }
        if(sel1.equals("P")){
            if(sel2.equals("R")){
                System.out.println("sel1 won");
            }
            else if(sel2.equals("P")){
                System.out.println("Draw");
            }
            else if(sel2.equals("S")){
                System.out.println("sel2 won");
            }
        }
        if(sel1.equals("R")){
            if(sel2.equals("S")){
                System.out.println("sel1 won");
            }
            else if(sel2.equals("R")){
                System.out.println("Draw");
            }
            else if(sel2.equals("P")){
                System.out.println("sel2 won");
            }
        }
        
    }
    
    public static void main(String[] args){
        RSP rsp = new RSP();
        String sel1="S";
        String sel2="R";
        rsp.PlayRSP(sel1,sel2);
    
    }
    
}