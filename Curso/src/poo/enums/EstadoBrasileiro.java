package poo.enums;

public enum EstadoBrasileiro {

    PIAUI("Piaui", "PI"),
    MARANHAO("Maranhao", "MA"),
    SAO_PAULO("Sao Paulo", "SP"),
    RIO_DE_JANEIRO("Rio Janeiro", "RJ"),
    CEARA("Ceara", "CE")
    ;


    private String nome;
    private String sigla;

    private EstadoBrasileiro(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
