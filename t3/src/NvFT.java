public abstract class NvFT  extends NhanVien implements  Comparable{
    private double tienThuong;
    private double tienPhat;
    private double luongCung;

    public NvFT() {
    }

    public NvFT(String maNhanVien, String hoTen, String tuoi, String sdt, String email, String diaChi, double tienThuong, double tienPhat, double luongCung) {
        super(maNhanVien, hoTen, tuoi, sdt, email, diaChi);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }
    public double luongThucLinh() {
        return luongCung+ (tienThuong - tienPhat);
    }

    @Override
    public String toString() {
        return "NvFT{" +
                "tienThuong=" + tienThuong +
                ", tienPhat=" + tienPhat +
                ", luongCung=" + luongCung +
                '}';
    }

    @Override
    public int comparaTo(NhanVien o1, NhanVien o2) {
        if(((NvPT)o1).luongLinh()>((NvPT)o2).luongLinh()){
            return 1;
        }else if(((NvPT)o1).luongLinh()==((NvPT)o2).luongLinh()){
            return 0;
        }return -1;
    }
}
