package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.util.Magica;

public class ImplementarProfessor {

	public static void main(String[] args) {

		Professor professor = new Professor();
		Endereco endereco = new Endereco();
		
		professor.setId(Magica.i("ID"));
		professor.setNome(Magica.s("Nome"));
		professor.setFormacao(Magica.s("Formação"));
		
		professor.setEndereco(endereco); //IMPORTANTE : não esquecer de atribuir o objeto
		
		endereco.setLogradouro(Magica.s("Logradouro"));
		endereco.setNumero(Magica.s("Número"));
		endereco.setComplemento(Magica.s("Complemento"));
		endereco.setBairro(Magica.s("Bairro"));
		endereco.setCidade(Magica.s("Cidade"));
		endereco.setEstado(Magica.s("Estado"));
		endereco.setCep(Magica.s("CEP"));
		
		
		System.out.println(professor.getAll());
		
		System.out.println(professor.getEndereco().getCidade());

	}
}
