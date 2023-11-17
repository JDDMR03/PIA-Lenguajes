import java.util.Scanner;

public class tarea11{
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in);

    System.out.println("-------------------------------------");
    System.out.println("|    1.- Celcius a Farenheit        |");
    System.out.println("|    2.- Farenheit a Centigrados    |");
    System.out.println("-------------------------------------");
    System.out.print("Ingrese una opcion: ");

    int op=cin.nextInt();

    double celcius=0;
    double farenheit=0;

    if(op==1){
      System.out.print("Ingrese la temperatura en Celcius: ");
      celcius=cin.nextFloat();
      farenheit=((celcius*(1.8000))+32);
      System.out.println(celcius +" Grados Celcius son "+farenheit +" Grados Farenheit.");
    }
    else if(op==2){
      System.out.print("Ingrese la temperatura en Farenheit: ");
      farenheit=cin.nextFloat();
      celcius=((farenheit-32)*(0.5555));
      System.out.println(farenheit +" Grados Farenheit son "+celcius +" Grados Celcius.");
    }
    else{
      System.out.print("La opcion no es valida :(");
    }
  }
} 
