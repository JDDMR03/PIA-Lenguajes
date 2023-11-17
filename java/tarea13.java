import java.util.Scanner;
import java.lang.Math;

public class tarea13{
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in);

    System.out.print("Ingrese cuantos numeros quiere generar: ");
    int n = cin.nextInt();
    int aux=1;

    for(int i=1; i<=n; i++){
      System.out.print(Math.pow(i,aux)+" ");
      aux+=2;
    }
  }
}
