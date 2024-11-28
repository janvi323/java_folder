public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(2));
        sb.insert(2,'s');
        System.out.println(sb);
       sb.delete(2,4);
       System.out.println(sb);
       sb.append("satrk");
       System.out.println(sb);
    }
}
