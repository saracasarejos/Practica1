package practica2;

public class Practica2 {
	private int numero;
	private double registro;
	
	public Practica2 (int numero, double registro){
		this.numero=numero;
		this.registro=registro;
	}
	public int getNumbero() {
		return this.numero;
		
	}
	public double getRegistro() {
		return this.registro;
	}
		
	public void setNumero(int numero){
		this.numero=numero;
	  }
	
	public void setRegistro (double registro){
		this.registro=registro;
	}
	public boolean aprobad() {
		return this.registro>=5;
	}
}

