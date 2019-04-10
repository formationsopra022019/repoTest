package com.formation;

public class NombresPremiersCorrection {
	public static void main(String[] args) throws Exception {
		final int nParLigne = 10;
		boolean tableau[]; 
		
		int nMax; // le plus grand entier a examiner


		System.out.print("Donnez le plus grand nombre entier a examiner : ");
		nMax = Clavier.saisieInt();
		
		tableau = new boolean[nMax + 1];
		for (int i = 1; i < nMax + 1; i++)
			tableau[i] = true;

		long t1 = System.currentTimeMillis();
		for (int i = 2 ; i < (int) Math.sqrt(nMax) + 1 ; i++){
			if (tableau[i]){
//				for (int j = i + 1 ; j <= nMax ; j++){
//					if (j % i == 0)
//						tableau[j] = false;
//				}
				for (int j = 2 * i ; j <= nMax ; j+=i){
					tableau[j] = false;
				}
			}
		}
		
		long t2 = System.currentTimeMillis();
		/* affichage des resultats */
		System.out.println("entre 1 et " + nMax + " les nombres premiers sont : ");
		int nAff = 0; // nombre de valeurs affichees
		int nb = 0;
		for (int i = 1; i <= nMax; i++) {
			if (tableau[i]) {
				System.out.print(i + " ");
				nb++;
				nAff++;
				if (nAff == nParLigne) {
					nAff = 0;
					System.out.println();
				}
			}
		}
		
		System.out.println("\n\nPour "+ nMax + " : " + "Total : " + nb);
		System.out.println("Temps de traitement = " + (t2 - t1) + "ms");
	}
}
