package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Livro;

public class UC06CadastrarLivro {
	
	static private Livro livro;
	@BeforeClass
	public static void setUpBeforeClass () throws Exception{
		livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
	}



	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test (expected=RuntimeException.class)
	public void CT01UC06CadastratLivro_com_titulo_invalido() {
		
		livro.setTitulo("");
	}
	
	@Test (expected=RuntimeException.class)
	public void CT02UC06CadastratLivro_com_titulo_invalido() {
		
		livro.setTitulo(null);
	}
	
	@Test
	public void CT03UC06CadastratLivro_com_sucesso() {
		assertEquals("121212", livro.getIsbn());
	}


}
