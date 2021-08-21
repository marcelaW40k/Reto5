package modelo.vo;

public class Requerimiento_1Vo {
    private Integer idLider;
    private String nombre;
    private String primerApellido;
    private Integer salario;

    public Requerimiento_1Vo() {
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

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Requerimiento_1Vo [idLider=" + idLider + ", nombre=" + nombre + ", primerApellido=" + primerApellido
                + ", salario=" + salario + "]";
    }

    
    

    

    

    
}