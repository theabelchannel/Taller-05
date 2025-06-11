public class Profesor extends PersonalAcademico {

    public Profesor(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividad) {
        curso.agregarActividad(actividad);
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividad) {}
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante) {}
    public void crearNuevoForo(Curso curso, Foro foro) {
        curso.agregarForo(foro);
    }
    public void cargarMaterialEducativo() {}
    public void darRetroalimentacion() {}
    public void planificarCurso() {}
    public void diseniarActividades() {}

   


    }



