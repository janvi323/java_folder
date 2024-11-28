import java.util.*;
public class searchelementin2darray {
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter rows and columns");
          int rows= sc.nextInt();
          int cols=sc.nextInt();
          System.out.println("enter data u want to find");
          int data=sc.nextInt();
          int count=0;
        int[][] marks= new int[rows][cols];
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
            {
                System.out.println("enter elements\n");
                marks[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
            {
                System.out.println(marks[i][j]+" ");
                
            }
            System.out.println();
        }
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
            {
                if(marks[i][j]==data)

               { 
               count++;
               System.out.print("element present at"+i+j);
       }
          
    if (count==0)
System.out.println("element not found");
}}
           
        }
        

    }
    

