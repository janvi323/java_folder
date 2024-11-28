import java.util.*;
public class userinputarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int len= sc.nextInt();
        int marks[]= new int[len];
        for (int i=0;i<len;i++)
        {
            marks[i]= sc.nextInt();
        }
        
        for(int i=0;i<len;i++)
        {
            System.out.print(marks[i]+" ");
        }
        
    }
    
}
