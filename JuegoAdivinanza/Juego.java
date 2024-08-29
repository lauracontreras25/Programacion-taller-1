import java.util.Scanner;

public class Juego {
    private int numeroSecreto;
    private int intentosRestantes;
    private int rangoMin;
    private int rangoMax;

    
    public Juego(int intentos, int rangoMin, int rangoMax) {
        this.intentosRestantes = intentos;
        this.rangoMin = rangoMin;
        this.rangoMax = rangoMax;
        this.numeroSecreto = (int) (Math.random() * (rangoMax - rangoMin + 1)) + rangoMin;
    }

    
    public void iniciarJuego(Jugador jugador) {
        System.out.println("Adivina el numero entre " + rangoMin + " y " + rangoMax);

        while (intentosRestantes > 0) {
            System.out.println("Te quedan " + intentosRestantes + " intentos.");
            int intento = jugador.realizarIntento();

            if (verificarIntento(intento)) {
                System.out.println(" El numero es correcto");
                return;
            } else {
                System.out.println("Intento incorrecto.");
            }

            intentosRestantes--;
        }

        mostrarResultado(); 
    }

    public boolean verificarIntento(int intento) {
        return intento == numeroSecreto;
    }

    
    public void mostrarResultado() {
        System.out.println("No adivinaste el número. El numero correcto era: " + numeroSecreto);
    }
}


class Jugador {
    private int intentosRealizados;

   
    public Jugador() {
        this.intentosRealizados = 0;
    }

    
    public int realizarIntento() {
        intentosRealizados++;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu intento: ");
        return scanner.nextInt();
    }
}
