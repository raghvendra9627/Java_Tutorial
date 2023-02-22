public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("good to see you");
        sb.append(" allright");
        String str = sb.toString();
        System.out.println(str);
        sb.insert(0,"feeling");
        System.out.println(sb.charAt(5));
        System.out.println(sb);
    }
}
