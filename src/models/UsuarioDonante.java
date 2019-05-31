package models;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class UsuarioDonante extends Usuario {
	
	@Column
	private String nombre_empresa;

	@Column
	private String domicilio;
	
	@Column
	private String telefono;
	
	@Column
	private LocalTime horario_contacto_desde;
	
	@Column
	private LocalTime horario_contacto_hasta;
	
	@Column
	private String nombre_persona_contacto;
	
	@Column
	private String apellido_persona_contacto;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario_donante")
	private List<Donacion> donaciones;

	public String getNombre_empresa() {
		return nombre_empresa;
	}

	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalTime getHorario_contacto_desde() {
		return horario_contacto_desde;
	}

	public void setHorario_contacto_desde(LocalTime horario_contacto_desde) {
		this.horario_contacto_desde = horario_contacto_desde;
	}

	public LocalTime getHorario_contacto_hasta() {
		return horario_contacto_hasta;
	}

	public void setHorario_contacto_hasta(LocalTime horario_contacto_hasta) {
		this.horario_contacto_hasta = horario_contacto_hasta;
	}

	public String getNombre_persona_contacto() {
		return nombre_persona_contacto;
	}

	public void setNombre_persona_contacto(String nombre_persona_contacto) {
		this.nombre_persona_contacto = nombre_persona_contacto;
	}

	public String getApellido_persona_contacto() {
		return apellido_persona_contacto;
	}

	public void setApellido_persona_contacto(String apellido_persona_contacto) {
		this.apellido_persona_contacto = apellido_persona_contacto;
	}

	public List<Donacion> getDonaciones() {
		return donaciones;
	}

	public void setDonaciones(List<Donacion> donaciones) {
		this.donaciones = donaciones;
	}
	
	public void addDonacion(Donacion donacion) {
		this.donaciones.add(donacion);
	}
	
	public void removeDonacion(Donacion donacion) {
		this.donaciones.remove(donacion);
	}
}
