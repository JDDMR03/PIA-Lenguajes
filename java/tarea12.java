import java.util.Scanner;

public class tarea12{
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in);

    System.out.println("-------------------------------------");
    System.out.println("|      Convertir de pesos a:        |");
    System.out.println("|    1.- Dolar                      |");
    System.out.println("|    2.- Euro                       |");
    System.out.println("|    3.- Yen Japones                |");
    System.out.println("|    4.- Dolar de Hong Kong         |");
    System.out.println("-------------------------------------");
    System.out.print("Ingrese una opcion: ");

    int op=cin.nextInt();

    System.out.print("Ingrese los pesos: ");
    double pesos=cin.nextDouble();
    double ans=0;

    if(op==1){
      ans=(pesos*0.058);
      System.out.println(pesos +" pesos son " +ans +" Dolares");
    }
    else if(op==2){
      ans=(pesos*0.053);
      System.out.println(pesos +" pesos son " +ans +" Euros");
    }
    else if(op==3){
      ans=(pesos*8.70);
      System.out.println(pesos +" pesos son " +ans +" Yenes");
    }
    else if(op==4){
      ans=(pesos*0.45);
      System.out.println(pesos +" pesos son " +ans +" Dolares de Hong Kong");
    }
    else{
      System.out.println("Opcion invalida :(");
    }
  }
}
