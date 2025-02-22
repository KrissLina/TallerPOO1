class EstadoPreparacion {
    private int duracion;
    private boolean nuevaInteraccionPermitida;

    public EstadoPreparacion(int duracion) {
        this.duracion = duracion;
        this.nuevaInteraccionPermitida = false;
    }

    public void activarEstado(Agente agente) {
        agente.cambiarEstado("En preparación");
    }

    public void terminarPreparacion(Agente agente) {
        agente.cambiarEstado("Disponible");
    }
}