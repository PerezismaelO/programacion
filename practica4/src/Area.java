public class Area {
    // Atributos
    private static String nombre;
    private static String identificador;
    private static int planta;
    private static int numMedicos;
    private Hospital hospital = 0
    // Constructor
    public Area(String nom, String id, int pla, int nMed, Hospital H) {
        this.nombre = nom;
        this.identificador = id;
        this.planta = pla;
        this.numMedicos = nMed;
        this.hospital = H;
    }
    // Getter

    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getPlanta() {
        return planta;
    }

    public int getNumMedicos() {
        return numMedicos;
    }

    public Hospital getHospital() {
        return hospital;
    }
    // Setter

    public  void setNombre(String nombre) {
        Area.nombre = nombre;
    }

    public  void setIdentificador(String identificador) {
        Area.identificador = identificador;
    }

    public  void setPlanta(int planta) {
        Area.planta = planta;
    }

    public  void setNumMedicos(int numMedicos) {
        Area.numMedicos = numMedicos;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
