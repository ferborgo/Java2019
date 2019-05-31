package models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProductoDonacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private double peso_unidad;
	
	@Column
	private Integer cantidad;
	
	@Column
	private Date fecha_vencimiento_mas_cercana;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "tipo_producto_id")
	private TipoDeProducto tipoDeProducto;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "marca_id")
	private Marca marca;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "donacion_id")
	private Donacion donacion;
	
	public Double getPeso_unidad() {
		return peso_unidad;
	}
	public void setPeso_unidad(double d) {
		this.peso_unidad = d;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFecha_vencimiento_mas_cercana() {
		return fecha_vencimiento_mas_cercana;
	}
	public void setFecha_vencimiento_mas_cercana(Date date) {
		this.fecha_vencimiento_mas_cercana = date;
	}
	public TipoDeProducto getTipoDeProducto() {
		return tipoDeProducto;
	}
	public void setTipoDeProducto(TipoDeProducto tipoDeProducto) {
		this.tipoDeProducto = tipoDeProducto;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Donacion getDonacion() {
		return donacion;
	}
	public void setDonacion(Donacion donacion) {
		this.donacion = donacion;
	}
}
