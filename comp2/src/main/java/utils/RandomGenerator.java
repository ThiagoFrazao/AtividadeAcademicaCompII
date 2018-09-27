package utils;

import java.util.Random;

public class RandomGenerator {
	
	private static Random random = new Random();
	
	public static int gerarNumero(int limite){
		
		return random.nextInt(limite);
	}

}
