package javaEstudandoPilha;

import java.io.ObjectInputStream.GetField;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");

		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}

		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao  {
		System.out.println("Ini do metodo1");
		
		
		metodo2();

		System.out.println("Fim do metodo1");

	}

	private static void metodo2() throws MinhaExcecao {

		System.out.println("Ini do metodo2");

		throw  new MinhaExcecao(": cabum, deu errado"
				+ "\n.................NUKEDNUKEDNUKEDNUKED.............\r\n"
				+ "..........NUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKED.....\r\n"
				+ ".....NUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKED\r\n"
				+ ".....NUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKED\r\n"
				+ ".....NUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKED\r\n"
				+ ".....NUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKED\r\n"
				+ ".....NUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKED\r\n"
				+ "......NUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKED....\r\n"
				+ "..........NUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKED.....\r\n"
				+ "......................NUKEDNUKED..................\r\n"
				+ "......................NUKEDNUKED..................\r\n"
				+ "......................NUKEDNUKED..................\r\n"
				+ "......................NUKEDNUKED..................\r\n"
				+ "......................NUKEDNUKED..................\r\n"
				+ "......................NUKEDNUKED..................\r\n"
				+ "......................NUKEDNUKED..................\r\n"
				+ "......................NUKEDNUKED..................\r\n"
				+ ".................NUKEDNUKEDNUKEDNUKED.............\r\n"
				+ ".........NUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKED......\r\n"
				+ ".......NUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKED...\r\n"
				+ "NUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKEDNUKED\r\n"
				+ "*******************GROUND ZERO********************\r\n"
				+ "");
	
	}

	// System.out.println("Fim do metodo2");

}


