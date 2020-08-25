
//import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.JOptionPane;

public class ClassePrincipal {

    public static void main(String args[]) throws InterruptedException {

        MetodosRestaurante ms = new MetodosRestaurante();
        Thread.sleep(1000);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (int k = 0; k < 5; k++) {
            String nome = JOptionPane.showInputDialog("Informe seu nome: ");
            String cpf = JOptionPane.showInputDialog("Informe seu cpf");
            Date dataDeEntrada = new Date();
            String telefone = JOptionPane.showInputDialog("Informe seu telefone: ");
            String rua = JOptionPane.showInputDialog("Informe sua rua: ");
            String cidade = JOptionPane.showInputDialog("Informe sua cidade: ");
            String Bairro = JOptionPane.showInputDialog("Informe seu nome:Bairro ");
            String numero = JOptionPane.showInputDialog("Informe seu numero: ");
            Endereco end = new Endereco(rua, cidade, Bairro, numero);
            //Cliente cli = new Cliente(nome, telefone, end);
            //Cliente ce = new Cliente(nome,dataDeEntrada);
            Cliente cliente = new Cliente(nome, cpf, telefone, dataDeEntrada, end, k);
            ms.cadastrarCliente(cliente);

        }
        
        String nomee = JOptionPane.showInputDialog("Informe o nome da pessoa para saber a quantidade de vezes que essa pessoa ja foi no restaurante: ");

        System.out.println("_________________________________________________________________");
        System.out.println("Quantidade de vezes: "+ms.registros(nomee));
        
        System.out.println("-------------------------------------------------------------------");
        
        System.out.println("nomes dos cliente atualizado"+ms.nomesDosClientes());
        System.out.println("CARDAPIO");

        Comidas t[] = Comidas.values();
        for (Comidas d1 : t) {
            Thread.sleep(1000);
            System.out.println(d1);
            System.out.println("---------------------------");
        }

        System.out.println("CóDIGOS DAS COMIDAS ");
        CodigosDeComidas p[] = CodigosDeComidas.values();
        for (CodigosDeComidas d2 : p) {
            Thread.sleep(1000);
            System.out.println(d2);
            System.out.println("---------------------------");
        }

        for (int k = 0; k < 2; k++) {

            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do produto: "));
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que voce vai querer: "));
            double ValorArroz = 15;
            double ValorBaiaoDeDois = 25;
            double ValorFeijao = 8;
            double ValorLasanha = 30;
            switch (codigo) {
                case (1):
                    System.out.println("Voceescolheu Arroz \n ultimo pedido");
                    System.out.println("QUANTIDADE DESEJADA : "+quantidade);
                    System.out.println("O gasto foi de: " + ms.gasto(ValorArroz, quantidade));
                    break;
                case (2):
                    System.out.println("Voceescolheu Baião De Dois \n Execelente Pedido");
                    System.out.println(quantidade);
                    System.out.println("O gasto foi de: " + ms.gasto(ValorBaiaoDeDois, quantidade));
                    break;
                case (3):
                    System.out.println("Voce escolheu Feijão \n Boa Pedida");
                    System.out.println(quantidade);
                    System.out.println("O gasto foi de: " + ms.gasto(ValorFeijao, quantidade));
                    break;
                case (4):
                    System.out.println("Vocï¿½ escolheu Lasanha \n A Melhor Pedida De Sempre");
                    System.out.println(quantidade);
                    System.out.println("O gasto foi de: " + ms.gasto(ValorLasanha, quantidade));
            }
        }

    }
}
