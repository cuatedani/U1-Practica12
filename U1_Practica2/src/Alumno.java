public class Alumno {
    private int ID;
    private String Nombre;
    private int semestre;
    private double promedio;    

    public String getNombre() {
        return Nombre;
    }

    public int getID() {
        return ID;
    }

    public int getSemestre() {
        return semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
}
