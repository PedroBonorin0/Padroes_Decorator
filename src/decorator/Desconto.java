package decorator;

public class Desconto extends PlanoDecorator {
  public Desconto(Plano plano) {
    super(plano);
  }

  @Override
  public String getNomeBeneficio() {
    return "10% de Desconto em Jogos e Produtos";
  }

}
