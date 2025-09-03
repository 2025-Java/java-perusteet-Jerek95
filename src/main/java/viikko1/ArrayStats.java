package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        // TODO
        if (arr.length == 0){
            return 0.0;
        }
        else{
            int summa = 0;
            for (int i = 0;i < arr.length; i++){
                summa += arr[i];
            }
            return summa/arr.length;
        }
        
    }
    public static int max(int[] arr) {
        // TODO
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        else{
            int arvo = arr[0];
            for (int i = 1;i < arr.length - 1; i++){
                if (arr[i] > arvo){
                    arvo = arr[i];
                }
            }
            return arvo; 
        }
        
    }
}
