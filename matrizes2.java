import java.util.Scanner;

public class matrizes2 {
	
	public static void main (String[]args) {
		
			Scanner Leitor = new Scanner(System.in);
		
			System.out.println("****Matriz dos cofatores****");
			
			System.out.print("Número de linha da matriz: ");
			int LinhaM = Leitor.nextInt();
			
			System.out.print("Número de coluna da matriz: ");
			int ColunaM = Leitor.nextInt();
			
			
			int matriz[][] = new int[LinhaM][ColunaM];
			int contadorL = 0;
			int contadorC = 0; 
				
			int cof11; 
			int cof21;
			int cof31; 
			int cof12;
			int cof22;
			int cof32;
			int cof13;
			int cof23;
			int cof33;
			
				
			int cal1;
			int cal2;
			int cal3;
			int cal4;
			int cal5;
			int cal6;
			int Det;
			
		
			
			while(contadorL < LinhaM ) {
				contadorC = 0;
			
				while(contadorC < ColunaM) {
					System.out.println("Digite linha " + (contadorL + 1) + " e coluna " + (contadorC + 1));
					matriz[contadorL][contadorC]= Leitor.nextInt();
					contadorC++;
			}
				contadorL++;
			}
			// calculo do determinante
			cal1 = matriz[0][0] * matriz[1][1] * matriz[2][2];
			cal2 = matriz[1][0] * matriz[2][1] * matriz[0][2];
			cal3 = matriz[2][0] * matriz[0][1] * matriz[1][2];
			cal4 = matriz[0][2] * matriz[1][1] * matriz[2][0];
			cal5 = matriz[1][2] * matriz[2][1] * matriz[0][0];
			cal6 = matriz[2][2] * matriz[0][1] * matriz[1][0];
			Det = cal1 + cal2 + cal3 -1 * (cal4 + cal5 + cal6);
			System.out.println("O Determinante da matriz é: " + Det);
			
			// calculo da matriz dos cofatores
			
			cof11 = 1 * ((matriz[1][1] + matriz[2][2]) - (matriz[1][2] + matriz[2][1]));
			cof21 = 1 * ((matriz[0][1] + matriz[2][2]) - (matriz[0][2] + matriz[2][1]));
			cof31 = 1 * ((matriz[0][1] + matriz[1][2]) - (matriz[0][2] + matriz[1][1]));
			cof12 = 1 * ((matriz[1][0] + matriz[2][2]) - (matriz[1][2] + matriz[2][0]));
			cof22 = 1 * ((matriz[0][0] + matriz[2][2]) - (matriz[0][2] + matriz[2][0]));
			cof32 = 1 * ((matriz[0][0] + matriz[1][2]) - (matriz[0][2] + matriz[1][0]));
			cof13 = 1 * ((matriz[1][0] + matriz[2][1]) - (matriz[1][1] + matriz[2][0]));
			cof23 = 1 * ((matriz[0][0] + matriz[2][1]) - (matriz[0][1] + matriz[2][0]));
			cof33 = 1 * ((matriz[0][0] + matriz[1][1]) - (matriz[0][1] + matriz[1][1]));
			System.out.println("A matriz dos cofatores é: \n" + cof11 + "  "+ cof21 +"  " + cof31  + "\n" + cof12 +"  " + cof22 +"  "+  cof32 + "\n"+ cof13 + "  " + cof23 + "  "+ cof33);
			
			
			// calculate matrix transposed
			int[][] trans = new int[ColunaM][LinhaM];
			for (int i = 0; i < LinhaM; i++) {
			    for (int j = 0; j < ColunaM; j++) {
			        trans[j][i] = matriz[i][j];
			    }
			}
			System.out.println("A matriz transposta da matriz de cofatores é: ");
			for (int i = 0; i < ColunaM; i++) {
			    for (int j = 0; j < LinhaM; j++) {
			        System.out.print(trans[i][j] + " ");
			    }
			    System.out.println();
			}
			// divisão da matriz transposta pelo determinante da matriz
			
			int transposta = matriz[0][0] + matriz[1][0] + matriz[2][0] + matriz[0][1]+ matriz[1][1] + matriz[2][1]  + matriz[0][2] + matriz[1][2] + matriz[2][2] ;
		
			double inversa = transposta / Det;
			System.out.println("A divisão da matriz transposta pelo determinante da matriz original é: " + inversa);
			
		
		
	
	}

}
