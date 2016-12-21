public class LeapYear{ 
   public void Leap(int z[]){ 
       for (int i:z){ 
           if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)){ 
               System.out.println(i +" is a leap year!"); 
           } 
           else{ 
               System.out.println(i +" isn't a leap year!"); 
           } 

       } 

   } 
    public static void main(String[] args) { 
        int[] z = { 1800, 1900, 1969, 1997, 2000, 2008, 2016 }; 
        LeapYear l = new LeapYear(); 
        l.Leap(z); 
    } 
} 
