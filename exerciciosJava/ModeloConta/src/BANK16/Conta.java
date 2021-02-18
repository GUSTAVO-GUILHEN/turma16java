package BANK16;

public class Conta 
{

	private String numero;
	private String cpf;
	private double saldo;
	
	
	public Conta(String numero, String cpf, double saldo) {

		this.numero = numero;
		this.cpf = cpf;	
	}
	
	public void creditar(double valor)
	{
		this.saldo = this.saldo + valor; 
	}
	
	public void debitar (double valor)
	{
		this.saldo = this.saldo - valor;
	}
	
	public String getNumero()
	{
		return numero;
	}
	
	public void setNumero(String numero)
	{
		this.numero = numero;
	}
	
	public String getCpf()
	{
		return cpf;
	}
	
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
	
	public double getSaldo()
	{
		return saldo;
	}
	
	
	
	
	
}
