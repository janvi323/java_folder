import java.util.*;
public class searchinganelementinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
       int yes=0;
      
         int marks[]= new int[len];
         for(int i=0;i<len;i++)
         {
            marks[i]= sc.nextInt();
         }
         for(int i=0;i<len;i++)
         {
            System.out.println(marks[i]);
         }
         System.out.println("enter no to search in arr");
         int data=sc.nextInt();
         for(int i=0;i<len;i++)
         {
             if(marks[i]==data) 
             { 
               yes++;
               
             } 
           
      
        }
        if(yes!=0)
        {
         System.out.println("data found");
        }
        else{
         System.out.println("data not found");
        }

    }
    
}
