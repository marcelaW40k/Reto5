package modelo.vo;

public class Requerimiento_3Vo {
    private Integer idLider;
    private String nombre;
    private String primer_Apellido;
    private String segundo_Apellido;
    private Integer salario;
    private String ciudad_Residencia;
    private String cargo;
    private Float clasificacion;
    private String documento_Identidad;
    private String fecha_Nacimiento;
    
    public Requerimiento_3Vo() {
    }

    public Integer getIdLider() {
        return idLider;
    }

    public void setIdLider(Integer idLider) {
        this.idLider = idLider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_Apellido() {
        return primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        this.primer_Apellido = primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return segundo_Apellido;
    }

    public void setSegundo_Apellido(String segundo_Apellido) {
        this.segundo_Apellido = segundo_Apellido;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getCiudad_Residencia() {
        return ciudad_Residencia;
    }

    public void setCiudad_Residencia(String ciudad_Residencia) {
        this.ciudad_Residencia = ciudad_Residencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Float getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Float clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDocumento_Identidad() {
        return documento_Identidad;
    }

    public void setDocumento_Identidad(String documento_Identidad) {
       this.documento_Identidad = documento_Identidad;
    }

    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    @Override
    public String toString() {
        return "Requerimiento_3Vo [cargo=" + cargo + ", ciudad_Residencia=" + ciudad_Residencia + ", clasificacion="
                + clasificacion + ", documento_Identidad=" + documento_Identidad + ", fecha_Nacimiento="
                + fecha_Nacimiento + ", idLider=" + idLider + ", nombre=" + nombre + ", primer_Apellido="
                + primer_Apellido + ", salario=" + salario + ", segundo_Apellido=" + segundo_Apellido + "]";
    }
    
    
    


}
