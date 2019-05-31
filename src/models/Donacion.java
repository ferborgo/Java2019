package models;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Donacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private String nombre;
	
	@Column
	private String direccion_retiro;
	
	@Column
	private String coordenadas;
	
	@Column
	private Date fecha_disponibilidad_retiro;
	
	@Column
	private LocalTime horario_retiro;
	
	@Column
	private Boolean fue_retirada;
	
	@Column
	private Date fecha_retirada;
	
	@Column
	private Integer numero_remito;
	
	@Column
	private Date fecha_y_hora_recorrido;
	
	@OneToMany(mappedBy = "donacion")
	private List<ProductoDonacion> productos;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="usuario_donante_id")
	private UsuarioDonante usuario_donante;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private Recorrido recorrido;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion_retiro() {
		return direccion_retiro;
	}
	public void setDireccion_retiro(String direccion_retiro) {
		this.direccion_retiro = direccion_retiro;
	}
	public String getCoordenadas() {
		return coordenadas;
	}
	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
	public Date getFecha_disponibilidad_retiro() {
		return fecha_disponibilidad_retiro;
	}
	public void setFecha_disponibilidad_retiro(Date fecha_disponibilidad_retiro) {
		this.fecha_disponibilidad_retiro = fecha_disponibilidad_retiro;
	}
	public LocalTime getHorario_retiro() {
		return horario_retiro;
	}
	public void setHorario_retiro(LocalTime horario_retiro) {
		this.horario_retiro = horario_retiro;
	}
	public Boolean getFue_retirada() {
		return fue_retirada;
	}
	public void setFue_retirada(Boolean fue_retirada) {
		this.fue_retirada = fue_retirada;
	}
	public Date getFecha_retirada() {
		return fecha_retirada;
	}
	public void setFecha_retirada(Date fecha_retirada) {
		this.fecha_retirada = fecha_retirada;
	}
	public Integer getNumero_remito() {
		return numero_remito;
	}
	public void setNumero_remito(Integer numero_remito) {
		this.numero_remito = numero_remito;
	}
	public Date getFecha_y_hora_recorrido() {
		return fecha_y_hora_recorrido;
	}
	public void setFecha_y_hora_recorrido(Date fecha_y_hora_recorrido) {
		this.fecha_y_hora_recorrido = fecha_y_hora_recorrido;
	}
	public List<ProductoDonacion> getProductos() {
		return productos;
	}
	public void setProductos(List<ProductoDonacion> productos) {
		this.productos = productos;
	}
	public UsuarioDonante getUsuario_donante() {
		return usuario_donante;
	}
	public void setUsuario_donante(UsuarioDonante usuario_donante) {
		this.usuario_donante = usuario_donante;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Recorrido getRecorrido() {
		return recorrido;
	}
	public void setRecorrido(Recorrido recorrido) {
		this.recorrido = recorrido;
	}
}
