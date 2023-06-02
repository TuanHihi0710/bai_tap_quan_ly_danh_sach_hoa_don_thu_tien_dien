public class KhachHangVietNam extends KhachHang{
    private String doiTuongKhachHang;
    private int dinhMuc;
    public KhachHangVietNam(){
    }
    public KhachHangVietNam(String inputMaKhachHang, int inputSoLuong, String inputHoTen, String inputNgayRaHoaDon, double inputDongia, String inputDoiTuongKhachHang, int inputDinhMuc){
        super(inputMaKhachHang,inputSoLuong,inputHoTen,inputNgayRaHoaDon,inputDongia);
        doiTuongKhachHang=inputDoiTuongKhachHang;
        dinhMuc=inputDinhMuc;
    }
    public String getDoiTuongKhachHang(){
        return doiTuongKhachHang;
    }
    public int getDinhMuc(){
        return dinhMuc;
    }
    public void setDoiTuongKhachHang(String inputDoiTuongKhachHang){
        doiTuongKhachHang=inputDoiTuongKhachHang;
    }
    public void setDinhMuc(int inputDinhMuc){
        dinhMuc=inputDinhMuc;
    }
    public double ThanhTienViet(){
        double thanhTien;
        if(getSoLuong()<=getDinhMuc()){
            thanhTien=getSoLuong()*getDonGia();
        }else {
            thanhTien=getSoLuong()*getDonGia()*getDinhMuc()+(getSoLuong()-getDinhMuc())*getDonGia()*2.5;
        }
        return thanhTien;
    }
    public String HienThiThongTinKhachVietNam(){
        System.out.println("Ma khach hang: "+getMaKhachHang());
        System.out.println("So luong: "+getSoLuong());
        System.out.println("Ho ten: "+getHoTen());
        System.out.println("Ngay ra hoa don: "+getNgayRaHoaDon());
        System.out.println("Don gia: "+getDonGia());
        System.out.println("Doi tuong khach hang: "+getDoiTuongKhachHang());
        System.out.println("Dinh muc: "+getDinhMuc());
        return "==========";
    }
}
