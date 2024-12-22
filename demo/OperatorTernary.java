package demo;

//Deklarasi Class OperatorTernary
public class OperatorTernary {

  // Inisilisasi variabel
  boolean suka = true;
  String jawaban;

  public void demo() {

    // menggunakan operator ternary
    jawaban = suka ? "iya" : "tidak";

    // menampilkan jawaban
    System.out.println(jawaban);

  }
}