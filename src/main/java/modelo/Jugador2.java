package modelo;

public class Jugador2 implements escucharJugadores {
	private String nombre;
	private boolean estado;

    public Jugador2(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

	
        
        public Jugador2() {
        
    }
        
        public void iniciarJuego(){
            System.out.println("Iniciando Juego");
        }

	public void escogerPunto() {
	
            System.out.println("Ingrese Punto");
	}
}