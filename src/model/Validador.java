package model;

public class Validador {
	
	public String validaLogin(String codDeAcesso, String rotuloCampo) throws Exception{
		if (codDeAcesso.length() == 0) {
			throw new Exception("O campo " + rotuloCampo + " deve ser preenchido.");
		}
		return codDeAcesso;
	}
	
/*	DESCOMENTAR DEPOIS
	public String validaFormataCaixaAlta(String txt, int tamanhoMax,
			String rotuloCampo) throws ValidacaoException {
		if (txt == null) {
			throw new ValidacaoException("O campo " + rotuloCampo
					+ " deve ser preenchido.");
		}

		txt = txt.trim().toUpperCase();

		if (txt.length() == 0) {
			throw new ValidacaoException("O campo " + rotuloCampo
					+ " deve ser preenchido.");
		}

		if (txt.length() > tamanhoMax) {
			throw new ValidacaoException("O campo " + rotuloCampo
					+ " deve conter no máximo " + tamanhoMax + " caracteres.");
		}

		return txt;
	}

	public int validaFormataInteiro(String txt, String rotuloCampo)
			throws ValidacaoException {
		if (txt == null) {
			throw new ValidacaoException("O campo " + rotuloCampo
					+ " deve ser preenchido.");
		}

		txt = txt.trim().toUpperCase();

		if (txt.length() == 0) {
			throw new ValidacaoException("O campo " + rotuloCampo
					+ " deve ser preenchido.");
		}

		int i;

		try {
			i = Integer.parseInt(txt);
		} catch (NumberFormatException e) {
			throw new ValidacaoException("Erro na digitação do campo " + rotuloCampo
					+ ". \n" + e.getMessage());
		}

		return i;
	}
	
	public long validaFormataLong(String txt, String rotuloCampo)
			throws ValidacaoException {
		if (txt == null) {
			throw new ValidacaoException("O campo " + rotuloCampo
					+ " deve ser preenchido.");
		}

		txt = txt.trim().toUpperCase();

		if (txt.length() == 0) {
			throw new ValidacaoException("O campo " + rotuloCampo
					+ " deve ser preenchido.");
		}

		long i;

		try {
			i = Long.parseLong(txt);
		} catch (NumberFormatException e) {
			throw new ValidacaoException("Erro na digitação do campo " + rotuloCampo
					+ ". \n" + e.getMessage());
		}

		return i;
	}
	
	public double validaFormataDouble(String txt, String rotuloCampo)
			throws ValidacaoException {
		if (txt == null) {
			throw new ValidacaoException("O campo " + rotuloCampo
					+ " deve ser preenchido.");
		}

		txt = txt.trim().toUpperCase();

		if (txt.length() == 0) {
			throw new ValidacaoException("O campo " + rotuloCampo
					+ " deve ser preenchido.");
		}

		double i;

		try {
			i = Double.parseDouble(txt);
		} catch (NumberFormatException e) {
			throw new ValidacaoException("Erro na digitação do campo " + rotuloCampo
					+ ". \n" + e.getMessage());
		}

		return i;
	}
*/
}
