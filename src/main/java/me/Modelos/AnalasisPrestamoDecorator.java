package me.Modelos;

public abstract class AnalasisPrestamoDecorator extends AnalisisPrestamoStrategy{
  private AnalisisPrestamoStrategy decorado;

  public AnalasisPrestamoDecorator(AnalisisPrestamoStrategy decorado) {
    this.decorado = decorado;
  }

  public AnalisisPrestamoStrategy getDecorado() {
    return this.decorado;
  }

  @Override
  public Boolean puedePrestaerse(Socio socio) {
    return true;
  }

  public abstract Boolean condicionEspecifica(Socio socio);
}
