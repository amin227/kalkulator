package kalkulator;
import java.util.Scanner;

public class Tampilan {

    Scanner sc = new Scanner(System.in);

    public Tampilan() {
    }

    public void displayMenu() {
        System.out.println("Menu Kalkulator");
        System.out.println("1.Penjumlahan\n2.Pengurangan\n3.Perkalian\n0.Keluar");
    }

    public int promptMenu() {
        System.out.print("Menu yang dipilih(0-3): ");
        return sc.nextInt();
    }

    public void prompt2Operan(Data d) {
        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        int bil2 = sc.nextInt();
        d.setOperan1(bil1);
        d.setOperan2(bil2);
    }

    public void displayHasil(Data d) {
        
        System.out.println("Hasilnya adalah : "+d.getHasil());
    }

    public void displayClosing() {
    System.out.println("Terima Kasih");
    }
}
