
public class Endereco {
	private String nomeDaRua;
	private String cidade;
	private String bairro;
	private String numero;
	
	
	
	
	public Endereco(String nomeDaRua,String cidade, String bairro,String numero){
		this.nomeDaRua = nomeDaRua;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numero = numero;
	}
	public Endereco(String nomeDaRua,String bairro){
		this.nomeDaRua = nomeDaRua;
		this.bairro = bairro;
	}
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	public Endereco(){
		this.nomeDaRua = "NO MOMENTO SEM INFORMAÇÔES SOBRE A RUA";
		this.cidade = "SEM NOME DE CIDADE";
		this.bairro = "SEM NOME DE BAIRRO ";
		this.numero = "ENDEREÇO SEM NUMERO";
	}
	public String getNomeDaRua() {
		return nomeDaRua;
	}
	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String toString(){
		return this.bairro+"-"+this.cidade+"-"+this.nomeDaRua+"-"+this.numero;
	}
	

}
