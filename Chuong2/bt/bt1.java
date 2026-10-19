package Chuong2.bt;
import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        System.out.println("Nhap so phần từ mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Tổng phần tử trong mảng là: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
