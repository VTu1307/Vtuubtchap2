import java.util.Scanner;

public class SinhVien {
    // Thuộc tính
    String ten;
    String maSinhVien;
    float diemToan;
    float diemLy;
    float diemHoa;

    // Phương thức để nhập thông tin sinh viên
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên: ");
        ten = scanner.nextLine();

        System.out.print("Nhập mã sinh viên: ");
        maSinhVien = scanner.nextLine();

        System.out.print("Nhập điểm Toán: ");
        diemToan = scanner.nextFloat();

        System.out.print("Nhập điểm Lý: ");
        diemLy = scanner.nextFloat();

        System.out.print("Nhập điểm Hóa: ");
        diemHoa = scanner.nextFloat();
    }

    // Phương thức để tính điểm trung bình
    public float tinhDiemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    // Phương thức để hiển thị thông tin sinh viên
    public void hienThiThongTin() {
        System.out.println("Thông tin sinh viên:");
        System.out.println("Tên sinh viên: " + ten);
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Lý: " + diemLy);
        System.out.println("Điểm Hóa: " + diemHoa);
        System.out.println("Điểm trung bình: " + tinhDiemTrungBinh());
    }

    public static void main(String[] args) {
        // Tạo đối tượng sinh viên
        SinhVien sinhVien = new SinhVien();

        // Nhập thông tin sinh viên
        sinhVien.nhapThongTin();

        // Hiển thị thông tin sinh viên và tính điểm trung bình
        sinhVien.hienThiThongTin();
    }
}
