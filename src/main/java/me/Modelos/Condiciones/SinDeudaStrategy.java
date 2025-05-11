package me.Modelos.Condiciones;

import me.Modelos.AnalasisPrestamoDecorator;
import me.Modelos.AnalisisPrestamoStrategy;
import me.Modelos.Socio;

public class SinDeudaStrategy extends AnalasisPrestamoDecorator{
  
  public SinDeudaStrategy( AnalisisPrestamoStrategy decorado) {
    super(decorado);
  }

  @Override 
  public Boolean condicionEspecifica(Socio socio) {
    return !socio.tieneDeuda();
  }
}
