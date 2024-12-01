import java.util.Scanner;
public class PenjumlahanRekursif {
    static int hitungPenjumlahan(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1;
        } else {
            int hasil = hitungPenjumlahan(n - 1);
            System.out.print( "+" + n);
            return n + hasil;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Masukkan bilangan: ");
        n = sc.nextInt();

        System.out.print("Maka angka yang dihasilkan " + n + " ialah ");
        int hasil = hitungPenjumlahan(n);

        System.out.println(" = " + hasil);
    }
}