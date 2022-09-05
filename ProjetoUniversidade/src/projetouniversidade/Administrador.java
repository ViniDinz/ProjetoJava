package projetouniversidade;

import java.util.ArrayList;

public class Administrador {

	private String Nome;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	ArrayList<Administrador> ListaAdministrador = new ArrayList();
	
	public void cadastrarAdministrador(Administrador administrador,String nome)
	{
		if(ListaAdministrador.contains(administrador))
		{
		  System.out.println("O Administrador ja existe");
		}
		else {
		administrador.setNome(nome); 
		ListaAdministrador.add(administrador);	}			
	}
	public void alterarAdministrador(Administrador administrador, String nome)
	{
		if(ListaAdministrador.contains(administrador))
		{
			administrador.setNome(nome);
		}
		else
		{
			System.out.println("O Administrador não existe");
		}
	}
	public void excluirAdministrador(Administrador administrador)
	{
		if(ListaAdministrador.contains(administrador))
		{ int index = ListaAdministrador.lastIndexOf(administrador);
			ListaAdministrador.remove(index);
		}
		else
		{
		 System.out.println("O administrador não existe");
		}
	}
	public void lerAdministrador()
	{ int tamanho = ListaAdministrador.size();
		for(int pp = 0; pp < tamanho; pp++)
		{
			System.out.println("Nome: " + ListaAdministrador.get(pp).getNome() + ".");
		}

    }

	public static void main(String[] args)
	{
		 Administrador ListaAdministrador = new Administrador();
	     Administrador administrador1 = new Administrador();
	     Administrador administrador2 = new Administrador();
	     Administrador administrador3 = new Administrador();
	     ListaAdministrador.cadastrarAdministrador(administrador1, "Vinicius");
	     ListaAdministrador.cadastrarAdministrador(administrador2, "João");
	     ListaAdministrador.cadastrarAdministrador(administrador3, "Matheus");
	     ListaAdministrador.alterarAdministrador(administrador3, "Maria");
	     ListaAdministrador.excluirAdministrador(administrador2);
	     ListaAdministrador.lerAdministrador();
	}
}
