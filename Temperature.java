public class Temperature{
    String symbol;
    double temp;
    double result =0;
    
    public void convertTemperature(double temp, String symbol){
        if(symbol.equals("F")){
            result = (5.0/9*(temp-32));
            System.out.println(temp+symbol+"converted to"+result+"C");
        }
        else if(symbol.equals("C")){
            result = ((temp*1.8)+32);
            System.out.println(temp+symbol+"converted to"+result+"F");
        }
    }
    
    public static void main(String[] args){
        Temperature t = new Temperature();
        t.convertTemperature(180,"F");
        t.convertTemperature(35,"C");
    
    }
    
}