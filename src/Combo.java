public class Combo { // Facade

    private Burguer burguer = new Burguer();
    private Sobremesa sobremesa = new Sobremesa();
    private Bebida bebida = new Bebida();

    public void CriarCombo(int tipo) {
        switch(tipo) {
            case 1: {
                burguer.setDescricao("X-Salada");
                burguer.setPreco("35.90");
                burguer.setGramas(200);

                sobremesa.setDescricao("Sorvete");
                sobremesa.setPreco("15.99");
                sobremesa.setTamanho("Médio");

                bebida.setDescricao("Fanta uva");
                bebida.setPreco("10.99");
                bebida.setMl(500);
                break;
            }
            case 2: {
                burguer.setDescricao("X-Tudo");
                burguer.setPreco("40.00");
                burguer.setGramas(300);

                sobremesa.setDescricao("Bolo");
                sobremesa.setPreco("22.99");
                sobremesa.setTamanho("Médio");

                bebida.setDescricao("Coca");
                bebida.setPreco("12.99");
                bebida.setMl(600);
                break;
            }
            default:
                System.out.println("Valor inválido");
        }
    }

    @Override
    public String toString() {
        return "Burguer: " + burguer.getDescricao() + ", Preço: " + burguer.getPreco() + ", Gramas: " + burguer.getGramas() +
                "\nSobremesa: " + sobremesa.getDescricao() + ", Preço: " + sobremesa.getPreco() + ", Tamanho: " + sobremesa.getTamanho() +
                "\nBebida: " + bebida.getDescricao() + ", Preço: " + bebida.getPreco() + ", mL: " + bebida.getMl();
    }
}
