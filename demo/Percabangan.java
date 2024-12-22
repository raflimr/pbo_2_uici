package demo;

import java.util.Scanner;

//Deklarasi Class Percabangan
public class Percabangan {

  public void demoIf() {
    // membuat variabel belanja dan scanner
    int belanja = 0;

    // Menerima inputan dari user     
    Scanner scan = new Scanner(System.in);

    // mengambil input
    System.out.print("Total Belanjaan: Rp ");
    belanja = scan.nextInt();

    // cek apakah dia belanja di atas 100000
    if (belanja > 100000) {
      System.out.println("Selamat, anda mendapatkan hadiah!");
    }

    System.out.println("Terima kasih...");
  }

  public void demoIfElse() {
    // membuat variabel dan scanner
    int nilai;
    String grade;
    Scanner scan = new Scanner(System.in);

    // mengambil input
    System.out.print("Inputkan nilai: ");
    nilai = scan.nextInt();

    // higung gradenya
    if (nilai >= 90) {
      grade = "A";
    } else if (nilai >= 80) {
      grade = "B+";
    } else if (nilai >= 70) {
      grade = "B";
    } else if (nilai >= 60) {
      grade = "C+";
    } else if (nilai >= 50) {
      grade = "C";
    } else if (nilai >= 40) {
      grade = "D";
    } else {
      grade = "E";
    }

    // cetak hasilnya
    System.out.println("Grade: " + grade);
  }

  public void demoSwitchCase() {
    // membuat variabel dan Scanner
    String lampu;
    Scanner scan = new Scanner(System.in);

    // mengambil input
    System.out.print("Inputkan nama warna: ");
    lampu = scan.nextLine();

    // Melakukan pengkondisian nilai lampu, berdasarkan case case yang telah dibuat
    switch (lampu) {
      case "merah":
        System.out.println("Lampu merah, berhenti!");
        break;
      case "kuning":
        System.out.println("Lampu kuning, harap hati-hati!");
        break;
      case "hijau":
        System.out.println("Lampu hijau, silahkan jalan!");
        break;
      default:
        System.out.println("Warna lampu salah!");
    }
  }
}