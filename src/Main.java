import java.util.Scanner;

class Person {
    protected String ten;
    protected int tuoi;
    protected String diaChi;
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
    }
    public void hienThiThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("dia chi: " + diaChi);
    }
}
class Teacher extends Person {
    private String tenCoQuan;
    private String khoaHoc;
    public void nhapThongTinGiaoVien() {
        nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten co quan: ");
        tenCoQuan = scanner.nextLine();
        System.out.print("Nhap khoa hoc giang day: ");
        khoaHoc = scanner.nextLine();
    }
    public void hienThiThongTinGiaoVien() {
        hienThiThongTin();
        System.out.println("Ten ce quan: " + tenCoQuan);
        System.out.println("Khoa hoc giang day: " + khoaHoc);
    }
}
public class Main {
    public static void main(String[] args) {
        Teacher giaoVien = new Teacher();
        giaoVien.nhapThongTinGiaoVien();
        giaoVien.hienThiThongTinGiaoVien();
    }
}
