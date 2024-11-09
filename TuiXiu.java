import java.util.Scanner;
public class TuiXiu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入退休目标金额：");//退休金额
        double i = scanner.nextDouble();

        System.out.println("请输入每年存款金额：");//每年存款
        double j = scanner.nextDouble();

        System.out.println("请输入年利率：");//年利率
        double k = scanner.nextDouble();

        double yn = funcyn(i,j,k);

        System.out.println("需要"+yn+"年到达退休目标金额");

        scanner.close();
    }
    public static double funcyn(double i,double j,double k){
        double yn = 0;
        double lj = 0;//累计金额

        while (lj<i){
            lj += j;
            lj *= (1+k);
            yn++;
        }
        return yn;
    }
}

