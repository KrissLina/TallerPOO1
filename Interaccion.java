class Interaccion {
    private String tipo;
    private boolean enCurso;

    public Interaccion(String tipo) {
        this.tipo = tipo;
        this.enCurso = false;
    }

    public void iniciarInteraccion() {
        this.enCurso = true;
    }

    public void finalizarInteraccion() {
        this.enCurso = false;
    }
}