package main;

import java.util.Date;

import model.Emprestimo;
import model.Pessoa;
import model.Livro;

public class Main {
	public static void main(String[] args){
		Emprestimo emprestimo = new Emprestimo();
		
		emprestimo.idEmprestimo = (long) 123 ;
		emprestimo.dataEmprestimo = new Date(0, 0, 0);
		emprestimo.dataDevolucao = new Date(0, 0, 0);
		
		emprestimo.livro = new Livro();
		emprestimo.livro.idLivro = (long) 456;
		emprestimo.livro.titulo = "";
		emprestimo.livro.autor = "";
		emprestimo.livro.emprestado = false;
		
		emprestimo.pessoa = new Pessoa();
		emprestimo.pessoa.idPessoa = (long) 789;
		emprestimo.pessoa.nome = "";			
	}
}
