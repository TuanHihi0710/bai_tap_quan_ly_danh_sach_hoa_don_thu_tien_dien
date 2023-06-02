public class KhachNuocNgoai extends KhachHang {
    private String quocTich;
    public KhachNuocNgoai(){
    }
    public KhachNuocNgoai(String inputMaKhachHang, int inputSoLuong, String inputHoTen, String inputNgayRaHoaDon, double inputDongia, String inputQuocTich){
        super(inputMaKhachHang,inputSoLuong,inputHoTen,inputNgayRaHoaDon,inputDongia);
        quocTich=inputQuocTich;
    }
    public String getQuocTich(){
        return quocTich;
    }
    public void setQuocTich(String inputQuocTich){
        quocTich=inputQuocTich;
    }
    public double ThanhTien(){
        double thanhTien;
        thanhTien= getSoLuong()*getDonGia();
        return thanhTien;
    }
    public String HienThiThongTinKhachNuocNgoai(){
        System.out.println("Ma khach hang: "+getMaKhachHang());
        System.out.println("So luong: "+getSoLuong());
        System.out.println("Ho ten: "+getHoTen());
        System.out.println("Ngay ra hoa don: "+getNgayRaHoaDon());
        System.out.println("Don gia: "+getDonGia());
        System.out.println("Quoc tich: "+getQuocTich());
        return "==========";
    }
}
