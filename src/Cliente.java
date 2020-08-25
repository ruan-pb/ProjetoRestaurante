import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	private Date momento;
	private Endereco end;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public int quantidadeDeVezesQueFoiNoRestaurante;

	public int getQuantidadeDeVezesQueFoiNoRestaurante() {
		return quantidadeDeVezesQueFoiNoRestaurante;
	}

	public void setQuantidadeDeVezesQueFoiNoRestaurante(int quantidadeDeVezesQueFoiNoRestaurante) {
		this.quantidadeDeVezesQueFoiNoRestaurante += quantidadeDeVezesQueFoiNoRestaurante;
	}
	

	public Cliente(String nome, String cpf, String telefone, Date momento, Endereco end,
			int quantidadeDeVezesQueFoiNoRestaurante) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.momento = momento;
		this.end = end;
		this.quantidadeDeVezesQueFoiNoRestaurante = quantidadeDeVezesQueFoiNoRestaurante;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Cliente(String n, String tele, Endereco end) {
		this.nome = n;
		this.telefone = tele;
		this.end = end;
	}

	public Cliente(String nome,Date momento) {
		this.nome = nome;
		this.momento = momento;
	}

	public Cliente(String telefone, Endereco end) {
		this.telefone = telefone;
		this.end = end;
	}

	public Cliente() {
		this.nome = "SEM NOME";
		this.cpf = "SEM CPF";
		this.telefone = "0000-0000";

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}
	

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	
	//utilizar o StringBuild para fazer isso
	public String toString() {
		return "Nome do cliente : " + this.nome + " \n" + " quantidade de vezes que ele veio foi ao Restaurente: "
				+ this.quantidadeDeVezesQueFoiNoRestaurante + "\n"+"Data de entrada: "+sdf.format(momento)+"\n"+"----------------------------------"+"\n";
	}

}
