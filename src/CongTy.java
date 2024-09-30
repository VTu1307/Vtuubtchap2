import java.util.Scanner;
class CongTy {
    private String ten;
    private String diachi;
    private double chiphi;
    private double thunhap;
    private double loinhuan;
    public void nhapthongtincongti() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten cong ti ");
        ten=scanner.nextLine();
        System.out.println("nhap dia chi cong ti ");
        diachi = scanner.nextLine();
        System.out.println("nhap chi phi cong ti ");
        chiphi = scanner.nextDouble();
        System.out.println("nhap thu nhap cong ti ");
        thunhap = scanner.nextDouble();


    }
    public void tinhloinhan() {
        loinhuan = thunhap-chiphi;
    }
    public void hienthithongtincongti() {
        System.out.println("Thong Tin Cong Ti");
        System.out.println("ten cong ti la : "+ten);
        System.out.println("dia chi cong ti la : "+diachi);
        System.out.println("thu nhap cong ti la : "+thunhap);
        System.out.println("chi phi cong ti la : "+chiphi);
        System.out.println("loi nhuan cong ti la : "+loinhuan);




    }

    public static void main(String[] args) {
        CongTy congTy = new CongTy();
        congTy.nhapthongtincongti();
        congTy.tinhloinhan();
        congTy.hienthithongtincongti();



    }

}