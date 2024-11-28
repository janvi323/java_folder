import java.util.*;
class ssolution{
    public static void main (String args[])
    {
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();int rev=0;int ognum=num;
        while(num>0)
        {
            int rem=num%10;
            rev=rem+rev*10;
            num=num/10;
            

        }
        if(ognum==rev)
        {System.out.println("true");}
        else{
            System.out.println("false");
        }


}}