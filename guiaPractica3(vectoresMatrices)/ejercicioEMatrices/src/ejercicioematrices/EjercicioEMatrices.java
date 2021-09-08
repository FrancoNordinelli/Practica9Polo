package ejercicioematrices;

import java.util.Scanner;

public class EjercicioEMatrices {

    public static void main(String[] args) {
        int matriz[][] = new int[6][3];
        //carga de asientos
        matriz[0][0] = 120;
        matriz[0][1] = 15;
        matriz[0][2] = 30;
        matriz[1][0] = 65;
        matriz[1][1] = 1;
        matriz[1][2] = 2;
        matriz[2][0] = 4;
        matriz[2][1] = 52;
        matriz[2][2] = 7;
        matriz[3][0] = 46;
        matriz[3][1] = 32;
        matriz[3][2] = 16;
        matriz[4][0] = 64;
        matriz[4][1] = 23;
        matriz[4][2] = 11;
        matriz[5][0] = 61;
        matriz[5][1] = 12;
        matriz[5][2] = 91;
        Scanner tecDestino = new Scanner(System.in);
        Scanner tecTurno = new Scanner(System.in);
        Scanner tecPasajes = new Scanner(System.in);
        Scanner tecFinish = new Scanner(System.in);
        String salir = " ";
        //carga de vuelos y asientos
        //¿cómo hacer el finish?
        while (!"finish".equals(salir)) {

            System.out.println("Ingrese un destino");
            System.out.println("0)Río de janeiro");
            System.out.println("1)Cancún");
            System.out.println("2)Madrid");
            System.out.println("3)Roma");
            System.out.println("4)Milán");
            System.out.println("5)Iguazú");
            int destino = tecDestino.nextInt();
            System.out.println("Ingrese un horario");
            System.out.println("0)Mañana");
            System.out.println("1)Tarde");
            System.out.println("2)Noche");
            int turno = tecTurno.nextInt();
            System.out.println("Ingrese la cantidad de pasajes");
            int pasajes = tecPasajes.nextInt();
            if (matriz[destino][turno] < pasajes) {
                System.out.println("El vuelo está lleno");
            } else {
                System.out.println("Reserva Realizada");
                matriz[destino][turno] = matriz[destino][turno] - pasajes;
                System.out.println(matriz[destino][turno]);
            }
            System.out.println("finish?");
            salir = tecFinish.next();

        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }
    }

}
