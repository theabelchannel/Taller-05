
package modelos;




public class Usuario {


    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    




    public Usuario(String usuario2, String contrasena, String nombre2, String apellido2) {
        //TODO Auto-generated constructor stub
    }


    protected boolean login(){
        return true;

    };


    protected boolean logOut(){
        return true;

    };

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasena() {
        return contraseña;
    }

    public void setContrasena(String contrasena) {
        this.contraseña = contrasena;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



}