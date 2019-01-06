package modelo;

public class Punto {
	private double posicionX;
	private double posicionY;
	
	public Punto() {
		
	}

    public Punto(double posicionX, double posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

        

	public double getPosicionX() {
		return this.posicionX;
	}

	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}

	public double getPosicionY() {
		return this.posicionY;
	}

	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}

    @Override
    public String toString() {
        return "Punto{" + "posicionX=" + posicionX + ", posicionY=" + posicionY + '}';
    }

	
}