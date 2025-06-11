public class Estudiante extends PersonalAcademico {

    public Estudiante(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void solicitarInscripcionCurso(Curso curso) {
        curso.agregarEstudianteEnEspera(this);
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividad) {}
    public void pedirRetroalimentacion() {}
    public void registrarse() {}
    public boolean alcanzarNotaMinima(float nota) { return nota >= 7.0; }
    public void obtenerCertificado() {}
}
