public class Guerrero extends Personaje {
    private int experiencia;
    private int fuerza;
    private int agilidad;
    private int magia;
    private int cura;
    private int defensa;
    private int velocidad;
    private int inteligencia;
    private int suerte;


    public Guerrero(int experiencia, int fuerza, int agilidad, int magia, int cura, int defensa, int velocidad, int inteligencia, int suerte) {
        this.experiencia = experiencia;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.magia = magia;
        this.cura = cura;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.inteligencia = inteligencia;
        this.suerte = suerte;
    }

    public int getExperiencia() {
        return experiencia;
    }
    public int getFuerza() {
        return fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getMagia() {
        return magia;
    }

    public int getCura() {
        return cura;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getSuerte() {
        return suerte;
    }
}
