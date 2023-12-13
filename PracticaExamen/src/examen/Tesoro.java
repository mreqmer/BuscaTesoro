package examen;

import java.util.Random;

public class Tesoro {

	// constante que guarda el tamaño del tablero
	static final int TAM_TABLERO = 5;

	// guarda la posición x del jugador
	int xJugador = 1;
	// guarda la posición x del jugador
	int yJugador = 1;
	// guarda la posición x del tesoro
	static int xTesoro;
	// guarda la posición y del tesoro
	static int yTesoro;

	// genera números aleatorios dentro del rango del tamaño del tablero
	// y se los asigna a variables
	static void generaPosicionTesoro() {

		Random rand = new Random();

		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}

	// genera el tablero de juego con el tamaño máximo guardado en
	// TAM_TABLERO
	void pintaTablero() {
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}
		System.out.println("");
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print(i);
			if (xJugador == i) {
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				} // for
				System.out.print("J ");
			} // if
			System.out.println("");
		} // for

	}

	// esta recoge el movimiento del jugador y comprueba que esté
	// en los límites, si lo está mueve al jugador 1 posición en
	// esa dirección.

	int mueveJugador(String movimiento) {

		String movimientoMin = movimiento.toLowerCase();
		int codigo = 0;

		switch (movimientoMin) {
		case "arriba" -> {
			if ((xJugador - 1) < 1) {
				codigo = -1;
			}else {
				xJugador --;
			}
		}
		case "abajo" -> {
			if ((xJugador + 1) > TAM_TABLERO) {
				codigo = -1;
			}else {
				xJugador ++;
			}
		}
		case "derecha" -> {
			if (yJugador + 1 > TAM_TABLERO) {
				codigo = -1;
			}else {
				yJugador++;
			}
		}
		case "izquierda" -> {
			if (yJugador - 1 < 1) {
				codigo = -1;
			}else {
				yJugador--;
			}
		}
		default -> codigo = -2;
		}

		return codigo;

	}
	
	boolean buscaTesoro() {
//		boolean  tesoroEncontrado=false;
//		
//		if (xJugador == xTesoro && yJugador == yTesoro) {
//			tesoroEncontrado=true;
//		}
		
		return xJugador == xTesoro && yJugador == yTesoro ? true: false;
	}
	
}
