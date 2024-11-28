import java.util.*;
public class twodarray {
    public static  void main(String args[])
    {    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");

        int row = sc.nextInt();
        System.out.println("enter the columns");
        int col = sc.nextInt();
        int[][] num =new int[row][col]; 
        System.out.print("enter numbers");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               num[i][j]= sc.nextInt();
            }
        }


       for(int i=0;i<row;i++)
       {
        for(int j=0;j<col;j++)
        {
            System.out.print(num[i][j]+" ");
        }
        System.out.print("  ");
       }
    }
  
    
}
