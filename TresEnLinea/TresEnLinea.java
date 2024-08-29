
public class TresEnLinea {

    private char [][] tablero;
    private char jugadorActual;
    private static final char Vacio = '-';
    private static final char Jugador1 = 'x';
    private static final char Jugador2 = 'o';

    public TresEnLinea() {
        tablero = new char[3][3];
        inicializarTablero();
        jugadorActual = Jugador1;
    }

    private void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = Vacio;
            }
        }
    }

    void imprimirTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void cambiarJugador() {
        if (jugadorActual == Jugador1) {
            jugadorActual = Jugador2;
        } else {
            jugadorActual = Jugador1;
        }
    }

    public boolean Simbolo(int fila, int columna) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == Vacio) {
            tablero[fila][columna] = jugadorActual;
            return true;
        }
        return false;
    }

    public boolean Ganador() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true;
            }
            if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                return true;
            }
        }
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true;
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true;
        }
        return false;
    }

    public boolean tableroLLeno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == Vacio) {
                    return false;
                }
            }
        }
        return true;
    }

    public char getJugadorActual() {
        return jugadorActual;
    }
}

