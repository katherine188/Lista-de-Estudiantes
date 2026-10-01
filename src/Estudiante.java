public class Estudiante {

    String ci;
    String nombre;
    String apellido;
    String sexo;
    int año;
    String mes;
    boolean militanteUJC;
    boolean becado;

    public Estudiante(String ci, String nombre, String apellido,
                      String sexo, int año, String mes,
                      boolean militanteUJC, boolean becado) {

        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.año = año;
        this.mes = mes;
        this.militanteUJC = militanteUJC;
        this.becado = becado;
    }
}
