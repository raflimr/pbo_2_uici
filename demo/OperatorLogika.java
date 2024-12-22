package demo;

//Deklarasi Class Operator Logika
public class OperatorLogika {
  
  // Inisiliasi variabel bertipe data Boolean berserta nilainya secara Hardcode
  boolean a = true;
  boolean b = false;
  boolean c;

  // Membuat fungsi bernama demo
  public void demo() {

    // Konjungsi, AND
    c = a && b;
    System.out.println("true && false = " + c);

    // Disjungsi, OR
    c = a || b; 
    System.out.println("true || false = " + c);

    // Negasi, NOT
    System.out.println("!a = " + !a);

  }
}