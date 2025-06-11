import modelos.Usuario;

public class Administrador extends Usuario {
    public Administrador(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void crearUsuarioConRol(String usuario, String contrasena) {}
    public void asignarPermiso(String usuario) {}
    public void actualizarSoftware() {}
    public void asignarResponsable(Curso curso, Profesor responsable) {}
    public void gestionarRoles() {}
    public void reportarCambios() {}

};

