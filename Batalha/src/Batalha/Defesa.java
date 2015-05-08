package Batalha;

public class Defesa implements IDefesa {
	public double protecao(double resistencia, double forca){
		return (2/3)*resistencia + (1/3)*forca; /* colocar o bonus do tipo*/
	}
	public double probabilidade_defesa(double agilidade){
		return (1-agilidade/100);
	}
}
