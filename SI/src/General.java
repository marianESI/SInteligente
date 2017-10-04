import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class General {

	// variables
	private int X;
	private int Y;
	private int K;
	private int Max;
	private int C;
	private int F;
	private int terreno[][];
	private String cadena;

	// lectura de fichero

	public General(String archivo) throws IOException {

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
				terreno = new int[C][F];
				cont++;

			} else {

				cadena = b.nextLine();
				String a[] = cadena.split(" ");

				for (int i = 1; i < terreno.length + 1; i++) {
					int n = Integer.parseInt(a[i]);
					int v = i - 1;
					terreno[q][v] = n;

				}
				q++;
				cont++;

			}

		} while (cont <= F);

		pintar_terreno(terreno);
	}

	public void pintar_terreno(int s[][]) {

		for (int x = 0; x < s.length; x++) {
			for (int y = 0; y < s[x].length; y++) {

				System.out.print((s[x][y]) + " ");
			}
			
			System.out.println();
			
		}
		
	}


	
}
