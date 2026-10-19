package Chuong2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Nhap so mảng: ");
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Tổng phần tử trong mảng là: ");
        int sum = 0 ;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
