package me.Modelos;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Socio {
    private Double deuda;
    private LocalDate fechaNacimiento;
    public String nombre;
    private LocalDate socioDesde;

    public Socio(String nombre, LocalDate fechaNacimiento, LocalDate socioDesde) {
      this.deuda = 0.0;
      this.socioDesde = fechaNacimiento;
      this.nombre = nombre;
      this.socioDesde = socioDesde;
    }

    public Double getDeuda() {
      return this.deuda;
    }

    public LocalDate getSocioDesde() {
      return this.socioDesde;
    }

    public Boolean esMayorDeEdad() {
    LocalDate hoy = LocalDate.now();
      return Period.between (fechaNacimiento, hoy).getYears() >= 18;
    }

    public Boolean tieneDeuda() {
      return this.deuda > 0.0;
    }

    public Boolean esAntiguo() {
      return ChronoUnit.MONTHS.between(socioDesde, LocalDate.now()) >= 6;
    }
}
