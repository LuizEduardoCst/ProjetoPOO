public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistemaOperacional;
    MemoriaUSB memoriaUSB;
    HardwareBasico[] hardware = new HardwareBasico[3];

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " - " + sistemaOperacional.tipo + " bits");
        for (HardwareBasico hb : hardware) {
            System.out.println("Hardware: " + hb.nome + " - " + hb.capacidade + ((hb.nome.contains("Core")) ? " Mhz" : " Gb"));
        }
        if (memoriaUSB != null) memoriaUSB.mostraInfo();
        System.out.println("------------------------------");
    }
}
