package decorator;

public class PlanoPremium implements Plano {
  public String nomePlano;

  public PlanoPremium() {
    this.nomePlano = "Plano Premium";
  }

  @Override
  public String getBeneficio() {
    return nomePlano;
  }
}
