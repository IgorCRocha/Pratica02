package br.com.estoque;

public class EstoqueMain {

        public static void main(String[] args) {
            Estoque e = new Estoque();
            e.setNome("Caneta");
            e.setQtdAtual(10);
            e.setQtdMinima(5);
            System.out.println(e.mostra());
        }

}
