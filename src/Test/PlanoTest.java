package Test;

import decorator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoTest {

  @Test
  void deveRetornarPlanoBasico() {
    Plano plano = new PlanoBasico();
    String texto = "Plano Básico";
    assertEquals(texto, plano.getBeneficio());
  }

  @Test
  void deveRetornarPlanoBasicoComDesconto() {
    Plano plano = new Desconto(new PlanoBasico());
    String texto = "Plano Básico -> 10% de Desconto em Jogos e Produtos";
    assertEquals(texto, plano.getBeneficio());
  }

  @Test
  void deveRetornarPlanoBasicoComDescontoEAcesso() {
    Plano plano = new AcessoTreinos(new Desconto(new PlanoGold()));
    String texto = "Plano Gold -> 10% de Desconto em Jogos e Produtos -> Acesso aos treinos da equipe";
    assertEquals(texto, plano.getBeneficio());
  }

  @Test
  void deveRetornarPlanoBasicoComDescontoAcessoEKitTorcedor() {
    Plano plano = new KitTorcedor(new AcessoTreinos(new Desconto(new PlanoPremium())));
    String texto = "Plano Premium -> 10% de Desconto em Jogos e Produtos -> Acesso aos treinos da equipe -> Recebimento de Kit Torcedor em casa";
    assertEquals(texto, plano.getBeneficio());
  }
}