import java.util.ArrayList;

public class QuanLyNhanVien {
    ArrayList<NhanVien> danhsach;

    public QuanLyNhanVien() {
        danhsach = new ArrayList<>();
    }

    public void addFT(String manhanvien, String hoten, String tuoi, String sdt,
                         String mail, String diachi, double luongcung,
                         double tienthuong, double tienphat) {
        NvFT nvft = new NvFT() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        nvft.setMaNhanVien(manhanvien);
        nvft.setHoTen(hoten);
        nvft.setTuoi(tuoi);
        nvft.setSdt(sdt);
        nvft.setEmail(mail);
        nvft.setDiaChi(diachi);
        nvft.setLuongCung(luongcung);
        nvft.setTienThuong(tienthuong);
        nvft.setTienPhat(tienphat);
        danhsach.add(nvft);
    }

    public void suaNVFT(String manhanvien, String hoten, String tuoi, String sdt,
                        String mail, String diachi, double luongcung,
                        double tienthuong, double tienphat) {
        for (NhanVien i : danhsach) {
            if (i instanceof NvFT) {
                if (i.getMaNhanVien().equals(manhanvien)) {
                    i.setHoTen(hoten);
                    i.setTuoi(tuoi);
                    i.setSdt(sdt);
                    i.setEmail(mail);
                    i.setDiaChi(diachi);
                    ((NvFT) i).setLuongCung(luongcung);
                    ((NvFT) i).setTienThuong(tienthuong);
                    ((NvFT) i).setTienPhat(tienphat);
                }
            }
        }
    }


    public void themNVPT(String manhanvien, String hoten, String tuoi, String sdt,
                         String mail, String diachi, double giolamviec) {
        NvPT nvpt = new NvPT();
        nvpt.setMaNhanVien(manhanvien);
        nvpt.setHoTen(hoten);
        nvpt.setTuoi(tuoi);
        nvpt.setSdt(sdt);
        nvpt.setEmail(mail);
        nvpt.setDiaChi(diachi);
        nvpt.setSoGioLam(giolamviec);

        danhsach.add(nvpt);
    }

    public void suaNVPT(String manhanvien, String hoten, String tuoi, String sdt,
                        String mail, String diachi, double giolamviec) {
        for (NhanVien i : danhsach) {
            if (i instanceof NvPT) {
                if (i.getMaNhanVien().equals(manhanvien)) {
                    i.setHoTen(hoten);
                    i.setTuoi(tuoi);
                    i.setSdt(sdt);
                    i.setEmail(mail);
                    i.setDiaChi(diachi);
                    ((NvPT) i).setSoGioLam(giolamviec);

                }
            }
        }
    }

    public void xoaNhanVien(String manhanvien) {
        danhsach.removeIf(i -> i.getMaNhanVien().equals(manhanvien));
    }

    public void hienthi() {
        for (NhanVien i : danhsach) {
            System.out.println(i.toString());
        }
    }

    public double luongTrungBinh() {
        double sumnvft = 0;
        double sumnvpt = 0;

        for (NhanVien i : danhsach) {
            if (i instanceof NvPT) {
                sumnvft += ((NvPT) i).luongLinh();
            }
        }
        for (NhanVien i : danhsach) {
            if (i instanceof NvPT) {
                sumnvpt += ((NvPT) i).luongLinh();
            }
        }
        return (sumnvft + sumnvpt) / danhsach.size();
    }

    public void nvUnderLuongTB() {
        for (NhanVien i : danhsach) {
            if (i instanceof NvPT) {
                if (((NvPT) i).luongLinh() < luongTrungBinh()) {
                    System.out.println(i.getHoTen());
                }
            }
        }
    }

    public double tongLuongNvpt() {
        double sumnvpt = 0;
        for (NhanVien i : danhsach) {
            if (i instanceof NvPT) {
                sumnvpt += ((NvPT) i).luongLinh();
            }
        }
        return sumnvpt;
    }

    public void sapXepnvft() {
        ArrayList<NhanVien> sublist = new ArrayList<>();
        for (NhanVien i : danhsach) {
            if (i instanceof NvPT) {
                sublist.add(i);
            }
        }
    }
}
