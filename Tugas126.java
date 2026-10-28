import java.util.Scanner;
public class Tugas126 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan bilangan bulat n (n minimal 1) = ");
        int n = sc.nextInt();

        int totalAngka = 0;
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                totalAngka++;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Total banyaknya angka yang dicetak =" + totalAngka);
        sc.close();
    }
}

    

