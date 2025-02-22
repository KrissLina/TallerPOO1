public class Agente {
    private String nombre;
    private String idAgente;
    private String estado;
    private int tiempoPreparacion;
    private Interaccion interaccionActual;

    public Agente(String nombre, String idAgente) {
        this.nombre = nombre;
        this.idAgente = idAgente;
        this.estado = "Disponible";
        this.tiempoPreparacion = 0;
        this.interaccionActual = null;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public String verEstado() {
        return estado;
    }

    public void iniciarTiempoPreparacion() {
        this.tiempoPreparacion = 15; // Simulación de preparación
    }

    public void asignarInteraccion(Interaccion interaccion) {
        this.interaccionActual = interaccion;
    }

    public void finalizarInteraccion() {
        if (this.interaccionActual != null) {
            this.interaccionActual.finalizarInteraccion();
            this.interaccionActual = null;
        }
    }

    public String getNombre() {
        return nombre;
    }
}