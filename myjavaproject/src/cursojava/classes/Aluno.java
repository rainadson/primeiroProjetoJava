package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cursojava.constantes.StatusAluno;

/* Esta é nossa classe/objeto que representa o aluno*/
public class Aluno {
	/* são os atributos do Aluno */
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() { /* Cria os dados na memoria - sendo padrão do java */
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	/* Veremos os metodos setters e getters do Objeto */
	/* SET é para adicionar dados para os atributos */
	/* GET é para receber dados para os atributos */

	/* recebe dados */

	/* metodo que retorna a media do aluno */
	public double getMediaNota() {
		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();

		}
		return somaNotas / disciplinas.size();
	}

	/*
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return "aluno está aprovado";
			}else {
				return "aluno está em recuperação;
			}
			return true;
		} else {
			return false;
		}
	}*/

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}

	public void setNome(String nome) {
		// TODO Auto-generated method stub

	}

	public void setIdade(Integer valueOf) {
		// TODO Auto-generated method stub

	}

	public String getNome() {
		return nome;
	}

	

}
