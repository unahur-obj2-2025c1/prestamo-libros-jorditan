package me.Modelos;

public class Libro {
  public String nombre;
  private AnalisisPrestamoStrategy analizadorPrestamo;

  public Libro(String nombre) {
    this.nombre = nombre;
    // this.condicion = condicion;
  }
  /**
  * Me pasan la politica que va a decidir si me puedo prestar o no.
  */
  public void setAnalizadorPrestamos(AnalisisPrestamoStrategy analizadorPrestamo){
    this.analizadorPrestamo = analizadorPrestamo;
  };

  /**
  * Me preguntan si me puedo prestar o no a un determinado socio.
  */
  public Boolean puedePrestarse(Socio socio){
    return this.analizadorPrestamo.puedePrestaerse(socio);
  };

  /**
  * Recupera el nombre del Libro.
  */
  public String getNombre() {
    return this.nombre;
  }
}
