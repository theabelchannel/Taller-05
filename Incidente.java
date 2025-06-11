import modelos.Usuario;

import java.util.List;
import java.util.Date;

class Incidente {
    private int id;
    private Date fechaReportado;
    private String estado;
    private String titulo;
    private String descripcion;
    private List<String> logActualizaciones;
    private Date fechaCerrado;
    private String tipo;
    private Usuario beneficiario;

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Date getFechaReportado() { return fechaReportado; }
    public void setFechaReportado(Date fechaReportado) { this.fechaReportado = fechaReportado; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public List<String> getLogActualizaciones() { return logActualizaciones; }
    public void setLogActualizaciones(List<String> logActualizaciones) { this.logActualizaciones = logActualizaciones; }
    public Date getFechaCerrado() { return fechaCerrado; }
    public void setFechaCerrado(Date fechaCerrado) { this.fechaCerrado = fechaCerrado; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public Usuario getBeneficiario() { return beneficiario; }
    public void setBeneficiario(Usuario beneficiario) { this.beneficiario = beneficiario; }
}
