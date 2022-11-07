package decorator;

public class PlanoBasico implements Plano {
  public String nomePlano;

  public PlanoBasico() {
    this.nomePlano = "Plano Básico";
  }

  @Override
  public String getBeneficio() {
    return nomePlano;
  }
}
