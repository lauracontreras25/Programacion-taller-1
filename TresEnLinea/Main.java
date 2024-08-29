import java.util.Scanner;

    public class Main {
        
    public static void main(String[] args) {
        TresEnLinea juego = new TresEnLinea();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean juegoTerminado = false;
            
            while (!juegoTerminado) {
                juego.imprimirTablero();
                System.out.println("Turno de " + juego.getJugadorActual());
                System.out.print("Introduce la fila (0, 1, 2): ");
                int fila = scanner.nextInt();
                System.out.print("Introduce la columna (0, 1, 2): ");
                int columna = scanner.nextInt();
                
                if (juego.Simbolo(fila, columna)) {
                    if (juego.Ganador()) {
                        juego.imprimirTablero();
                        System.out.println("El jugador " + juego.getJugadorActual() + " es el ganador");
                        juegoTerminado = true;
                    } else if (juego.tableroLLeno()) {
                        juego.imprimirTablero();
                        System.out.println("El juego termina en empate.");
                        juegoTerminado = true;
                    } else {
                        juego.cambiarJugador();
                    }
                } else {
                    System.out.println("Movimiento no valido.");
                }
            }
        }
    }
}
   
    
