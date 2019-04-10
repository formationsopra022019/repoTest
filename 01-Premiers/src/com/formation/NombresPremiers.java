package com.formation;

public class NombresPremiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isOK = false;
		int limite = 2;
		int compteur = 0;

		// Demande à l'utilisateur le nombre de lignes
		do {
			isOK = true;
			try {
				System.out.print("Veuillez entrer un entier supérieur à 2 : ");
				limite = Clavier.saisieInt();
				if (limite < 3) {
					System.out.println("Une erreur est survenue lors de la saisie");
					isOK = false;
				}
			} catch (Exception e) {
				isOK = false;
				System.out.println("Une erreur est survenue lors de la saisie");
			}
		} while ((!isOK) && (limite < 3));

		// Création d'un tableau : première colonne = nombre, deuxième colonne = 0 si
		// nombre premier
		int tableau[][] = new int[limite][2];

		// Début de mesure du temps de traitement
		long temps1 = System.currentTimeMillis();
		for (int i = 1; i <= limite; i++) {
			tableau[i - 1][0] = i; // Les nombres de 1 au nombre de l'utilisateur sont recopiés dans le tableau
			tableau[i - 1][1] = 0; // Pour l'instant on considère le nombre premier

			// On regarde si le nombre est divisible par les nombres qui le précèdent
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					tableau[i - 1][1]++; // Le nombre est divisible, il n'est dont pas premier
					break; // Pas besoin de continuer, on sait qu'il n'est pas premier, on passe au suivant
				}
			}
		}

		// Fin de mesure du temps de traitement
		long temps2 = System.currentTimeMillis();

		// Affichage des nombres premiers
		for (int i = 1; i <= limite; i++) {
			if (tableau[i - 1][1] == 0) {
				// System.out.print("" + i + " ");
				System.out.println(i);
				compteur++;
			}
		}

		// Affichage final
		// System.out.println("");
		System.out.println('\r' + "Il y a " + compteur + " nombres premiers entre 1 et " + limite);
		System.out.println('\r' + "Temps de traitement : " + (temps2 - temps1) + "ms");
	}

}
