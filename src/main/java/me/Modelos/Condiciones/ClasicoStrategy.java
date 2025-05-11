package me.Modelos.Condiciones;

import me.Modelos.AnalasisPrestamoDecorator;
import me.Modelos.AnalisisPrestamoStrategy;
import me.Modelos.Socio;

public class ClasicoStrategy extends AnalasisPrestamoDecorator {

  public ClasicoStrategy(AnalisisPrestamoStrategy decorado) {
    super(decorado);
  }


  @Override 
  public Boolean condicionEspecifica(Socio socio) {
    return socio.esAntiguo();
  }
}
