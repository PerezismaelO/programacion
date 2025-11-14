public class Usuario {

        private String nombre;
        private String apellidos;
        private String codigoPostal;
        private String direccion;
        private String email;
        private String contraseña;

        public Usuario (String nom, String ap, String cod, String dir, String em, String con) {
            nombre = nom;
            apellidos = ap;
            codigoPostal = cod;
            direccion = dir;
            email = em;
            contraseña = con;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String nuevoEmail) {
        this.email = email;
        if (!nuevoEmail.contains("@")) {
            System.out.println("Error: Email inválido. No contiene @");
        }
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}


