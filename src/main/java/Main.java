import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double altura = sc.nextDouble();
    double massa = sc.nextDouble();
    double imc = massa / (altura * altura);

System.out.printf("o seu IMC é de %f kg/m² %n,imc");

  if( 25 < imc ) {
  System.out.println("Você esta acima do peso");
  }

  if(30 < imc ) {
   System.out.println("Você apresenta obesidade de grau 1");
  }
 sc.close();
  }
}
  
