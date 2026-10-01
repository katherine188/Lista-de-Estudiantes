public class ListaEstudiantes {

    private Nodo cabeza;

    public void agregar(Estudiante estudiante) {

        Nodo nuevo = new Nodo(estudiante);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
    }

    public String Cumpleaños(String mes) {

        String resultado = "";
        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.estudiante.mes.equalsIgnoreCase(mes)) {
                resultado += actual.estudiante.nombre + "\n";
            }

            actual = actual.siguiente;
        }

        return resultado;
    }

    public void CantMilitantes() {

        Nodo actual = cabeza;

        while (actual != null) {

            Nodo menor = actual;
            Nodo siguiente = actual.siguiente;

            while (siguiente != null) {

                if (siguiente.estudiante.militanteUJC
                        && (!menor.estudiante.militanteUJC
                        || siguiente.estudiante.año < menor.estudiante.año)) {

                    menor = siguiente;
                }

                siguiente = siguiente.siguiente;
            }

            Estudiante temporal = actual.estudiante;
            actual.estudiante = menor.estudiante;
            menor.estudiante = temporal;

            actual = actual.siguiente;
        }

        actual = cabeza;

        while (actual != null) {

            if (actual.estudiante.militanteUJC) {

                System.out.println(
                        actual.estudiante.nombre + " "
                                + actual.estudiante.apellido + " - "
                                + actual.estudiante.año
                );
            }

            actual = actual.siguiente;
        }
    }

    public int CantBecados() {

        int cantidad = 0;
        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.estudiante.becado) {
                cantidad++;
            }

            actual = actual.siguiente;
        }

        return cantidad;
    }
}