public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien danhsach = new QuanLyNhanVien();
        danhsach.addFT("1", "a", "1", "123456", "tien25@gmail.com", "hung yen",
                1200, 12, 45);

        danhsach.addFT("2", "b", "2", "123456", "tien25@gmail.com", "hung yen",
                1400, 12, 7);

        danhsach.addFT("3", "c", "3", "123456", "tien25@gmail.com", "hung yen",
                2000, 11, 43);

        danhsach.addFT("4", "d", "4", "123456", "tien25@gmail.com", "hung yen",
                1000, 14, 45);

        danhsach.addFT("5", "e", "5", "123456", "tien25@gmail.com", "hung yen",
                900, 21, 94);

        danhsach.themNVPT("6", "f", "6", "123456", "tien25@gmail.com", "hung yen",
                12);
        danhsach.themNVPT("7", "g", "7", "123456", "tien25@gmail.com", "hung yen",
                10);
        danhsach.themNVPT("8", "h", "8", "123456", "tien25@gmail.com", "hung yen",
                9);
        danhsach.themNVPT("9", "i", "9", "123456", "tien25@gmail.com", "hung yen",
                6);
        danhsach.themNVPT("9", "k", "10", "123456", "tien25@gmail.com", "hung yen",
                6);

        danhsach.hienthi();

        System.out.println(danhsach.luongTrungBinh());
        danhsach.nvUnderLuongTB();
        System.out.println(danhsach.tongLuongNvpt());
        danhsach.suaNVFT("2","chi","29","0967865","tien123@gmail.com",
                "ca mau",1500,40,12);
        danhsach.hienthi();
        System.out.println(danhsach.luongTrungBinh());
        danhsach.xoaNhanVien("4");
        danhsach.hienthi();
        danhsach.nvUnderLuongTB();
        danhsach.sapXepnvft();

    }
    }

