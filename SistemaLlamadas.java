class SistemaLlamadas {
    private Agente agenteActivo;
    private Interaccion interaccionActual;

    public SistemaLlamadas(Agente agenteActivo) {
        this.agenteActivo = agenteActivo;
        this.interaccionActual = null;
    }

    public void asignarNuevaInteraccion(Interaccion interaccion) {
        agenteActivo.cambiarEstado("En llamada");
        this.interaccionActual = interaccion;
        agenteActivo.asignarInteraccion(interaccion);
    }

    public void detenerAsignacion() {
        agenteActivo.cambiarEstado("Disponible");
        if (this.interaccionActual != null) {
            this.interaccionActual.finalizarInteraccion();
            this.interaccionActual = null;
        }
    }
}