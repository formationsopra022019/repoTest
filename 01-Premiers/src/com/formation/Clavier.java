package com.formation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Clavier {

	public static String saisieString() throws Exception {
		BufferedReader strIn = null;
		String buffer = null;
		try {
			strIn = new BufferedReader(new InputStreamReader(System.in));
			// lire le flux standard
			buffer = strIn.readLine();
			if (buffer == null || buffer.trim().length() == 0)
				throw new Exception("Saisie obligatoire !");
		} catch (IOException e) {
			throw new Exception("Erreur de saisie !");
		}
		return buffer;
	}

	public static char saisieChar() throws Exception {
		String saisie = saisieString();
		if (saisie.length() == 0)
			return '\n';
		else
			return saisie.charAt(0);
	}

	public static long saisieLong() throws Exception {
		long buffer = 0;
		try {
			buffer = Long.parseLong(saisieString());
		} catch (NumberFormatException e) {
			throw new Exception("Le format entier saisi est incorrect !");
		}
		return buffer;
	}
	
	public static byte saisieByte() throws Exception {
		byte buffer = 0;
		try {
			buffer = Byte.parseByte(saisieString());
		} catch (NumberFormatException e) {
			throw new Exception("Le format entier saisi est incorrect !");
		}
		return buffer;
	}

	public static int saisieInt() throws Exception {
		int buffer = 0;
		buffer = (int) saisieLong();
		return buffer;
	}

	public static double saisieDouble() throws Exception {
		double buffer = 0.0;
		try {
			buffer = Double.parseDouble(saisieString());
		} catch (NumberFormatException e) {
			throw new Exception("Le format réel saisi est incorrect !");
		}
		return buffer;
	}

	public static float saisieFloat() throws Exception {
		float buffer = 0.0f;
		try {
			buffer = Float.parseFloat(saisieString());
		} catch (NumberFormatException e) {
			throw new Exception("Le format réel saisi est incorrect !");
		}
		return buffer;
	}

}
