package Atv08;

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

    
}