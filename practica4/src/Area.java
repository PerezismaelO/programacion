public class Area {
    // Atributos
    private static String nombre;
    private static String identificador;
    private static int planta;
    private static int numMedicos;
    private Hospital hospital;
    // Constructor
    public Area(String nom, String id, int pla, Hospital H) {
        this.nombre = nom;
        this.identificador = id;
        this.planta = pla;
        this.numMedicos = 0;
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

    // Funciones
    // Area a1 = new Area(......)
    /* Area a2 = new Area(......)
    ArrayList<Area> areas = { a1, a2, a3 }
    Cada a1, a2 y a3 contiene: Atributos, get, set y funciones (Dentro de la clase Area)
    (((DIRECCION)HOSPITAL)AREA)
     */
}
