package Atv09;

public class Cliente {
    private int codigo;
    public String nome;
    public String nascimento;
    public String endereco;
    public String cidade;
    public String estado;
    public int cep;
    public String email;
    private int cartaoCredito;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(int cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public void exibirInfoCliente(){
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Cartão de Crédito: " + this.getCartaoCredito());
        System.out.println("CEP: " + this.cep);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.endereco);
    }
    
}