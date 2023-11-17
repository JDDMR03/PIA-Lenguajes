import java.util.Scanner;

public class tarea14{
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in);

    System.out.print("Ingrese la medida del vector: ");
    int n=cin.nextInt();

    int arr[];
    arr = new int[n];

    for(int i=0; i<n; i++){
      arr[i]=cin.nextInt();
    }

    System.out.print("Ingrese el numero a buscar: ");
    int x=cin.nextInt();  

    int ans=0;

    System.out.print("arr[ ");
    for(int i=0; i<n; i++){
      if(x==arr[i]){
        ans++;
      }
      System.out.print(arr[i] +" ");
    }
    System.out.println("]");

    System.out.println("El numero "+x +" aparece " +ans +" veces");
  }
}
