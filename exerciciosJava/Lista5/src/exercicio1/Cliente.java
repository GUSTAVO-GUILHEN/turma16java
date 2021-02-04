package exercicio1;

public class Cliente {

	private String nome;
	private String cpf;
	private String endereco;
	
	public Cliente (String nomeC, String cpfC, String enderecoC)
	{
		nome = nomeC;
		cpf = cpfC;
		endereco = enderecoC;
		
	}
	
	public String mostraTela() 
	{
		String mostraTela = nome + " " + cpf + " " + endereco;
		return mostraTela;
	}
}