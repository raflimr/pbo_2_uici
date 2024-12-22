package demo;

// Deklarasi Class OperatorBitWise
public class OperatorBitwise {

  // Inilisiliasi variabel dengan nilai default atau secara hardcode
  int a = 60; /* 60 = 0011 1100 */
  int b = 13; /* 13 = 0000 1101 */
  int c = 0;

  // Dekrlarasi fungsi yang bernama demo
  public void demo() {

    // AND
    c = a & b; /* 12 = 0000 1100 */
    System.out.println("a & b = " + c);

    // OR
    c = a | b; /* 61 = 0011 1101 */
    System.out.println("a | b = " + c);

    // XOR
    c = a ^ b; /* 49 = 0011 0001 */
    System.out.println("a ^ b = " + c);

    // Negasi/kebalikan
    c = ~a; /*-61 = 1100 0011 */
    System.out.println("~a = " + c);

    // Left Shift
    c = a << 2; /* 240 = 1111 0000 */
    System.out.println("a << 2 = " + c);

    // Right Shift
    c = a >> 2; /* 215 = 1111 */
    System.out.println("a >> 2  = " + c);

    // Right Shift (unsigned)
    c = a >>> 2; /* 215 = 0000 1111 */
    System.out.println("a >>> 2 = " + c);
  }
}