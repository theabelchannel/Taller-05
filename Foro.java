public class Foro {
 private String id;
    private String tematica;
    private int numeroDeComentarios;

    public void agregarComentario(String comentario) {
        numeroDeComentarios++;
    }

    // Getters y setters
    public String getId() { return id; }
    public String getTematica() { return tematica; }
    public int getNumeroDeComentarios() { return numeroDeComentarios; }


    
}

