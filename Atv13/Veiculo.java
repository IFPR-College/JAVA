package Atv13;

class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String fipe;

    public Veiculo(String marca, String modelo, int ano, String fipe) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.fipe = fipe;
    }

    public String getFipe(){
        return fipe;
    }

    public void setFipe(String fipe){
        this.fipe = fipe;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor da FIPE: " + fipe);
    }
}

class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas, String fipe) {
        super(marca, modelo, ano, fipe);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + numeroDePortas);
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas, String fipe) {
        super(marca, modelo, ano, fipe);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }
}

