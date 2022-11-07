package decorator;

public class KitTorcedor extends PlanoDecorator {
  public KitTorcedor(Plano plano) {
    super(plano);
  }

  @Override
  public String getNomeBeneficio() {
    return "Recebimento de Kit Torcedor em casa";
  }

}