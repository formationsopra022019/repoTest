package com.formation;

public class NombrePremier {

	public static void main(String[] args) {
		boolean isOK = true;

		do {

			isOK = true;
			try {
				System.out.println("Nombre premier jusqu'a ?");
				int nbMax = Clavier.saisieInt();

				int compteur = 2;
				
				long t1 = System.currentTimeMillis();
				
				System.out.println("1");
				System.out.println("2");
				for (int i = 3; i <= nbMax; i+=2) {
					boolean nbPremier = true;
					for (int j = 2; j <= (int) Math.sqrt(i); j++) {
						
						if (i % j == 0) {
							nbPremier = false;
							break;
						}
					}
					if (nbPremier == true) {
						System.out.println(i + " ");
						compteur++;
					}

				}
				long t2 = System.currentTimeMillis();
				
				System.out.println("Compteur : " + compteur + "  Nombre premiers jusqu'à : " + nbMax);
				System.out.println("Temps de traitement = " + (t2-t1) + "ms");

			} catch (Exception e) {
				isOK = false;
				System.out.println("Une erreur est survenue lors de la saisie");
				System.out.println("Veuillez recommencer !!!");
				System.out.println();
			}
		} while (!isOK);
	}

}
