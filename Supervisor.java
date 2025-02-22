class Supervisor {
    private String nombre;
    private Agente agente1;
    private Agente agente2;

    public Supervisor(String nombre, Agente agente1, Agente agente2) {
        this.nombre = nombre;
        this.agente1 = agente1;
        this.agente2 = agente2;
    }

    public String verEstadoAgente(Agente agente) {
        return agente.verEstado();
    }
}