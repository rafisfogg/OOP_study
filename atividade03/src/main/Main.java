package main;

import model.Endereco;

import java.util.Date;

import model.Contato;
import model.Pessoa;

public class Main {
	public static void main(String[] args){
	Pessoa pessoa = new Pessoa();
	
	pessoa.nome = "";
	pessoa.sobrenome = "";
	pessoa.nascimento = new Date(0, 0, 0);
	
	pessoa.contato = new Contato();
	pessoa.contato.telefone = "";
	pessoa.contato.email = "";
	pessoa.contato.descricao = "";
	
	pessoa.contato.endereco = new Endereco();
	pessoa.contato.endereco.logradouro = "";
	pessoa.contato.endereco.cep = "";
	pessoa.contato.endereco.numero = 123;
	pessoa.contato.endereco.complemento = "";
	pessoa.contato.endereco.cidade = "";	
	}	
}
