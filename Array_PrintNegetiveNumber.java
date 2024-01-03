public class Array_PrintNegetiveNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, -3, 8, -5};
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                System.out.print(arr[i] +"," + " ");
            }
        }
    }
}
