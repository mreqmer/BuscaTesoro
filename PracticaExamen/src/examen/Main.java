package examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String movimiento;
		Tesoro tesoro = new Tesoro();
		int codigo;

		// Primero generamos la posición del tesoro llamando a la función
		// correspondiente
		Tesoro.generaPosicionTesoro();
		
//		lineas de prueba de los numeros aleatorios
//		System.out.println("x" + Tesoro.xTesoro);
//		System.out.println("y" + Tesoro.yTesoro);

		// se pinta el tablero para iniciar el juego
		tesoro.pintaTablero();

		while (!tesoro.buscaTesoro()) {
			do {
				System.out.println("¿Dónde se quiere mover?");
				movimiento = sc.next();
				codigo = tesoro.mueveJugador(movimiento);

				switch (codigo) {
				case -1 -> System.out.println("Movimiento fuera del mapa.");
				case -2 -> System.out.println("Introduce un movimiento válido.");
				}
			} while (codigo != 0);

			tesoro.pintaTablero();
		}

		System.out.println("Oleeeeeeee!!!");
		
		sc.close();

	}
}
