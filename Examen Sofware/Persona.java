public class Persona {
    private String nombres;
    private String apellidos;
    private Dni dni;
    private Curso curso[];
    private int indiceCurso;
    public Persona()
    {
         this.curso =new Curso[3];
         this.indiceCurso = 0;
    }
    public Persona(String nombres, String apellidos)
    {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Dni getDni() {
        return dni;
    }
    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public void agregarCurso(Curso curso){
        this.curso[this.indiceCurso++] = curso;
    }

    public void mostrarCurso()
    {
        for(int i=0; i<this.indiceCurso;i++){
            System.out.println(this.curso[i].getCodigo()+" "+this.curso[i].getNombre()+ " "+this.curso[i].getCredito());
        }
    }
}
