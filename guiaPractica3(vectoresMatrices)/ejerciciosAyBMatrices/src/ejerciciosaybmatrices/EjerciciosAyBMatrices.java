/*
 Llevar a cabo un programa que permite cargar completamente con números 5 una matriz de 4x5 (4 filas, 5 columnas).
 */
package ejerciciosaybmatrices;

public class EjerciciosAyBMatrices {

    public static void main(String[] args) {
        /*int num = 5;
        int matriz[][] = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = num;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }*/
/*Llevar a cabo un programa que permita completar con números 1 toda la diagonal principal de una matriz de 6 x 6. 
        Entiéndase por diagonal principal aquella que comienza en [0,0] y termina en [6,6].*/

        int matriz2[][] = new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(i==j){
                    matriz2[i][j]=1;
                }else{
                    matriz2[i][j]=0;
                }
            }
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                System.out.print(" "+matriz2[i][j]);
            }
            System.out.println();
        }
    }

}
