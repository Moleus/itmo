package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Swagger extends StatusMove {

  public Swagger() {
    super(Type.NORMAL, 0, 0.9);
  }

  @Override
  protected void applyOppEffects(Pokemon opp) {
    opp.setMod(Stat.ATTACK, 2);
    Effect.confuse(opp);
  }

  @Override
  protected String describe() {
    return "used Swagger";
  }
}