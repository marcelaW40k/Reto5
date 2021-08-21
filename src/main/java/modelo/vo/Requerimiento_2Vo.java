package modelo.vo;

public class Requerimiento_2Vo {
    private Integer idProyecto;
    private String nombreMaterial;

    public Requerimiento_2Vo() {
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    @Override
    public String toString() {
        return idProyecto + " " + nombreMaterial;
    }
    
}
