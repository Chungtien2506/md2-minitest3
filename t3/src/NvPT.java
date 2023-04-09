public class NvPT extends  NhanVien implements Comparable {
    private double soGioLam;

    public NvPT() {
    }

    public NvPT(String maNhanVien, String hoTen, String tuoi, String sdt, String email, String diaChi, double soGioLam) {
        super(maNhanVien, hoTen, tuoi, sdt, email, diaChi);
        this.soGioLam = soGioLam;
    }

    public double getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(double soGioLam) {
        this.soGioLam = soGioLam;
    }
    public double luongLinh(){
        return soGioLam*1000;
    }

    @Override
    public String toString() {
        return "NvPT{" +
                "soGioLam=" + soGioLam +
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


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
