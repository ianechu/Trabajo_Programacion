package trabajo_programacion;

import java.util.Scanner;

public class Acciones {
	static int NUMERO_PALABRAS = 0;
	static void imprimirMenu() {
			System.out.println("0)Salir");
			System.out.println("1)Introduce un termino y su definicion");
			System.out.println("2)Mostrar los terminos");
			System.out.println("3)Obtener definición");
			System.out.println("4)Eliminar termino y definicion");

		}
	public static void main(String[] args) {
		Palabra[] diccionario = new Palabra[100];
		Scanner sc = new Scanner(System.in);
		Palabra p = new Palabra();
		int opcion = 0;
		String definicion;
		String termino;
		do {
			Acciones.imprimirMenu();
			System.out.println("Elige una opcion:");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce un termino");
				termino = sc.next();
				sc.nextLine();
				System.out.println("Introduce su definicion");
				definicion = sc.next();
				diccionario[NUMERO_PALABRAS] = new Palabra(termino, definicion);
				Acciones.NUMERO_PALABRAS++;
				break;
			case 2:
				for (int i = 0; i < NUMERO_PALABRAS; i++) {
					System.out.println(diccionario[i].getTermino());
				}
				break;
			case 3:

				break;
			case 4:

				break;
			case 0:
				System.out.println("Has salido del menu");
				break;
			}
		} while (opcion != 0);

	}

}
