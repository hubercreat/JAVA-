import java.util.Scanner;
public class ShuRuShuZi {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num1 = scanner.nextInt();
        System.out.print("请输入第二个整数：");
        int num2 = scanner.nextInt();
        System.out.print("请输入第三个整数：");
        int num3 = scanner.nextInt();

        int max = Math.max(num1,Math.max(num2,num3));
        int min = Math.min(num1,Math.min(num2,num3));

        System.out.println("最大值:" + max);
        System.out.println("最小值:" + min);
    }
}
