package projetouniversidade;

import java.util.ArrayList;

public class Professor extends Turma {
	
	private String Nome;
	private String CPF;
	
	ArrayList<Professor> ListaProfessor = new ArrayList();
	public Professor(String nome, String CPF) {
		this.Nome = nome;
		this.CPF = CPF;
	}
	public Professor() {
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		this.CPF = cPF;
	}
	
	public void cadastrarProfessor(Professor professor,String nome, String CPF)
	{
		if(ListaProfessor.contains(professor))
		{
		  System.out.println("O Professor ja existe");
		}
		else {
		professor.setNome(nome); 
		professor.setCPF(CPF);
		ListaProfessor.add(professor);	}			
	}
	public void alterarProfessor(Professor professor, String nome, String CPF)
	{
		if(ListaProfessor.contains(professor))
		{
			professor.setCPF(CPF);
			professor.setNome(nome);
		}
		else
		{
			System.out.println("O Professor não existe");
		}
	}
	public void excluirProfessor(Professor professor)
	{
		if(ListaProfessor.contains(professor))
		{ int index = ListaProfessor.lastIndexOf(professor);
			ListaProfessor.remove(index);
		}
		else
		{
		 System.out.println("O professor não existe");
		}
	}
	public void lerProfessor()
	{ int tamanho = ListaProfessor.size();
		for(int pp = 0; pp < tamanho; pp++)
		{
			System.out.println("Nome: " + ListaProfessor.get(pp).getNome() + ", CPF: " + ListaProfessor.get(pp).getCPF() + ".");
		}

    }
	
	public static void main(String[] args) {
	
	     Professor ListaProfessor = new Professor();
	     Professor professor1 = new Professor();
	     Professor professor2 = new Professor();
	     Professor professor3 = new Professor();
	     ListaProfessor.cadastrarProfessor(professor1, "Vinicius", "7121");
	     ListaProfessor.cadastrarProfessor(professor2, "João", "2222");
	     ListaProfessor.cadastrarProfessor(professor3, "Matheus", "9999");
	     ListaProfessor.alterarProfessor(professor3, "Maria", "21212");
	     ListaProfessor.excluirProfessor(professor2);
	     ListaProfessor.lerProfessor();
	}
}
