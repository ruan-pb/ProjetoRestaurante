
public class Funcionario {
	private String nome;
	private double salario;
	private double bonificacao;
	private String senha;
	private int diasDeTrabalho;

	
	
	
	public Funcionario(String nome,double salario,double bonificacao,String senha,int dt){
		this.nome = nome;
		this.salario = salario;
		this.bonificacao = bonificacao;
		this.senha = senha;
		this.diasDeTrabalho = dt;
	}
	public Funcionario(){
		this.nome = "SEM NOME DE FUNCIONARIO";
		this.salario = 00.00;
		this.bonificacao = 00.00;
		this.senha = "SEM SENHA";
		this.diasDeTrabalho = 0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getBonificacao() {
		return bonificacao;
	}
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getDiasDeTrabalho() {
		return diasDeTrabalho;
	}
	public void setDiasDeTrabalho(int diasDeTrabalho) {
		this.diasDeTrabalho = diasDeTrabalho;
	}
}
