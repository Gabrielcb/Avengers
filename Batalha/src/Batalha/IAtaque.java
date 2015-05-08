package Batalha;

public interface IAtaque {
	public double Dano_Ataque(double dano, double resistencia, double forca, double agilidade);
	public double probabilidade_acerto(double agilidade);
}
