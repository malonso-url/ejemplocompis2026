public class Archivo {
    private String nombre;
    private String extension;
    private long tamaño; // en bytes

    public Archivo(String nombre, String extension, long tamaño) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public long getTamaño() {
        return tamaño;
    }

    public void setTamaño(long tamaño) {
        this.tamaño = tamaño;
    }

    // Método para mostrar la información del archivo

    @Override
    public String toString() {
        return "Archivo{" +
                "nombre='" + nombre + '\'' +
                ", extension='" + extension + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }
}