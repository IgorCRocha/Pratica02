package br.com.estoque;

public class Estoque {
    private String nome;
    private int qtdAtual, qtdMinima;

    public Estoque() {}

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setQtdAtual(int qtdAtual) { this.qtdAtual = qtdAtual; }
    public void setQtdMinima(int qtdMinima) { this.qtdMinima = qtdMinima; }
    public String getNome() {return nome; }

    public int getQtdAtual() { return qtdAtual; }

    public int getQtdMinima() { return qtdMinima; }

    public void darBaixa(int qtde) {
        if(qtde<=qtdAtual )
    qtdAtual = qtdAtual - qtde;
        else
            System.out.println("estoque insuficiente para baixa");
    }
    public String mostra(){
        return "produto" + getNome() +"\nQtde Minima:" +getQtdMinima()+"\nQtde Atual:" +getQtdAtual();
    }
    public boolean prescisaRepor(){
        if(getQtdAtual()<=getQtdMinima())
            return true;
        else
            return false;
    }

}
