package Atv08;

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

        System.out.println("Código: " + cliente.getCodigo());
        System.out.println("Nome: " + cliente.nome);
        System.out.println("Email: " + cliente.email);
        System.out.println("Cartão de Crédito: " + cliente.getCartaoCredito());
        System.out.println("CEP: " + cliente.cep);
        System.out.println("Endereço: " + cliente.endereco);
        System.out.println("Cidade: " + cliente.cidade);
        System.out.println("Estado: " + cliente.endereco);


    }
}
