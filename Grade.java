public class Grade{

    
    public void GradeCal(double score){
        String grade;
        if(score>=90.0 && score<=100){
            grade="A";
            System.out.println("grade is "+grade);
        }
        else if(score>=80.0 && score<=90){
            grade="B";
            System.out.println("grade is "+grade);
        }
        else if(score>=70.0 && score<=80){
            grade="C";
            System.out.println("grade is "+grade);
        }
        else if(score>=60.0 && score<=70){
            grade="D";
            System.out.println("grade is "+grade);
        }
        else if(score<=60){
            grade="F";
            System.out.println("grade is "+grade);
        }
        
    }
    
    public static void main(String[] args){
        Grade g = new Grade();
        g.GradeCal(67.8);
    
    }
    
}