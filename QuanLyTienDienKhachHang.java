public class QuanLyTienDienKhachHang {
    private KhachNuocNgoai[] danhSachKhachNuocNgoai;
    private KhachHangVietNam[] danhSachKhachHangVietNam;

    public QuanLyTienDienKhachHang() {
        danhSachKhachHangVietNam = new KhachHangVietNam[5];
        danhSachKhachNuocNgoai = new KhachNuocNgoai[5];
    }

    public void NhapHoaDonKhachHangViet(String maKhachHang, int soLuong, String hoTen, String ngayRaHoaDon, double dongia, String doiTuongKhachHang, int dinhMuc) {
        KhachHangVietNam khachHangVietNam = new KhachHangVietNam(maKhachHang, soLuong, hoTen, ngayRaHoaDon, dongia, doiTuongKhachHang, dinhMuc);
        boolean check = true;
        for (int i = 0; i < danhSachKhachHangVietNam.length; i++) {
            if (danhSachKhachHangVietNam[i] == null) {
                danhSachKhachHangVietNam[i] = khachHangVietNam;
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("Hoa don da day");
        }
    }

    public void NhapHoaDonKhachHangNuocNgoai(String maKhachHang, int soLuong, String hoTen, String ngayRaHoaDon, double dongia, String quocTich) {
        KhachNuocNgoai khachNuocNgoai = new KhachNuocNgoai(maKhachHang, soLuong, hoTen, ngayRaHoaDon, dongia, quocTich);
        boolean check = true;
        for (int i = 0; i < danhSachKhachNuocNgoai.length; i++) {
            if (danhSachKhachNuocNgoai[i] == null) {
                danhSachKhachNuocNgoai[i] = khachNuocNgoai;
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("Hoa don da day");
        }
    }
    public void XuatHoaDonKhachVietNam(){
        for (int i = 0; i < danhSachKhachHangVietNam.length; i++) {
            if (danhSachKhachHangVietNam[i]!=null){
                System.out.println(danhSachKhachHangVietNam[i].HienThiThongTinKhachVietNam());
            }
        }
    }
    public void XuatHoaDonKhachNuocNgoai(){
        for (int i = 0; i < danhSachKhachNuocNgoai.length; i++) {
            if (danhSachKhachNuocNgoai[i]!= null){
                System.out.println(danhSachKhachNuocNgoai[i].HienThiThongTinKhachNuocNgoai());
            }
        }
    }
    public double TrungBinhThanhTienCuaNguoiNuocNgoai(){
        double tongTien=0;
        int count = 0;
        for (int i = 0; i < danhSachKhachNuocNgoai.length; i++) {
            if (danhSachKhachNuocNgoai[i]!=null){
                tongTien= tongTien +danhSachKhachNuocNgoai[i].ThanhTien();
                count++;
            }
        }
        return tongTien/count;
    }
    public double TongSoLuongTienDienKhachViet(){
        double tongSoLuongDien=0;
        for (int i = 0; i < danhSachKhachHangVietNam.length; i++) {
            if (danhSachKhachHangVietNam[i]!=null){
                tongSoLuongDien=tongSoLuongDien+danhSachKhachHangVietNam[i].getSoLuong();
            }
        }
        return tongSoLuongDien;
    }
    public double TongSoLuongTienDienKhachNuocNgoai(){
        double tongSoLuongDien=0;
        for (int i = 0; i < danhSachKhachNuocNgoai.length; i++) {
            if (danhSachKhachNuocNgoai[i]!=null){
                tongSoLuongDien=tongSoLuongDien+danhSachKhachNuocNgoai[i].getSoLuong();
            }
        }
        return tongSoLuongDien;
    }
    public void XuatHoaDonTrongThang9Nam2023(){
        for (int i = 0; i < danhSachKhachHangVietNam.length; i++) {
            if (danhSachKhachHangVietNam[i]!=null){
                if (danhSachKhachHangVietNam[i].getNgayRaHoaDon().contains("09/2013")) {
                    System.out.println(danhSachKhachHangVietNam[i].HienThiThongTinKhachVietNam());
                }
            }
        }
        for (int i = 0; i < danhSachKhachNuocNgoai.length; i++) {
            if (danhSachKhachNuocNgoai[i]!=null){
                if (danhSachKhachNuocNgoai[i].getNgayRaHoaDon().contains("09/2013")) {
                    System.out.println(danhSachKhachNuocNgoai[i].HienThiThongTinKhachNuocNgoai());
                }
            }
        }
    }
}
