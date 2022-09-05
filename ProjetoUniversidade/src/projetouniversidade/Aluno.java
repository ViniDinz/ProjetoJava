package projetouniversidade;

import java.util.ArrayList;

public class Aluno extends Turma {

	private String Nome;
	private String CPF;
	private double Nota;
	
	ArrayList<Aluno> ListaAluno = new ArrayList();
	
	public Aluno(String nome, String CPF, int nota) {
		this.Nome = nome;
		this.CPF = CPF;
		this.Nota = nota;
	}
	public Aluno() {
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
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public double getNota() {
		return Nota;
	}
	public void setNota(double nota) {
		Nota = nota;
	}
	
	public void cadastrarAluno(Aluno aluno,String nome, String CPF , double Nota)
	{
		if(ListaAluno.contains(aluno))
		{
		  System.out.println("O aluno ja existe");
		}
		else {
		aluno.setNome(nome); 
		aluno.setCPF(CPF);
		aluno.setNota(Nota);
		ListaAluno.add(aluno);	}			
	}
	public void alterarAluno(Aluno aluno, String nome, String CPF, double Nota)
	{
		if(ListaAluno.contains(aluno))
		{
			aluno.setCPF(CPF);
			aluno.setNome(nome);
			aluno.setNota(Nota);
		}
		else
		{
			System.out.println("O aluno não existe");
		}
	}
	public void excluirAluno(Aluno aluno)
	{
		if(ListaAluno.contains(aluno))
		{ int index = ListaAluno.lastIndexOf(aluno);
			ListaAluno.remove(index);
		}
		else
		{
		 System.out.println("O aluno não existe");
		}
	}
	public void lerAluno()
	{ int tamanho = ListaAluno.size();
		for(int ii = 0; ii < tamanho; ii++)
		{
			System.out.println("Nome: " + ListaAluno.get(ii).getNome() + ", CPF: " + ListaAluno.get(ii).getCPF() + ".");
		}
	}
			
	}

