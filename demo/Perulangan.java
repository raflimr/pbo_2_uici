package demo;

import java.util.Scanner;

// Deklarasi Class perulangan
public class Perulangan {

  boolean suka = true;
  String jawaban;

  public void demoFor() {

    System.out.print("Demo For \n");
    for (int i = 0; i <= 10; i++) {
      System.out.print(i + " \n");
    }

  }

  public void demoForEach() {
    // membuat array
    int angka[] = { 3, 1, 42, 24, 12 };

    // menggunakan perulangan For each untuk menampilkan angka
    System.out.print("Demo ForEach \n");
    for (int x : angka) {
      System.out.print(x + " \n");
    }
  }

  public void demoWhile() {
    // membuat variabel dan scanner
    boolean running = true;
    int counter = 0;
    String jawab;
    Scanner scan = new Scanner(System.in);

    while (running) {
      System.out.println("Apakah anda ingin keluar?");
      System.out.print("Jawab [ya/tidak]> ");

      jawab = scan.nextLine();

      // cek jawabnnya, kalau ya maka berhenti mengulang
      if (jawab.equalsIgnoreCase("ya")) {
        running = false;
      }

      counter++;
    }

    System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
  }

  public void demoDoWhile() {
    // membuat variabel
    int i = 0;

    do {
      System.out.println("perulangan ke-" + i);
      i++;
    } while (i <= 10);
  }

}