import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
   int instrukcja;
    System.out.println("Podaj co liczymy:\n1-Suma i średnia\n2-coś innego ");
    instrukcja = getInt();
    switch (instrukcja) {
      case 1:
       Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe1: ");
        double a = scan.nextDouble();
         System.out.println("Podaj liczbe2: ");
        double b = scan.nextDouble();
         System.out.println("Podaj liczbe3: ");
        double c = scan.nextDouble();
        System.out.println("Podaj liczbe4: ");
        double d = scan.nextDouble();
        System.out.println("Podaj liczbe5: ");
        double e = scan.nextDouble();
      double suma = a + b+c+d+e;
        double srednia=(a+b+c+d+e)/2;
        System.out.println("Suma="  + suma + "\nśrednia=" +srednia);
        
        break;
        case 2:
        
        break;
    
 }
    
  }
   public static int getInt() {
    return new Scanner(System.in).nextInt();}
}