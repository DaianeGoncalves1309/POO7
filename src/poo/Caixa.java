package poo;

public class Caixa {
    private double saldo; // Variável para armazenar o saldo inicial

    // Construtor que inicializa o saldo com zero
    public Caixa() {
        saldo = 0.0;
    }

    // Método para fazer uma venda e atualizar o saldo
    public double fazerVenda(double valorProduto) {
        if (valorProduto >= 0) {
            saldo += valorProduto;
            return saldo;
        } else {
            System.out.println("O valor do produto não pode ser negativo.");
            return saldo; // Retorna o saldo atual sem fazer a venda
        }
    }

    // Método para consultar o saldo atual
    public double consultarSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe Caixa
        Caixa caixa = new Caixa();

        // Fazendo algumas vendas de produtos
        System.out.println("Saldo inicial: " + caixa.consultarSaldo());
        caixa.fazerVenda(50.0);
        System.out.println("Novo saldo após a primeira venda: " + caixa.consultarSaldo());
        caixa.fazerVenda(30.0);
        System.out.println("Novo saldo após a segunda venda: " + caixa.consultarSaldo());

        // Tentando fazer uma venda com valor negativo
        caixa.fazerVenda(-10.0);

        // Consultando o saldo novamente
        System.out.println("Saldo atual: " + caixa.consultarSaldo());
    }
}
