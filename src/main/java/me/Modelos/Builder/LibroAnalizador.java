package me.Modelos.Builder;

import me.Modelos.AnalisisPrestamoStrategy;
import me.Modelos.Libro;
import me.Modelos.Condiciones.DebajoDeUmbralUnico;
import me.Modelos.Condiciones.DefaultStrategy;
import me.Modelos.Condiciones.SinDeudaStrategy;
import me.Modelos.Condiciones.AdultosStrategy;

public class LibroAnalizador {
  private String nombre; 
  private AnalisisPrestamoStrategy analizadorPrestamo = new DefaultStrategy();

  public LibroAnalizador(String nombre) {
    this.nombre = nombre;
  }

  public Libro build() {
    Libro libro = new Libro(this.nombre);
    libro.setAnalizadorPrestamos(analizadorPrestamo);
    return libro;
  }

  public LibroAnalizador clasico() {
    this.analizadorPrestamo = new AdultosStrategy(analizadorPrestamo);
    return this;
  }

  public LibroAnalizador adulto() {
    this.analizadorPrestamo = new AdultosStrategy(analizadorPrestamo);
    return this;
  }

  public LibroAnalizador sinDeuda() {
    this.analizadorPrestamo = new SinDeudaStrategy(analizadorPrestamo);
    return this;
  }

  public LibroAnalizador umbral() {
    this.analizadorPrestamo = new DebajoDeUmbralUnico(analizadorPrestamo);
    return this;
  }

}