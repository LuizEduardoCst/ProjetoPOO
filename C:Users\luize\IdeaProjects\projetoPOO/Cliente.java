public class Cliente {
    String nome;
    long cpf;
    Computador[] carrinho = new Computador[10];
    int cont = 0;

    public void addPC(Computador pc) {
            carrinho[cont] = pc;
            cont++;

    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < cont; i++) {
            total += carrinho[i].preco;
        }
        return total;
    }

    public void mostraCarrinho() {
        System.out.println("Cliente: " + nome + " - CPF: " + cpf);
        System.out.println("Comprou os seguintes computadores:");
        for (int i = 0; i < cont; i++) {
            carrinho[i].mostraPCConfigs();
        }
        System.out.println("Total da compra: R$" + calculaTotalCompra());
    }
}
