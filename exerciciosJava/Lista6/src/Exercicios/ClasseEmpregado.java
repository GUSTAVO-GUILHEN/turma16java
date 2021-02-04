package Exercicios;

public class ClasseEmpregado extends ClassePessoa
{
	
	public int codigoSetor;
	public double salarioBase;
	public double impostos;
	
	public ClasseEmpregado() {
		
	}

	public ClasseEmpregado(String nome, String endereco, String telefone,int codigoSetor, double salarioBase, double impostos)
	{
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.impostos = impostos;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public void ObterSalario()
	{
		impostos = impostos/100;
		double salarioFinal;
		salarioFinal = (salarioBase - (salarioBase*impostos));
		System.out.printf("O imposto resultante foi %f e com isso seu salario %f", impostos, salarioFinal);
	}
	
	
		
	
}
