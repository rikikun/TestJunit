import java.util.Random;

public class PlayerPowYingChub {
	private String output;
	private String[] setout = { "H", "S", "P" };

	public String genOutput() {
		Random rand = new Random();
		int max = 2;
		int min = 0;
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return setout[randomNum];
	}

	public static void main(String[] args) {
		System.out.print(new PlayerPowYingChub().genOutput());
	}

}
