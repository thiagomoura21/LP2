package lp2.lab03.entidades;

/**
 * 
 * Laboratório de Programação 2 - Lab 03
 * @author Thiago Santos de Moura - 116210967
 */

import lp2.lab03.util.Checks;

public class Aluno {

	private String matricula;

	private String nome;

	private String curso;

	public Aluno(String matricula, String nome, String curso) {

		Checks.verificaMatriculaNula(matricula);
		Checks.verificaMatriculaVazia(matricula);
		Checks.verificaNomeNulo(nome);
		Checks.verificaNomeVazio(nome);
		Checks.verificaCursoNulo(curso);
		Checks.verificaCursoVazio(curso);

		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getCurso() {
		return curso;
	}

	@Override
	public String toString() {
		return matricula + " - " + nome + " - " + curso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno ref = (Aluno) obj;

		if (ref.getMatricula().equals(this.getMatricula()))
			return true;

		return false;
	}

}
