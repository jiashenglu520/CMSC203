import java.util.Scanner;


 public class WindChill {

    public static void main(String args[]) {


     // code to declare scanner object

      Scanner sc = new Scanner(System.in);


      // code to declare all variables

      double T;

      double V;

      double windchillF;


      System.out.println("Wind Chill Calculator ");

      System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");

      // code to take user input

      T = sc.nextDouble();



      System.out.print("Enter the wind speed (must be >= 5 and <= 60): ");

      // code to take user input

      V = sc.nextDouble();


      // formula to calculate wind chill temperature and store in variable, windchillF

      windchillF=35.74 + 0.6215*T - 35.75*(Math.pow(V, 0.16)) + 0.4275*T*(Math.pow(V, 0.16));


      System.out.println("Wind chill temperature: " + windchillF + " degrees Fahrenheit.");



     System.out.println("Programmer: Jiasheng Lu");

     String name=sc.next();

     System.out.println(name);
    }
 }
