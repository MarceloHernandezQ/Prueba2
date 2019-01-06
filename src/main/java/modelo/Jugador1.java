package modelo;

public class Jugador1 implements escucharJugadores {
	private String nombre;
	private boolean estado;

    public Jugador1(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = true;
    }

    public Jugador1() {
    }
    
        
        public void iniciarJuego(){
            System.out.println("Iniciando Juego");
        }

	public void escogerPunto() {
	
            System.out.println("Ingrese Punto");
	}
}