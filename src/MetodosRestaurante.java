
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MetodosRestaurante implements InterfaceRestaurante {
	public List<Cliente> cliente;
	public Cliente c;
	public Set<Cliente> clienteNovo;
	public List<Endereco> end;
	
	public ArrayList<Cardapio> car;

	public MetodosRestaurante() {
		this.cliente = new ArrayList<Cliente>();
		this.end = new ArrayList<Endereco>();
		
		this.car = new ArrayList<Cardapio>();
		
		this.clienteNovo = new HashSet<Cliente>();


		

	}
	

	public List<Cliente> nomesDosClientes() {
		List<Cliente> lista = new ArrayList<Cliente>();
		for (Cliente c : this.clienteNovo) {
			lista.add(c);
		}
		return lista;

	}

	public void cadastrarCliente(Cliente cliente) {
		this.cliente.add(cliente);
		this.clienteNovo.add(cliente);

	}

	public double gasto(double preco, int quantidade) {
		double v = 0;
		v = preco * quantidade;
		return v;
	}

	public int Contador(String n) {
		int contador = 0;
		for (Cliente c : this.clienteNovo) {
			if (c.getNome().equals(n)) {
				c.setQuantidadeDeVezesQueFoiNoRestaurante(contador + 1);
				contador++;

			}
		}
		return contador;

	}

	public int registros(String n) {
		int contador = 0;
		for (Cliente cliente : this.clienteNovo) {
			if (cliente.getNome().equals(n)) {
				
				cliente.setQuantidadeDeVezesQueFoiNoRestaurante(contador+1);
				contador++;
			}
		}
		return contador;

	}

	public ArrayList<Cliente> QuantidadeDeVezesQueFoiNoRestaurante(String nome) {
		ArrayList<Cliente> quantidade = new ArrayList<Cliente>();
		int cont = 0;
		
		for (Cliente c : this.cliente) {
			if (c.getNome().equals(nome)) {
				cont++;
				c.setQuantidadeDeVezesQueFoiNoRestaurante(cont);
				quantidade.add(c);

			}
		}
		return quantidade;
	}

	public int quantee() {
		return c.quantidadeDeVezesQueFoiNoRestaurante;
	}
}
