public class Flareon extends Eevee{
  public Flareon() {
    super("Fogo", 25.0, 90, 130, "Não possui");
  }

  @Override
  public String ataque() {
      return "Brasa - Ember";
  }

  @Override
  public String defesa() {
      return "Encanto - Charm";
  }

  @Override
  public String especial() {
      return "Explosão de Fogo - Fire Blast";
  }
}
