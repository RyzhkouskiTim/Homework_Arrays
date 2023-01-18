import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число первого элемента");
        int a = sc.nextInt();
        System.out.println("Введите число второго элемента");
        int b = sc.nextInt();
        System.out.println("Введите число третьего элемента");
        int c = sc.nextInt();
        int [][][] myArray = new int[a][b][c];
        System.out.println("На сколько нужно увеличить?");
        int n= sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    myArray [i][j][k]=k+n;
                    System.out.println(k+n+"");
                }
                System.out.println();
            }
        }
    }
}