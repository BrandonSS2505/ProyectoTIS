package mx.uv.gamehub.mantenimiento.models;

import javax.annotation.processing.Generated;
import javax.persistence.*;


@Entity//nos ayuda a especificar que cada campo que añadamos sera una columna en nuestra base de datos
@Table(name="equipo")//sirve para darle nombre a nuestra tabla y no tenga el nombre del modelo por defecto
public class EquipoModel {
    //se especifican todos los atrbutos que va a llevar nuestra base de datos asi como sus getters y setters
    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)//esta linea hace que el identificador sea autoincremental
    private Long dispositivo;
    @Column //especificamos que es una columna pese a no ser necesario
    private String nombre;
    @Column
    private String marca;
    @Column
    private String estado;
    @Column
    private String condicion;
    @Column
    
    private String categoria_nombre;

    public Long getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Long dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getCategoria() {
        return categoria_nombre;
    }

    public void setCategoria(String categoria_nombre) {
        this.categoria_nombre = categoria_nombre;
    }
}
