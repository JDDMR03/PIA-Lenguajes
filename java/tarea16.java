import java.util.Scanner;

public class tarea16{
  public static void main(String[] args){
    Scanner cin = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de filas de la primer matriz: ");
    int n=cin.nextInt();
    System.out.print("Ingrese la cantidad de columnas de la primer matriz: ");
    int m=cin.nextInt();

    int n1=0;
    int m1=0;

    do{
      System.out.print("Ingrese la cantidad de filas de la segunda matriz: ");
      n1=cin.nextInt();
      System.out.print("Ingrese la cantidad de columnas de la segunda matriz: ");
      m1=cin.nextInt();

      if(n1!=n || m1!=m){
        System.out.println("Las matrices deben ser del mismo tamano");
      }
    }while(n1!=n || m1!=m);

    int mat[][];
    mat=new int[n][m];

    int mat1[][];
    mat1=new int[n][m];

    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        mat[i][j]=cin.nextInt();
      }
    }

    System.out.println();

    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        mat1[i][j]=cin.nextInt();
      }
    }

    System.out.println();

    System.out.println("mat["+n+"]["+m+"]");
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        System.out.print(mat[i][j]+" ");  
      }
      System.out.println();
    } 

    System.out.println();

    System.out.println("mat1["+n+"]["+m+"]");
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        System.out.print(mat1[i][j]+" ");  
      }
      System.out.println();
    }

    System.out.println();

    System.out.println("suma["+n+"]["+m+"]");
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        System.out.print((mat[i][j]+mat1[i][j])+" ");  
      }
      System.out.println();
    }
    

  }
}
