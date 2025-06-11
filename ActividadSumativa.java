

import java.util.Date;

class ActividadSumativa {
    protected String titulo;
    protected Date fechaDeEntrega;
    protected float puntajeMaximo;
    protected String contenido;
    protected float calificacion;
    protected String id;

    public boolean verificarEntrega(Date fecha) { return !fecha.after(fechaDeEntrega); }
    public void evaluarActividad(float puntaje) { this.calificacion = puntaje; }
    public boolean seCreo() {
    return true;
    }
    public void MostrarInconsistencia(){}

public ActividadSumativa(String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, String id) {
    this.titulo = titulo;
    this.fechaDeEntrega = fechaDeEntrega;
    this.puntajeMaximo = puntajeMaximo;
    this.contenido = contenido;
    this.id = id;
    this.calificacion = 0.0f; // Valor inicial, ya que aún no ha sido evaluada
     while (this.seCreo() == false){
    System.out.println("se creo");
    };
}




   
}
