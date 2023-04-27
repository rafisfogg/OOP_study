package main;

import model.Usuario;

import java.util.Date;

import model.Emprestimo;
import model.Livro;
import model.Exemplar;

public class Main {
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		
		usuario.nome = "xx";
		usuario.cpf = 015420;
		usuario.telefone = "61984";
		usuario.matricula = "19001";
		
		Emprestimo emprestimo = new Emprestimo();
		
		emprestimo.dataDeEmprestimo = new Date(2023, 04, 25);
		emprestimo.dataPrevistaDeDevolucao = new Date(2023, 04, 25);
		emprestimo.dataDeEntregaReal = new Date(2023, 04, 25);
		emprestimo.situacao = 12;
		
		Livro livro = new Livro();
		
		livro.titulo = "xxx";
		livro.autor = "yy";
		livro.ano = new Date(2023, 04, 25);
		livro.edicao = 2;
		livro.editora = "yyy";
		livro.ISBN = "zz";
		
		Exemplar exemplar = new Exemplar();
		
		exemplar.codigo = 222;
		exemplar.cativa = false;
		exemplar.emprestada = true;
	}
}
