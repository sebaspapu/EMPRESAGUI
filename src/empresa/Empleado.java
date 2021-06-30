package empresa;
/**
 * @Integrantes:
 * Sebastian Bolaños Morales
 * Jonathan Tobar Escue
 * Andres Eduardo Fajardo
 * Yosimar Reyes Quiceno
 */
public class Empleado {
    
        //encapsulamiento 
        private double cedula;
        private String nombre;
        private String apellido;
        private int edad;
        private double salario ;
        private String Empleo;
        private String Departamento;

    public Empleado(double cedula, String nombre, String apellido, int edad, double salario, String Empleo, String Departamento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        this.Empleo = Empleo;
        this.Departamento = Departamento;
    }
        
        public Empleado(){
                        
        }
        
        //mi constructor
        public Empleado (double c, String n, String a, int e){
            
            cedula = c;
            nombre = n;
            apellido = a;
            edad = e;            
            
        }

        //constructor generado por el ide
    public Empleado(double cedula, String nombre, String apellido, int edad, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }               
    
    //gets
   
    public String getNombre() {
        return nombre;
    }
         
    public String getApellido(){
        return apellido;
    }
    
    public double getCedula(){
        return cedula;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public String getEmpleo(){
        return Empleo;
    }
    
    public String getDepartamento(){
        return Departamento;
    }
    
   //sets
    //utilizados principalmente para guardar los datos que nosotros o el usuario le ingresa como 
    //parametro a el metodo en cuestion de ésta manera quedarian guardados en ésta variables globales de ésta clase 
    //encapsulados , ya que los atributos de ésta clase ("Empleado") son privados

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void setEmpleo(String Empleo){
        
        this.Empleo = Empleo;
        
    }
    
    public void setDepartamento(String Depar){
        
        this.Departamento = Depar;
    }
    
    
    public String toString(){
        
        StringBuilder LE = new StringBuilder();
        
        LE.append("\nCEDULA: ");
        LE.append(cedula);
        LE.append("\nNOMBRE: ");
        LE.append(nombre);
        LE.append("\nAPELLIDO: ");
        LE.append(apellido);        
        LE.append("\nEDAD: ");
        LE.append(edad);        
        LE.append("\nSALARIO: ");
        LE.append(salario);
        LE.append("\nEMPLEO: ");
        LE.append(Empleo);
        LE.append("\nDEPARTAMENTO: ");
        LE.append(Departamento);
        LE.append("\n");

        return LE.toString();
        
    }
    
    
}
