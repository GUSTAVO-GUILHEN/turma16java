package Exercicios;

public class ClasseOperario extends ClassePessoa {
	
	
	public double valorProducao;
	public double comissao;
	public ClasseOperario(String nome, String endereco, String telefone,double valorProducao, double comissao) {
		super(nome, endereco,telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		
	}
	
	public ClasseOperario() 
	{
		
	}
	
	public double getValorProducao() {
		return valorProducao;
	}
	
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public void ValorProducao(int quantidade)
	{
		double valorFinal;
		comissao = comissao*quantidade;
		valorFinal = comissao + valorProducao;
		System.out.printf("Voce cumpriu com a quantidade de %d feitos e isso reteve um bonus a mais no seu salario %f e com isso seu resultado final é %f", quantidade, valorProducao, valorFinal);
	}
}

 


