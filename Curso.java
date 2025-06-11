import java.util.ArrayList;
import java.util.List;


public class Curso {
private String id;
    private String nombre;
    private boolean estadoDisponible;
    private List<Estudiante> estudiantesInscritos = new ArrayList<>();
    private List<Estudiante> estudiantesEnEspera = new ArrayList<>();
    private Profesor responsable;
    private List<ActividadSumativa> actividades = new ArrayList<>();
    private List<Foro> foros = new ArrayList<>();

    public void agregarEstudianteEnEspera(Estudiante e) { estudiantesEnEspera.add(e); }
    public void agregarActividad(ActividadSumativa act) { actividades.add(act); }
    public void agregarForo(Foro foro) { foros.add(foro); }
    public void mostrarMensajeDeCargaExitosa() {}
    public void mostrarMensajeDeErrorCarga() {}

    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public Profesor getProfesor() { return responsable; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public boolean isEstadoDisponible() { return estadoDisponible; }
    public void setEstadoDisponible(boolean estadoDisponible) { this.estadoDisponible = estadoDisponible; }

    Profesor profesor = getProfesor();


    

    

}
