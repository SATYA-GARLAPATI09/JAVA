public class practiceQ2{
    public static void main(String[] args) {
        int Arr [] ={12,45,67,23,9};
        int max = Arr[0];
        for (int i=0;i<5;i++){
            if(max<Arr[0]){
                max = Arr[0];
            }
            else if(max<Arr[1]){
                max = Arr[1];
            }
            else if(max<Arr[2]){
                max = Arr[2];
            }
            else if(max<Arr[3]){
                max = Arr[3];
            }
            else if(max<Arr[4]){
                max = Arr[4];
            }
            else {
                System.out.println("satya");
                
            }

        }
        System.out.println("Largest element is "+max);
        

    }
    
}