package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UsuarioBancoAlimentario extends Usuario{
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private Date fecha_nacimiento;
	
	@Column
	private Boolean es_administrador;
	
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
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Boolean getEs_administrador() {
		return es_administrador;
	}
	public void setEs_administrador(Boolean es_administrador) {
		this.es_administrador = es_administrador;
	}

}
