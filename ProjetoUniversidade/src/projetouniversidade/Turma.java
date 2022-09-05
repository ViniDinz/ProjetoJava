package projetouniversidade;

import java.util.ArrayList;

public class Turma {

	private String Codigo;
	private String Disciplina;
	private Professor professor;
	private ArrayList<Aluno> ListaDeAlunos;
	
	ArrayList<Turma> Turmas = new ArrayList();
	
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		this.Codigo = codigo;
	}
	public String getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.Disciplina = disciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public ArrayList<Aluno> getListaDeAlunos() {
		return ListaDeAlunos;
	}
	public void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos) {
		this.ListaDeAlunos = listaDeAlunos;
	}
	
	public void cadastrarTurma(Turma turma, String Codigo, String Disciplina, Professor professor, ArrayList<Aluno> listaaluno)
	{
		if(Turmas.contains(turma))
		{
			System.out.println("Turma ja existe");
		}
		else
		{
			turma.setCodigo(Codigo);
			turma.setDisciplina(Disciplina);
			turma.setProfessor(professor);
			turma.setListaDeAlunos(listaaluno);
			Turmas.add(turma);
		}
	}
	public void alterarTurma(Turma turma, String Codigo, String Disciplina, Professor professor, ArrayList<Aluno> listaaluno)
	{
		if(Turmas.contains(turma))
		{
		   turma.setCodigo(Codigo);
		   turma.setDisciplina(Disciplina);
		   turma.setProfessor(professor);
		   turma.setListaDeAlunos(listaaluno);
		}
		else
		{
			System.out.println("A turma não existe");
		}

	}
	public void excluirTurma(Turma turma)
	{
		if(Turmas.contains(turma))
		{int index = Turmas.lastIndexOf(turma);
		 Turmas.remove(index);			
		}
		else
		{
			System.out.println("A turma não existe");
		}
	}
		
	public void lerTurma(Turma turma)
	{int indexAluno = turma.ListaDeAlunos.size();
		System.out.println("Codigo: " + turma.getCodigo());
		System.out.println("Disciplina: " + turma.getDisciplina());
		System.out.println("Professor: " + turma.getProfessor().getNome());
		System.out.println("Alunos:");
		for(int aa = 0; aa < indexAluno; aa++)
		{
			System.out.println("  " + turma.getListaDeAlunos().get(aa).getNome() + " Nota: " + turma.ListaDeAlunos.get(aa).getNota());
		}
		
	}
	
	public static void main(String[] args)
	{   ArrayList<Aluno> alunosTurma1 = new ArrayList();
	ArrayList<Aluno> alunosTurma2 = new ArrayList();
		Turma Listaturma = new Turma();
		Turma turma1 = new Turma();
		Turma turma2 = new Turma();
		Professor professor1 = new Professor("Vinicius" , "10");
		Professor professor2 = new Professor("Karia", "99");

		Aluno aluno1 = new Aluno("Vinicius", "1", 10);
		Aluno aluno2 = new Aluno("João", "2", 1);
		Aluno aluno3 = new Aluno("Maria", "3", 5);
		Aluno aluno4 = new Aluno("Kiana", "4", 6);
		Aluno aluno5 = new Aluno("Mei", "5", 9);
		Aluno aluno6 = new Aluno("Ei", "6", 7);
		alunosTurma1.add(aluno1);
		alunosTurma1.add(aluno2);
		alunosTurma1.add(aluno3);
		alunosTurma2.add(aluno4);
		alunosTurma2.add(aluno5);
		alunosTurma2.add(aluno6);
		
		Listaturma.cadastrarTurma(turma1, "1010", "Matematica", professor1, alunosTurma1);
	    Listaturma.cadastrarTurma(turma2, "2020", "Quimica", professor2, alunosTurma2);
	    Listaturma.alterarTurma(turma1, "3030", "Fisica", professor2, alunosTurma1);
	    Listaturma.excluirTurma(turma2);
	    Listaturma.lerTurma(turma1);
	    
		
	}
			
	
}
