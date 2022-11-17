package com.miempresa.DTO;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Range;

public class formularioDTO {
	@NotBlank(message = "Campo obligatorio")
	private String nombre;
	
	@NotBlank(message = "Campo obligatorio")
	private String apellido;
	
	private String sexo;
	
	@NotBlank(message = "Campo obligatorio")
	@Size(min=6, max=12, message = "error")
	@Pattern(regexp = "[a-zA-Z0-9]+", message = "error")
	private String clave;
	
	@NotBlank(message="Campo obligatorio")
	@Email(message = "Ingrese un correo valido")
	private String correo;
	
	@Range(min=0, max=100, message="Ingrese una edad correcta")
	private int edad;
	private OpcionesSexo[] opcionesSexo;
	
	
	
	
	public formularioDTO() {
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public formularioDTO(String nombre, String apellido, String sexo, String clave, String correo, int edad,
			OpcionesSexo[] opcionesSexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.clave = clave;
		this.correo = correo;
		this.edad = edad;
		this.opcionesSexo = opcionesSexo;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public OpcionesSexo[] getOpcionesSexo() {
		return opcionesSexo;
	}
	public void setOpcionesSexo(OpcionesSexo[] opcionesSexo) {
		this.opcionesSexo = opcionesSexo;
	}
	
}
