import modelos.Usuario;

public class SoporteTecnico extends Usuario {

    public SoporteTecnico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void brindarAsistencia(Usuario usuario) {}
    public void resolverProblemaTecnico(Usuario usuario) {}
    public void derivarProblemaDeGestion(Administrador admin) {}
    public void responderConsultas(String mensaje) {}
    public void proporcionarOrientacion() {}
    public void solucionarProblemasDeAcceso() {}
    public void ayudarConNavegacion() {}
    
}

