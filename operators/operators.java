public class operators{
    public static void main(String[] args) {
        // augmentes arthmetic operators 
        int x= 9;
        int y = 10;

        x+=y;
        System.out.println(x);

        x-=y;
        System.out.println(x);
        x*=y;
        System.out.println(x);
        x/=y;
        System.out.println(x);
        x%=y;
        x++;
        System.out.println(x);

        // order of operations [P-E-M-D-A-S]
        
        double result = 3+4*(7/4)-3;
        System.out.println(result);
        

        
    }
    
}