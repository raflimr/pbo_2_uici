package demo;
import java.util.Scanner; // mengambil built-in package

public class OperatorAritmatika  {

  // Inisialisasi variable
  int angka1;
  int angka2;
  int hasil;


  // Dekrlarasi fungsi yang bernama demo
  public void demo() {

        // Menerima inputan dari user 
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt(); // Menyimpan inputan user pada variable angka1
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();// Menyimpan inputan user pada variable angka2

        // penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil = " + hasil); // menampilkan hasil penjumlahan

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil = " + hasil);

         System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil = " + hasil);


        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // Pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil = " + hasil);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // Sisa Bagi
        hasil = angka1 % angka2;
        System.out.println("Hasil = " + hasil);
  }
}