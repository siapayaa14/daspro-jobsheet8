import java.util.Scanner;
public class Tugas226 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nilai n (minimal 3) = ");
        int n = sc.nextInt();

        int totalAngka = 0;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++) {
                int hasilKali = i*j;
                System.out.printf("%4d", hasilKali);
                totalAngka += hasilKali;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + totalAngka);
        sc.close();
    }
}