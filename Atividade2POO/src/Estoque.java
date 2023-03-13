public class Estoque {
    private String nome;

    private int qtdAtual;

    private int qtdMinima;

    public Estoque() {

    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;

    }
    void darBaixa(int qtde);
    String mostra(Estoque);
    boolean precisaRepor();

}
