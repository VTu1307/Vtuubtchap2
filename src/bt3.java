import java.util.Random;
public class bt3 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("so nguyen ngau nhien : " +random.nextInt());
        System.out.println("so nguyen ngau nhien tu 1 toi 99 : " +random.nextInt(100));
        System.out.println("so thuc ngau nhien tu 0.0 den 1.0 : " +random.nextDouble(1.0));
        System.out.println("gia tri boolean ngau nhieu : "+random.nextBoolean());
        System.out.println("so thuc fload ngau nhien tu 0.0 den 1.0 : "+random.nextFloat());
        System.out.println("so nguyen long ngau nhien "+random.nextLong());
        byte[] byteArryay = new byte[7];
        random.nextBytes(byteArryay);
        System.out.println("mang byte ngau nhien : ");
        for (byte b : byteArryay) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println("so ngau nhien phan phoi Gaussian" +random.nextGaussian());
        random.setSeed(456789L);
        System.out.println("so ngau nhien voi seed 456789L"+ random.nextInt());
        System.out.println("luong so nguyen ngau nhien : ");
        random.ints(7, 0, 50).forEach(n -> System.out.print(n + " "));
    }
}