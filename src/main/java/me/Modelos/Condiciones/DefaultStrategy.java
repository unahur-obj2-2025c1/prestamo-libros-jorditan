package me.Modelos.Condiciones;

import me.Modelos.AnalisisPrestamoStrategy;
import me.Modelos.Socio;

public class DefaultStrategy extends AnalisisPrestamoStrategy {
  @Override
  public Boolean puedePrestaerse(Socio socio) {
    return true;
  }
}
