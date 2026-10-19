package Chuong2.bt;
import java.util.Scanner;
public class bt2 {
    public static void main(String[] args) {
        System.out.println("Nhap so mảng cần tạo: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap chiều dài của mảng: ");
            int m = sc.nextInt();
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                System.out.println("Nhap phan tu thu " + j + ": ");
                arr[j] = sc.nextInt();
            }
            System.out.println("Mảng vừa nhập là: ");
            for (int j = 0; j < m; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[j];
            }
            System.out.println("Tổng phần tử trong mảng là: " + sum);
            totalSum += sum;
        }
        System.out.println("Tổng phần tử trong tất cả các mảng là: " + totalSum);
    }
}
