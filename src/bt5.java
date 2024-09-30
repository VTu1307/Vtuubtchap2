import java.util.Scanner;
public class bt5 {
    String ten;
    String masv;
    float diemtoan;
    float  diemly;
    float diemhoa;
    public void nhapthongtinsinhvien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten sinh vien");
        ten = sc.nextLine();
        System.out.println("nhap ma sinh vien sinh vien");
        masv = sc.nextLine();
        System.out.println("nhap diem toan sinh vien");
        diemtoan =sc.nextFloat();
        System.out.println("nhap diem ly sinh vien ");
        diemly =sc.nextFloat();
        System.out.println("nhap diem hoa sinh vien");
        diemhoa =sc.nextFloat();


    }
    public float diemtrungbinhsinhvien() {

        return (diemtoan + diemly + diemhoa) / 3;
    }
    public void hienthithongtiensinhvien() {
        System.out.println("thong tien sinh vien : ");
        System.out.println("diem mon toan : "+ diemtoan);
        System.out.println("diem ly sinh vien : "+ diemly);
        System.out.println("diem hoa sinh vien : "+ diemhoa);
        System.out.println("diem trung binh cua sinh vien la : " + diemtrungbinhsinhvien());



    }

    public static void main(String[] args) {
        bt5 bt = new bt5();
        bt.nhapthongtinsinhvien();
        bt.hienthithongtiensinhvien();
    }



}
