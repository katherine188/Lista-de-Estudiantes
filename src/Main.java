public class Main {

    public static void main(String[] args) {

        ListaEstudiantes lista = new ListaEstudiantes();

        // Agregar estudiantes
        lista.agregar(new Estudiante(
                "010101", "Ana", "Gomez",
                "F", 2004, "Marzo", true, true));

        lista.agregar(new Estudiante(
                "020202", "Carlos", "Perez",
                "M", 2002, "Julio", false, false));

        lista.agregar(new Estudiante(
                "030303", "Maria", "Rodriguez",
                "F", 2005, "Marzo", true, true));

        lista.agregar(new Estudiante(
                "040404", "Luis", "Garcia",
                "M", 2003, "Enero", true, false));

        lista.agregar(new Estudiante(
                "050505", "Sofia", "Martinez",
                "F", 2006, "Marzo", false, true));

        lista.agregar(new Estudiante(
                "060606", "Pedro", "Hernandez",
                "M", 2001, "Mayo", true, false));


        // 1. Probar Cumpleaños()
        System.out.println("1. Estudiantes que cumplen años en Marzo:");

        String cumpleanos = lista.Cumpleaños("Marzo");

        System.out.println(cumpleanos);


        // 2. Probar CantMilitantes()
        System.out.println("2. Estudiantes militantes de la UJC:");

        lista.CantMilitantes();


        // 3. Probar CantBecados()
        System.out.println("\n3. Cantidad de estudiantes becados:");

        System.out.println(lista.CantBecados());
    }
}