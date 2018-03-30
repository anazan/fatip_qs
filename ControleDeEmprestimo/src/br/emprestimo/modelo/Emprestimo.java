package br.emprestimo.modelo;




public class Emprestimo {
	private Livro livro;
	private Usuario usuario;
	private String dataEmprestimo;
	private String dataDevolucao;
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		if (livro != null) {
		this.livro = livro;
		} else {
		throw new RuntimeException("Dados invalidos.");
		}
		}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		if (usuario != null) {
		this.usuario = usuario;
		} else {
		throw new RuntimeException("Dados invalidos.");
		}
		}
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
}
