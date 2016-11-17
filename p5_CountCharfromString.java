public class p5_CountCharfromString{

    public void CountChar(char[] words){
        Map<String, Integer> wc = new HashMap<String, Integer>();
        String s;
        for (char c: words){
            s=Character.toString(c);
            if (wc.containsKey(s)){
                wc.put(s,wc.get(s)+1);
            }
            else{
                wc.put(s,1);
            }
        }
        System.out.println(wc);
    }
}
    
    public static void main(String[] args){
        char[] words = "SangMyung University".toCharArray();
        p5_CountCharfromString ccs = new p5_CountCharfromString();
        
        ccs.CountChar(words);
    }

}