import java.util.Scanner;

 public class Main {

      public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);


          System.out.println ("======================================");
            System.out.println ("|Conversor de Fahrenheit para Celcius|");
              System.out.println ("======================================");

               System.out.println ("|Informe a temperatura em Fahrenheit:|");

              double F = scanner.nextDouble();
               double C = ( F - 32 ) / 1.8;

                System.out.printf ("A temperatura em Celsius é: %.1f°c%n " , C);
                System.out.print ("|_________________________________|");

                  scanner.close();





      }
 }
