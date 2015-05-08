package Batalha;

public class Desvio implements IDesvio {
	public double desviar(double agilidade){
		return (1-agilidade)*aleatorio.numero();
	}
}
