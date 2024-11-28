public class towerofhanoi {
    public static void toi(int n,String s,String d,String h) {
        if (n == 0) {
            return ;// base case to terminate recursion
        }
        toi(n-1,s,d,h);
        System.out.println("transfer disk "+n+" from "+s+" to "+d);
        toi(n-1,h,s,d);
    }
    public static void main(String artgs[])
    {
       
        toi(0,"source","destination","helper");
    }
}
