package me.Modelos.Condiciones;

import me.Modelos.AnalasisPrestamoDecorator;
import me.Modelos.AnalisisPrestamoStrategy;
import me.Modelos.Socio;

public class DebajoDeUmbralUnico extends AnalasisPrestamoDecorator {
  private static Double umbral = 0.0;

  public DebajoDeUmbralUnico(AnalisisPrestamoStrategy decorado) {
    super(decorado);
  }

  public static Double getUmbral() {
    return umbral;
  }

  public static void  setUmbral(Double nuevoUmbral) {
    umbral = nuevoUmbral;
  }

  @Override 
  public Boolean condicionEspecifica(Socio socio) {
    return socio.getDeuda() <= umbral;
  }
}
