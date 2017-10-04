import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Terreno {

	 private Casilla[][] Terreno;
	
	    
	 public Terreno(){
	       menu();
	    }
	
	 
	 
	 private void menu() {
		 
		 
		// Escaner
			Scanner sc = new Scanner(System.in);
			// Variables del menú
			boolean exit = false;
			int Opcion;

			do {
				System.out.println("Este es el menu principal");
				System.out.println("1. Datos Teclado");
				System.out.println("2. Datos Aleatorio");
				System.out.println("3. Log out");

				Opcion = sc.nextInt();
				sc.nextLine();

				switch (Opcion) {

				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					exit = true;
					break;
			
				}
			} while (!exit);
		}
	 
	
	public void Leer_archivo(String archivo) throws IOException {
		int X;
		int Y;
		int K;
		int Max;
		int C;
		int F;

		String cadena;

		FileReader Fichero = new FileReader(archivo);
		Scanner b = new Scanner(Fichero);
		int cont = 0;
		int q = 0;

		do {

			if (cont == 0) {

				cadena = b.nextLine();
				String a[] = cadena.split(" ");
				X = Integer.parseInt(a[0]);
				Y = Integer.parseInt(a[1]);
				K = Integer.parseInt(a[2]);
				Max = Integer.parseInt(a[3]);
				C = Integer.parseInt(a[4]);
				F = Integer.parseInt(a[5]);

				cont++;

			} else {

				cadena = b.nextLine();
				String a[] = cadena.split(" ");

				for (int i = 1; i < Terreno.length + 1; i++) {
					int n = Integer.parseInt(a[i]);
					int v = i - 1;

					Terreno[q][v] = n;

				}
				q++;
				cont++;

			}

		} while (cont <= F);

		
	}

	private void InicializarTablero() {
		for (int i = 0; i < Terreno.length; i++) {
			for (int j = 0; j < Terreno[i].length; j++) {

				Terreno[i][j] = new Casilla(i, j, a, m);

			}
		}
	}

}
