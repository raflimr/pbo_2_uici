package demo;

//Deklarasi Class OperatorPembanding
public class OperatorPembanding {

  // Inisiliasi variabel berserta nilainya
  int nilaiA = 12;
  int nilaiB = 4;
  boolean hasil;

  public void demo() {

    // apakah A lebih besar dari B?
    hasil = nilaiA > nilaiB;
    System.out.println(hasil);

    // apakah A lebih kecil dari B?
    hasil = nilaiA < nilaiB;
    System.out.println(hasil);

    // apakah A lebih besar samadengan B?
    hasil = nilaiA >= nilaiB;
    System.out.println(hasil);

    // apakah A lebih kecil samadengan B?
    hasil = nilaiA <= nilaiB;
    System.out.println(hasil);

    // apakah nilai A sama dengan B?
    hasil = nilaiA == nilaiB;
    System.out.println(hasil);

    // apakah nilai A tidak samadengan B?
    hasil = nilaiA != nilaiB;
    System.out.println(hasil);
  }
}