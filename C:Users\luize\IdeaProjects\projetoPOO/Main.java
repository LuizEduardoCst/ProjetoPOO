import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  pede matrícula do usuário
        System.out.print("Digite sua matrícula: ");
        int matricula = sc.nextInt();
        sc.nextLine(); // limpa o buffer do scanner

        //  Promoção 1
        Computador promo1 = new Computador();
        promo1.marca = "Apple";
        promo1.preco = matricula;
        promo1.sistemaOperacional = new SistemaOperacional("Linux Ubuntu", 32);
        promo1.hardware[0] = new HardwareBasico("Pentium Core i3", 2200);
        promo1.hardware[1] = new HardwareBasico("Memoria RAM", 8);
        promo1.hardware[2] = new HardwareBasico("HD", 500);
        promo1.memoriaUSB = new MemoriaUSB("Pen-drive", 16);

        //  Promoção 2
        Computador promo2 = new Computador();
        promo2.marca = "Samsung";
        promo2.preco = matricula + 1234;
        promo2.sistemaOperacional = new SistemaOperacional("Windows 8", 64);
        promo2.hardware[0] = new HardwareBasico("Pentium Core i5", 3370);
        promo2.hardware[1] = new HardwareBasico("Memória RAM", 16);
        promo2.hardware[2] = new HardwareBasico("HD", 1000);
        promo2.memoriaUSB = new MemoriaUSB("Pen-drive", 32);

        //  Promoção 3
        Computador promo3 = new Computador();
        promo3.marca = "Dell";
        promo3.preco = matricula + 5678;
        promo3.sistemaOperacional = new SistemaOperacional("Windows 10", 64);
        promo3.hardware[0] = new HardwareBasico("Pentium Core i7", 4500);
        promo3.hardware[1] = new HardwareBasico("Memória RAM", 32);
        promo3.hardware[2] = new HardwareBasico("HD", 2000);
        promo3.memoriaUSB = new MemoriaUSB("HD Externo", 1000);

        //  Dados do cliente
        Cliente cliente = new Cliente();
        System.out.print("Digite seu nome: ");
        cliente.nome = sc.nextLine();
        System.out.print("Digite seu CPF: ");
        cliente.cpf = sc.nextLong();

        int opcao;
        do {
            System.out.println("\nEscolha uma promoção para adicionar ao carrinho:");
            System.out.println("1 - Promoção Apple");
            System.out.println("2 - Promoção Samsung");
            System.out.println("3 - Promoção Dell");
            System.out.println("0 - Finalizar compras");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: cliente.addPC(promo1); break;
                case 2: cliente.addPC(promo2); break;
                case 3: cliente.addPC(promo3); break;
                case 0: System.out.println("Finalizando compras..."); break;
                default: System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        // resumo da compra
        cliente.mostraCarrinho();
        sc.close();
    }
}
