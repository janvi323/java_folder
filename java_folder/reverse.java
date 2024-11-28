public class reverse {
    public static void main(String args[])
    {
        StringBuilder sb= new StringBuilder("hello janvi");
        int l= sb.length();
        for(int i=0;i<l/2;i++)
        {
            int front=i;
            int back=l - i - 1;
            char frontChar= sb.charAt(front);
            char backChar= sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        
        }
        System.out.println(sb);
    }
    
}
