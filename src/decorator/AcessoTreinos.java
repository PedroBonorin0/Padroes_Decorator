package decorator;

public class AcessoTreinos extends PlanoDecorator {
  public AcessoTreinos(Plano plano) {
    super(plano);
  }

  @Override
  public String getNomeBeneficio() {
    return "Acesso aos treinos da equipe";
  }

}