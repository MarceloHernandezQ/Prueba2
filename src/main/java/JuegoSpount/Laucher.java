package JuegoSpount;

import controlador.Manager;
import modelo.Jugador1;
import modelo.Jugador2;

public class Laucher {

	public static void main(String[] args) {
               Manager m = new Manager();
               
               m.movimientoJugador(new Jugador1());
               m.movimientoJugador(new Jugador2());
	}
}