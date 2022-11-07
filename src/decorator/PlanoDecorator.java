package decorator;

public abstract class PlanoDecorator implements Plano{

  private Plano plano;
  public String beneficio;

  public PlanoDecorator(Plano plano) {
    this.plano = plano;
  }

  public Plano getPlano() {
    return plano;
  }

  public void setPlano(Plano plano) {
    this.plano = plano;
  }

  public abstract String getNomeBeneficio();

  public String getBeneficio() {
    return this.plano.getBeneficio() + " -> " + this.getNomeBeneficio();
  };
}
