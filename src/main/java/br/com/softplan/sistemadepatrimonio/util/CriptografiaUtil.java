package br.com.softplan.sistemadepatrimonio.util;

public class CriptografiaUtil {
	
	
	
	public static String Criptografar (String senha) {
		
		int contador, tamanho, codigoASCII;
		String senhaCriptografada =  "";
		tamanho = senha.length();
		senha = senha.toUpperCase();
		contador = 0;
		
		while (contador < tamanho) {
			codigoASCII = senha.charAt(contador)+130;
			senhaCriptografada = senhaCriptografada + (char) codigoASCII;
			contador ++;
			
		}
		
		return senhaCriptografada;
			
	}
	
	
	
	public static String Descriptografar (String senha) {
		
		int contador, tamanho, codigoASCII;
		String senhaDescriptografada ="";
		tamanho =senha.length();
		senha = senha.toUpperCase();
		contador = 0;
		
		while ( contador < tamanho ) {
			codigoASCII = senha.charAt(contador)-130;
			senhaDescriptografada = senhaDescriptografada + (char)codigoASCII;
			contador ++;	
		}
		return senhaDescriptografada;
		
	}

}
