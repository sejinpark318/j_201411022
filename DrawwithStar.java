public class DrawwithStar{

    public void starTriangle(int size){
        String s="*";
        StringBuffer sbuf=new StringBuffer();
        for(int i=0;i<size;i++) {
            for(int j=0;j<i;j++) {
                sbuf.append(s);
            }
            System.out.printf("%d %s\n",i,sbuf.toString());
            sbuf.delete(0, sbuf.length());
        }
    }
    
    public static void main(String[] args){
        StringBuffer star = new StringBuffer("*");
        DrawwithStar ds = new DrawwithStar();
        ds.starTriangle(5);
    }

}