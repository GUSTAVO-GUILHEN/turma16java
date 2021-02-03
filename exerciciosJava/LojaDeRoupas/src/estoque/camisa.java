package estoque;

public class camisa {

	public String nome;
	public String descricao; 
	public double valorUnitario;
	
	
	//CONSTRUTORES
	public camisa(String nome, String descricao, double valorUnitario) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}
	
	//SOBRECARGA
	public camisa(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}
	public camisa(String descricao) {
		super();
		this.descricao = descricao;
	}

	

	
	
	
	
	
	
	
	
}
