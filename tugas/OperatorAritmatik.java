package tugas;
import java.util.Scanner; // Mengimpor built-in package

public class OperatorAritmatik {

    // Inisialisasi variabel
    int angka1;
    int hasil;

    public void menghitungFaktorial() {
        // Menerima inputan dari user
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        angka1 = keyboard.nextInt(); // Membaca input user

        hasil = 1; // Nilai awal faktorial
        System.out.print("Proses: ");
        
        for (int i = angka1; i >= 1; i--) {
            hasil *= i; // Mengalikan hasil dengan i
            System.out.print(i); // Menampilkan angka yang sedang dihitung
            if (i > 1) {
                System.out.print(" x "); // Menambahkan tanda 'x' di antara angka
            }
        }

        System.out.println("\nHasil faktorial dari " + angka1 + " adalah: " + hasil);
    }


}
