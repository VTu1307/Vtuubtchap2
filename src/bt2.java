public class bt2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("xin chao ");
        sb.append("tu");
        System.out.println("after append: "+ sb);
        sb.insert(8, " java ");
        System.out.println("after insert: "+ sb);
        sb.delete(9,15);
        System.out.println("after delete: "+ sb);
        sb.reverse();
        System.out.println("after reverse: "+ sb);
        sb.reverse();
        sb.replace(9,11, "VTuhihihi");
        System.out.println("after replace: "+ sb);
        String sub =sb.substring(9,18);
        System.out.println( "substring:"+sub);
        char ch =sb.charAt(9);
        System.out.println( "charAt:"+ch);
        sb.setCharAt(2,'a');
        System.out.println("after setCharAt : "+ sb);
        int cap=sb.capacity();
        System.out.println( "capacity:"+cap);
        int len=sb.length();
        System.out.println( "length:"+len);





    }
}
