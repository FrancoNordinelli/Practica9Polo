package LOGICA;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Nintengo64 nintendo = new Nintengo64();
        nintendo.leerCartucho(input.nextLine());
        PlayStatio2 play = new PlayStatio2();
        play.leerDvs(input.nextLine());
        XboxOne xbox = new XboxOne();
        xbox.leerJuegoDigital(input.nextLine());
        
        
    }
    
}
