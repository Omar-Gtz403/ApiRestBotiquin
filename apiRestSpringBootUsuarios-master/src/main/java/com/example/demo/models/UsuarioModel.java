package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_usuarios")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id_Usuario;
	private Integer permiso;
	private String id_Sucursal;
	private String nombre_Usuario;
	private String password;


	public void setPrioridad(Integer permiso) {
		this.permiso = permiso;
	}

	public Integer getPrioridad() {
		return permiso;
	}

	public Long getId() {
		return id_Usuario;
	}

	public void setId(Long id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public Long getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(Long id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public String getId_Sucursal() {
		return id_Sucursal;
	}

	public void setId_Sucursal(String id_Sucursal) {
		this.id_Sucursal = id_Sucursal;
	}

	public String getNombre_Usuario() {
		return nombre_Usuario;
	}

	public void setNombre_Usuario(String nombre_Usuario) {
		this.nombre_Usuario = nombre_Usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPermiso() {
		return permiso;
	}

	public void setPermiso(int permiso) {
		this.permiso = permiso;
	}

}