package C3.bt;

public class bt2 {
    public static void main(String[] args) {
        TamGiac tg1 = new TamGiac(new Diem(0, 0), new Diem(3, 0), new Diem(0, 4));
        TamGiac tg2 = new TamGiac(new Diem(1, 1), new Diem(5, 1), new Diem(1, 4));

        ChuNhat cn1 = new ChuNhat(4, 3);
        ChuNhat cn2 = new ChuNhat(10, 5);

        HinhTron ht1 = new HinhTron(new Diem(0, 0), 5);
        HinhTron ht2 = new HinhTron(new Diem(2, 3), 2.5);

        System.out.println("=== Tam giac ===");
        System.out.println("Tam giac 1 - Chu vi: " + tg1.chuVi() + ", Dien tich: " + tg1.dienTich());
        System.out.println("Tam giac 2 - Chu vi: " + tg2.chuVi() + ", Dien tich: " + tg2.dienTich());

        System.out.println("=== Chu nhat ===");
        System.out.println("Chu nhat 1 - Chu vi: " + cn1.chuVi() + ", Dien tich: " + cn1.dienTich());
        System.out.println("Chu nhat 2 - Chu vi: " + cn2.chuVi() + ", Dien tich: " + cn2.dienTich());

        System.out.println("=== Hinh tron ===");
        System.out.println("Hinh tron 1 - Chu vi: " + ht1.chuVi() + ", Dien tich: " + ht1.dienTich());
        System.out.println("Hinh tron 2 - Chu vi: " + ht2.chuVi() + ", Dien tich: " + ht2.dienTich());
    }
}

class TamGiac {
    private Diem A;
    private Diem B;
    private Diem C;

    public TamGiac(Diem A, Diem B, Diem C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    private double khoangCach(Diem P, Diem Q) {
        double dx = Q.getX() - P.getX();
        double dy = Q.getY() - P.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double chuVi() {
        return khoangCach(A, B) + khoangCach(B, C) + khoangCach(C, A);
    }

    public double dienTich() {
        double a = khoangCach(B, C);
        double b = khoangCach(A, C);
        double c = khoangCach(A, B);
        double p = chuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

class ChuNhat {
    private double dai;
    private double rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double chuVi() {
        return 2 * (dai + rong);
    }

    public double dienTich() {
        return dai * rong;
    }
}

class HinhTron {
    private Diem O;
    private double banKinh;

    public HinhTron(Diem O, double banKinh) {
        this.O = O;
        this.banKinh = banKinh;
    }

    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
