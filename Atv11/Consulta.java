package Atv11;

public class Consulta {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setAltura(1.50);
        pessoa.setIdade(15);
        pessoa.setNome("Julio");

        System.out.println("Informações do paciente:");
        System.out.println("Nome: " + pessoa.getIdade());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura() + "m");
    }
}
