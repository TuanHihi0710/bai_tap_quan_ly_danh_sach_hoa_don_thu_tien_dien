import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyTienDienKhachHang quanLyTienDienKhachHang = new QuanLyTienDienKhachHang();
        int nhap;
        do {
            System.out.println("MENU==================");
            System.out.println("Nhap vao mot so tu 1 den 4 de chon Menu:");
            System.out.println("1. Nhap xuat danh sach cac hoa don khach hang");
            System.out.println("2. Tinh tong so luong cho tung loai khach");
            System.out.println("3. Tính trung bình thành tiền của khách hàng người nước ngoài");
            System.out.println("4. Xuất ra các hoá đơn trong tháng 09 năm 2013");
            Scanner sc = new Scanner(System.in);
            Scanner scMaKhachHang = new Scanner(System.in);
            Scanner scHoTen = new Scanner(System.in);
            Scanner scDonGia = new Scanner(System.in);
            Scanner scSoLuong = new Scanner(System.in);
            Scanner scNgayRaHoaDon = new Scanner(System.in);
            Scanner scDoiTuongKhachHang = new Scanner(System.in);
            Scanner scDinhMic = new Scanner(System.in);
            Scanner scQuocTich = new Scanner(System.in);
            nhap = sc.nextInt();
            if (nhap < 0 || nhap > 4) {
                System.out.println("Nhap sai gia tri vui long nhap lai:");
            } else if (nhap==1) {
                System.out.println("1. Nhap vao hoa don khach hang Viet");
                System.out.println("2. Nhap vao hoa don khach hang Nuoc Ngoai");
                System.out.println("3. Xuat hoa don khach hang Viet");
                System.out.println("4. Xuat hoa don khach hang Nuoc Ngoai");
                int chon = sc.nextInt();
                if (chon<0 || chon>4) {
                    System.out.println("Nhap sai gia tri vui long nhap lai:");
                } else if (chon==1) {
                    System.out.println("Nhap hoa don khach hang nuoc ngoai");
                    System.out.println("Nhap vao ma khach hang");
                    String maKhachHang = scMaKhachHang.nextLine();
                    System.out.println("Nhap vao so luong");
                    int soLuong = scSoLuong.nextInt();
                    System.out.println("Nhap vao ho va ten");
                    String hoTen = scHoTen.nextLine();
                    System.out.println("Nhap vao ngay ra hoa don dd/mm/yy");
                    String ngayRaHoaDon = scNgayRaHoaDon.nextLine();
                    System.out.println("Nhap vao don gia");
                    double dongia = scDonGia.nextDouble();
                    System.out.println("Nhap vao doi tuong khach hang");
                    String doiTuongKhachHang = scDoiTuongKhachHang.nextLine();
                    System.out.println("Nhap vao dinh muc");
                    int dinhMuc = scDinhMic.nextInt();
                    quanLyTienDienKhachHang.NhapHoaDonKhachHangViet(maKhachHang,soLuong,hoTen,ngayRaHoaDon,dongia,doiTuongKhachHang,dinhMuc);
                } else if (chon==2) {
                    System.out.println("Nhap vao hoa don khach hang nuoc ngoai");
                    System.out.println("Nhap vao ma khach hang");
                    String maKhachHang = scMaKhachHang.nextLine();
                    System.out.println("Nhap vao so luong");
                    int soLuong = scSoLuong.nextInt();
                    System.out.println("Nhap vao ho va ten");
                    String hoTen = scHoTen.nextLine();
                    System.out.println("Nhap vao ngay ra hoa don dd/mm/yy");
                    String ngayRaHoaDon = scNgayRaHoaDon.nextLine();
                    System.out.println("Nhap vao don gia");
                    double dongia = scDonGia.nextDouble();
                    System.out.println("Nhap vao quoc tich");
                    String quocTich = scQuocTich.nextLine();
                    quanLyTienDienKhachHang.NhapHoaDonKhachHangNuocNgoai(maKhachHang,soLuong,hoTen,ngayRaHoaDon,dongia,quocTich);
                } else if (chon==3) {
                    System.out.println("Xuat hoa don khach hang Viet");
                    quanLyTienDienKhachHang.XuatHoaDonKhachVietNam();
                } else if (chon==4) {
                    System.out.println("Xuat hoa don khach hang nuoc ngoai");
                    quanLyTienDienKhachHang.XuatHoaDonKhachNuocNgoai();
                }
            } else if (nhap==2) {
                System.out.println("1. Tinh tong so luong dien khach hang Viet");
                System.out.println("2. Tinh tong so luong dien khach hang nguoc ngoai");
                int chonGiaTri = sc.nextInt();
                if (chonGiaTri<0||chonGiaTri>2) {
                    System.out.println("Nhap sai gia tri vui long chon lai");
                } else if (chonGiaTri==1) {
                    System.out.println("Xuat tong so luong dien khach hang Viet");
                    System.out.println(quanLyTienDienKhachHang.TongSoLuongTienDienKhachViet());
                } else if (chonGiaTri==2) {
                    System.out.println("Xuat tong so luong dien khach hang nuoc Ngoai");
                    System.out.println(quanLyTienDienKhachHang.TongSoLuongTienDienKhachNuocNgoai());
                }
            } else if (nhap==3) {
                System.out.println("Tính trung bình thành tiền của khách hàng người nước ngoài");
                System.out.println(quanLyTienDienKhachHang.TrungBinhThanhTienCuaNguoiNuocNgoai());
            } else if (nhap==4) {
                System.out.println("Xuat cac hoa don trong thang 9 nam 2013");
                quanLyTienDienKhachHang.XuatHoaDonTrongThang9Nam2023();
            }
        } while (true);
    }
}