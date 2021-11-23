package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			/* new aluno é uma instacia, criação de Objeto */
			/* aluno1 é uma variavel que faz referencia a */

			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno" + qtd + "?");
			String idade = JOptionPane.showInputDialog("Qual a idade do Aluno?");

			/*
			 * String disciplina1 = JOptionPane.showInputDialog("Disciplina1?"); String
			 * nota1 = JOptionPane.showInputDialog("Qual a idade do Nota 1?");
			 * 
			 * String disciplina2 = JOptionPane.showInputDialog("Disciplina2?"); String
			 * nota2 = JOptionPane.showInputDialog("Qual a idade do Nota 2?");
			 * 
			 * String disciplina3 = JOptionPane.showInputDialog("Disciplina3?"); String
			 * nota3 = JOptionPane.showInputDialog("Qual a idade do Nota 3?");
			 * 
			 * String disciplina4 = JOptionPane.showInputDialog("Disciplina4?"); String
			 * nota4 = JOptionPane.showInputDialog("Qual a idade do Nota 4?");
			 */

			Aluno aluno1 = new Aluno(); /* Aqui será o João */

			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("nome da disciplina" + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("nota da disciplina" + pos + "?");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1,2,3,4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}

			alunos.add(aluno1);
		}

		for (Aluno aluno : alunos) {

			System.out.println("Nome do Aluno 1 é = " + (aluno));
			System.out.println("A Media do Aluno é = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("---------------------------------------------");

		}

		/*
		 * System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" :
		 * "Reprovado"));
		 */
	}
}
