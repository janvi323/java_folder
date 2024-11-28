import java.util.*;
public class reverseno {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        int r; 
        int rev=0;
        
        while(num!=0)
        {
            
            r=num%10;
            rev= rev*10+r;
            num=num/10;
            
        }
        System.out.println(rev);

    }
}
