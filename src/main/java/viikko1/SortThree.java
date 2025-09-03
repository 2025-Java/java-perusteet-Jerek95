package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        // TODO
        if (a < b && a < c){
            if (b < c){
                return a+","+b+","+c;
            }
            else{
                return a+","+c+","+b;
            }
        }
        else if (b < a && b < c){
           if (a < c){
                return b+","+a+","+c;
            }
            else{
                return b+","+c+","+a;
            } 
        }
        else{
            if (a < b){
                return c+","+a+","+b;
            }
            else{
                return c+","+b+","+a;
            }
        }
    }
}
