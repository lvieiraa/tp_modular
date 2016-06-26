
public class Cliente extends Pessoa {
	private static String dataNascimento, endereco;

	public static String getDataNascimento() {
		return dataNascimento;
	}

	public static void setDataNascimento(String dataNascimento) {
		Cliente.dataNascimento = dataNascimento;
	}

	public static String getEndereco() {
		return endereco;
	}

	public static void setEndereco(String endereco) {
		Cliente.endereco = endereco;
	}
	
}
