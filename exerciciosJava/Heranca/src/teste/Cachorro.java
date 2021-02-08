package teste;

public class Cachorro extends Animal {

String raca;
	
	public Cachorro(String nome, String raca, double peso)
	{
		super(nome, peso);
		this.raca = raca;
	}
	
	public void latir() {
		System.out.println("O cachorro está latindo");
	}
	
	public void getRaca()
	{
		
	}

	
	
	public double getTamanho()
	{
		return tamanho;
	}
	
	
	public void setTamanho(double tamanho) 
	{
		this.tamanho = tamanho;
	}
	
	
	
	
	
	
	
	String movimentacao() {
		return null;
	}
	
	double kmHora()
	{
		return 0;		
	}
	
	public String necessidadesFisiologicas()
	{
		return null;
	}
	
	public String comoSeAlimentar()
	{
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
}


