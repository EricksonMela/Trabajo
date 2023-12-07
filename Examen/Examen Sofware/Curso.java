
public class Curso {

     private int codigo;
     private String nombre;
     private int credito;


     public Curso(){

     }
     public Curso( int codigo, String nombre, int credito) {

          this.codigo = codigo;
          this.nombre = nombre;
          this.credito = credito;

     }
     public int getCodigo() {return codigo;}

     public void setCodigo(int codigo) {this.codigo = codigo;}

     public String getNombre() {return nombre;}

     public void setNombre(String nombre) {this.nombre = nombre;}

     public int getCredito() {return credito;}

     public void setCredito(int credito) {this.credito = credito;}



}
