
public class Main {

    public static void main(String args[])
    {
        // Primera Persona
        Persona persona = new Persona();
        persona.setNombres("Henry");
        persona.setApellidos("Poincare");
        System.out.println(persona.getNombres());
        System.out.println(persona.getApellidos());

        persona.setDni(new Dni(15151515));
        System.out.println(persona.getDni().getDni());

        //agregando curso
        persona.agregarCurso(new Curso(234,"poo",4));
        persona.agregarCurso(new Curso(567,"Md",4));
        persona.agregarCurso(new Curso(891,"Al",4));
        persona.mostrarCurso();




    }
}
