package Atv12;

public class TestesClasses {
    public static void main(String[] args) {
        Funcionario Funcionario = new Funcionario();

        Funcionario.setNome("Alberto Pereira");
        Funcionario.setRg("456655897");
        Funcionario.setCartao("1234-4569-9874-4789");

        PessoaFisica PessoaFisica = new PessoaFisica();

        PessoaFisica.setNome("Maria Fernanda");
        PessoaFisica.setRg("665412351");

        PessoaJuridica PessoaJuridica = new PessoaJuridica();

        PessoaJuridica.setCnpj("12.345.678/0001-90");
        PessoaJuridica.setNome("Consórcios Empresarial Alagoas");


        System.out.println("Nome do funcionario: " + Funcionario.getNome());
        System.out.println("RG do funcionario: " + Funcionario.getRg());
        System.out.println("Cartão do funcionario: " + Funcionario.getCartao());
        System.out.println("----------------------------");
        System.out.println("Pessoa Física: " + PessoaFisica.getNome());
        System.out.println("RG da pessoa Física: " + PessoaFisica.getRg());
        System.out.println("----------------------------");
        System.out.println("Pessoa Juridica: " + PessoaJuridica.getNome());
        System.out.println("CNPJ da pessoa Juridica: " + PessoaJuridica.getCnpj());
    }
}
