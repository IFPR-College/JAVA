package Atv09;

public class CadastroDeClientes {
    public static void main(String[] args){

        Cliente cliente = new Cliente();
        
        cliente.setCodigo(1);
        cliente.setCartaoCredito(5);
        cliente.cep = 85818430;
        cliente.cidade = "Cascavel";
        cliente.estado = "Parana";
        cliente.endereco = "Rua Roma";
        cliente.nascimento = "24/12/2004";
        cliente.nome = "Luiz Otavio";
        cliente.email = "luizpolido@outlook.com";

        cliente.exibirInfoCliente();
    }
}
