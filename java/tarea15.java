import java.util.Scanner;

public class tarea15{
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de filas: ");
    int n=cin.nextInt();
    System.out.print("Ingrese la cantidad de columnas: ");
    int m=cin.nextInt();

    int mat[][];

    mat=new int[n][m];

    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        mat[i][j]=cin.nextInt();
      }
    }

    System.out.print("Ingrese el numero a buscar: ");
    int x=cin.nextInt();

    System.out.println("mat["+n+"]["+m+"]");

    int ans=0;
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        if(x==mat[i][j]){
          ans++;
        }
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  
    System.out.println("El numero "+x +" aparece "+ans +" veces");

  }
}
