public class ifStatements{
    public static void main(String[] args) {
        int i= 25;
        int j =30;

        String name = "John";


        if (name =="John"){
            System.out.println("satya");
            
        }
        if (name.equals("John")){
            System.out.println("prasad");


            // ternary operators
            // synatx: variable = (condition) ? value_if_true : value_if_false;
            int max =(i>j)? i:j;
            System.out.println(max);
            

        }
    }
    
}