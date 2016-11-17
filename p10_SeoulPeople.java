public class p10_SeoulPeople{

    public int SumofMan(int[][] data){
        int sum =0;
        for(int i=0; i<data.length ; i++){
            sum+=data[i][0];
        }
        return sum;
    }
    public int SumofWoman(int[][] data){
        int sum =0;
        for(int i=0; i<data.length ; i++){
            sum+=data[i][1];
        }
        return sum;
        
    }
    public double AveofMan(int[][] data){
        int sum =0;
        for(int i=0; i<data.length ; i++){
            sum+=data[i][0];
        }
        double ave = sum/data.length;
        return ave;
    }
    public double AveofWoman(int[][] data){
        int sum =0;
        for(int i=0; i<data.length ; i++){
            sum+=data[i][1];
        }
        double ave = sum/data.length;
        return ave;
    }
}

    public static void main(String[] args){
        p10_SeoulPeople sp = new p10_SeoulPeople();
        
        int[][] data={
            {74425, 76326},
            {61164, 61636},
            {109688, 115744},
            {144796, 146776},
            {174996, 181676},
            {177841, 177434},
            {204630, 205980},
            {223373, 232245},
            {161055, 166130},
            {171576, 176735},
            {279169, 293772},
            {239450, 251066},
            {148690, 156510},
            {182977, 196992},
            {237792, 242641},
            {283869, 296762},
            {209344, 210282},
            {118965, 114441},
            {186503, 186856},
            {195734, 203014},
            {254381, 249472},
            {212401, 229111},
            {271654, 295354},
            
            {319197, 335045},
            {229829, 231671}
        };
        
        System.out.println("sum of Man is "+sp.SumofMan(data));
        System.out.println("sum of Woman is "+sp.SumofWoman(data));
        System.out.println("average of Man is "+sp.AveofMan(data));
        System.out.println("average of Woman is "+sp.AveofWoman(data));
        
    }

}