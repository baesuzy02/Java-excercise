package xaucoban;

import java.util.*;

class MonHoc {
    private String tenMonHoc;
    private int soTinChi;
    private double diem;

    public MonHoc(String tenMonHoc, int soTinChi, double diem) {
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
        this.diem = diem;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public double getDiem() {
        return diem;
    }
}

class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private List<MonHoc> danhSachMonHoc;
    private double gpa;

    public SinhVien(String maSinhVien, String hoTen, String lop) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        danhSachMonHoc = new ArrayList<>();
        gpa = 0.0;
    }
    public void themMonHoc(MonHoc monHoc) {
        danhSachMonHoc.add(monHoc);
    }

    public double tinhGPA() {
        double sum = 0.0;
        int totalCredits = 0;

        for (MonHoc monHoc : danhSachMonHoc) {
            sum += monHoc.getDiem() * monHoc.getSoTinChi();
            totalCredits += monHoc.getSoTinChi();
        }

        if (totalCredits == 0) {
            return 0.0;
        }

        return sum / totalCredits;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<SinhVien> danhSachSinhVien = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String maSinhVien = scanner.nextLine();
            String hoTen = scanner.nextLine();
            String lop = scanner.nextLine();
            int soLuongMonHoc = scanner.nextInt();
            scanner.nextLine();
            SinhVien sinhVien = new SinhVien(maSinhVien, hoTen, lop);
            for (int j = 0; j < soLuongMonHoc; j++) {
                String tenMonHoc = scanner.nextLine();
                int soTinChi = scanner.nextInt();
                double diem = scanner.nextDouble();
                scanner.nextLine();

                MonHoc monHoc = new MonHoc(tenMonHoc, soTinChi, diem);
                sinhVien.themMonHoc(monHoc);
            }

            double gpa = sinhVien.tinhGPA();
            sinhVien.setGPA(gpa);

            danhSachSinhVien.add(sinhVien);
        }

        Comparator<SinhVien> comparator = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                int gpaComparison = Double.compare(sv2.getGPA(), sv1.getGPA());
                if (gpaComparison != 0) {
                    return gpaComparison;
                } else {
                    return sv1.getMaSinhVien().compareTo(sv2.getMaSinhVien());
                }
            }
        };

        Collections.sort(danhSachSinhVien, comparator);

       
       for(int i=0; i<danhSachSinhVien.size(); i++) {
           System.out.println(danhSachSinhVien.get(i).getMaSinhVien() + " " + danhSachSinhVien.get(i).getHoTen()+ " "
                             + danhSachSinhVien.get(i).getLop()+ " " + String.format("%.2f", danhSachSinhVien.get(i).getGPA()));
           System.out.println("------------------------");
       }
    }
}