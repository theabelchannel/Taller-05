import modelos.Usuario;

class PersonalAcademico extends Usuario {
   public PersonalAcademico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
    }

    public void reportarErrorSistema(String email, String contenido) {}
    public void pedirAsesoramiento(String email, String contenido) {}
    public void comentarEnForo(Foro foro, String comentario) {
        foro.agregarComentario(comentario);
    };
}