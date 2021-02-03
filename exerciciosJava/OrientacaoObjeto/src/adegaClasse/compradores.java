package adegaClasse;

public class compradores {
	
	public String nome;
	public char sexo;
	public int an;
	
	public int idade()
	{
		return 2021 - an;
	}
	
	public void mostraIdade()
	{
		System.out.println(2021 - an);
	}
	
	public String statusIdade()
	{
		int idade;
		String mensagem;
		idade = 2021 - an;
		if (idade <18) 
		{
			mensagem = "pessoa menor de 18 anos";
		} else
		{
			mensagem = "pessoa maior de 18 anos";
		}
		return mensagem;
	}

}
