public class KhachHang {
    private String maKhachHang;
    private int soLuong;
    private String hoTen;
    private String ngayRaHoaDon;
    private double donGia;
    public KhachHang(){
    }
    public KhachHang(String inputMaKhachHang, int inputSoLuong, String inputHoTen, String inputNgayRaHoaDon, double inputDongia){
        maKhachHang=inputMaKhachHang;
        soLuong=inputSoLuong;
        hoTen=inputHoTen;
        ngayRaHoaDon=inputNgayRaHoaDon;
        donGia=inputDongia;
    }
    public String getMaKhachHang(){
        return maKhachHang;
    }
    public int getSoLuong(){
        return soLuong;
    }
    public String getHoTen(){
        return hoTen;
    }
    public String getNgayRaHoaDon(){
        return ngayRaHoaDon;
    }
    public double getDonGia(){
        return donGia;
    }
    public void setMaKhachHang(String inputMaKhachHang){
        maKhachHang=inputMaKhachHang;
    }
    public void setSoLuong(int inputSoLuong){
        soLuong=inputSoLuong;
    }
    public void setDonGia(double inputDonGia){
        donGia=inputDonGia;
    }
    public void setHoTen(String inputHoTen){
        hoTen=inputHoTen;
    }
    public void setNgayRaHoaDon(String inputNgayRaHoaDon){
        ngayRaHoaDon=inputNgayRaHoaDon;
    }
}
