import java.util.Scanner;

public class JiSuan {
    public static void main(String[] args) {
        Scanner zm = new Scanner(System.in);
        System.out.println("输入一个整数n:");
        int n = zm.nextInt();
        int sum = 0;
        if (n < 0) {
            System.out.println("请输入正整数!");
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("f(" + n + ") = " + sum);
        }
    }
}