package Chuong2.bt;
import java.util.Scanner;
public class bt3 {
    public static void main(String[] args) {
        System.out.println("Nhap chuoi số nguyên để xem độ dài và tổng của chuỗi(ngăn cách bởi dấu cách): ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int n = numbers.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        System.out.println("Số phần tử của chuỗi là: ");
        System.out.println(n);
        System.out.println("Tổng của chuỗi là: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
