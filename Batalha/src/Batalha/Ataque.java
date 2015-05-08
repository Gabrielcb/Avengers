package Batalha;

public class Ataque implements IAtaque {
	public double Dano_Ataque(double dano, double resistencia, double forca, double agilidade){
		return (1 + forca/100)*dano*(1-forca/100)*agilidade; /* colocar o bonus do tipo*/
	}
	public double probabilidade_acerto(double agilidade){
		return (1-agilidade/100);
	}
}
