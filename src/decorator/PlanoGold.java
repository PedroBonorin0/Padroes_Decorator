package decorator;

public class PlanoGold implements Plano {
  public String nomePlano;

  public PlanoGold() {
    this.nomePlano = "Plano Gold";
  }

  @Override
  public String getBeneficio() {
    return nomePlano;
  }
}
