
	public abstract class Cardapio {
		public String nome;
		
		public Cardapio(String nome){
			this.nome = nome;
			
			
		}
		
		
		public Cardapio(){
			this.nome = "MAST CHEF RUAN";
		}
		public abstract String Codigo();
		public abstract double Preco();
		
		
		
		

	}



