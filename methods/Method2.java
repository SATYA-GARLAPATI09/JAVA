public class Method2{
    public static void updateArr(int[] arr){
        arr[0]=999;

        
    }
     public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        updateArr(arr);
        System.out.println(arr[0]);
        
     }
    
}