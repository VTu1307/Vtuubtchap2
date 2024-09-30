public class bt4a{
    public static void main(String[] args) {
        String str="Xin chao VTu";
        System.out.println("chieu dai cua chuoi la : "+str.length());
        System.out.println("ky tu tai vi tri 9 : " + str.charAt(9));
        System.out.println("chuoi viet hoa : "+ str.toUpperCase());
        System.out.println(" chuoi tu vi tri 9 den 12 la : " +str.substring(9,12));
        System.out.println("chuoi coc chua VTu " + str.contains("VTu"));
    }
}
