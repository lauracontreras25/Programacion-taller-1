public class Main {

    public static void main(String[] args) {
        
        Jugador jugador = new Jugador(); 

        
        Juego juego = new Juego(5, 1, 10); 

        
        juego.iniciarJuego(jugador);
    }
}
