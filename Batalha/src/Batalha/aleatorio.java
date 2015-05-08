package Batalha;
import java.util.Random;

public class aleatorio {
	public static int numero(){
		Random c = new Random();
		int g = c.nextInt(11);
		return g;
	}
}
