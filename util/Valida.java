package util;

/**
 * Classe respons�vel por armazenar os m�todos de valida��o do sistema
 * 
 * @author Jo�o Victor
 * @since 03/03/2021
 * @version 1.0
 */
public class Valida {

	// m�todo para retornar se o valor string est� preenchido
	public static boolean isEmptyOrNull(String args) {
		return (args.trim().equals("") || args == null);
	}

}
