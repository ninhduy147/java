package C3.bt;

public class bt1 {
    public static void main(String[] args) {
        Diem A = new Diem(0, 0);
        Diem B = new Diem(3, 4);
        DuongThang dt = new DuongThang(A, B);

        System.out.println("Diem A: (" + dt.getA().getX() + ", " + dt.getA().getY() + ")");
        System.out.println("Diem B: (" + dt.getB().getX() + ", " + dt.getB().getY() + ")");
        System.out.println("Do dai duong thang AB: " + dt.doDai());
    }
}

class DuongThang {
    private Diem A;
    private Diem B;

    public DuongThang(Diem A, Diem B) {
        this.A = A;
        this.B = B;
    }

    public Diem getA() {
        return A;
    }

    public Diem getB() {
        return B;
    }

    public double doDai() {
        double dx = B.getX() - A.getX();
        double dy = B.getY() - A.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
