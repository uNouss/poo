package tp11;

import java.util.Random;

import td1.Telephone;

public class TestTelephone {
	public static void main(String[] args) {
		Random r = new Random();
		for(int idx = 0; idx < 5; idx++) {
			System.out.println(new Telephone(r.nextInt(9)+1,
											 r.nextInt(100),
											 r.nextInt(100),
											 r.nextInt(100),
											 r.nextInt(100)));
		}
	}
}