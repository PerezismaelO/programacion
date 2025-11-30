import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    // Atributos
    private String nombre;
    private String CIF;
    private List<Area> areas;
    private Direccion direccion;
    // Constructor
    public Hospital (String nom, String CIF, Direccion direccion){
        this.nombre = nom;
        this.CIF = CIF;
        this.areas = new ArrayList<>();
        this.direccion = direccion;
    }
    // Funciones

    public void addArea(Area area){ areas.add(area); }
    // Getter

    public String getNombre() {
        return nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public List<Area> getArea() { return areas; }

    public Direccion getDireccion() { return direccion; }

    // Setter

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setCIF(String CIF) { this.CIF = CIF; }

    public void setArea(List<Area> areas) { this.areas = areas; }

    public void setDireccion(Direccion direccion) { this.direccion = direccion; }
}




