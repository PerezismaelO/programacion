public class Area {
    // Atributos
    private String nombre;
    private String identificador;
    private int planta;
    private int numMedicos;
    private Hospital hospital;
    // Constructor
    public Area(String nom, String id, int pla, Hospital H) {
        this.nombre = nom;
        this.identificador = id;
        this.planta = pla;
        this.numMedicos = 0;
        this.hospital = H;
    }
    // Funciones
    public void aumentarMedicos() {
        numMedicos++; }
    public void disminuirMedicos() {
        if(numMedicos > 0)
            numMedicos--;
    }
    public String compararMedicos(Area otraArea) {
        if(this.numMedicos > otraArea.numMedicos) {
            return "El area " + this.nombre + "tiene más medicos";
        } else if (this.numMedicos < otraArea.numMedicos) {
            return "El area " + otraArea.nombre + "tiene más medicos";
        } else {
            return "Las dos areas tienen el mismo numero de medicos";
        }
    }
    public int capacidadMaximaRestante(int capacidadMaxima) {
        return capacidadMaxima - numMedicos;
    }

    //Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getNumMedicos() {
        return numMedicos;
    }

    public void setNumMedicos(int numMedicos) {
        this.numMedicos = numMedicos;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    // Metodos
    public void sumarMedicos(){
        numMedicos++;
    }

    // clase area metodo calcular sueldo promedio que devuelva el sueldo bruto promedio de todos los médicos del área

    public double mediaSueldoBruto() {



    }


}
