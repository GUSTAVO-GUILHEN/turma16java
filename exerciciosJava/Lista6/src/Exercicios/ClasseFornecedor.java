package Exercicios;

public class ClasseFornecedor extends ClassePessoa 
{
	
	public double valorCredito;
	public double valorDivida;
	public ClasseFornecedor(String nome, String endereco, String telefone,double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public ClasseFornecedor() 
	{
		
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	public double getValorDivida() {
		return valorDivida;
	}
	
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public void ObterSaldo()
	{
		double dif;
		dif = valorCredito - valorDivida;
		System.out.printf("O saldo foi %f",dif);
	}
	
	
}