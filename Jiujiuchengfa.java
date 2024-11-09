public class Jiujiuchengfa{
    public static void main(String[] args){
        for(int i=1; i<=9; i++){
            // 外循环
            for(int j=1; j<=i; j++){
                // 内循环
                System.out.print(j + "*" + i + "=" + j*i + " ");
            }
            System.out.println();
        }
    }
}
