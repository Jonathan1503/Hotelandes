package negocio;

public class Usuario {
	
	private long idUsuario;
	private long idRol;
	private String tipoDocumento;
	private String numDocumento;
	private String nombre;
	private String correo;
	
	public Usuario()
	{
		this.idUsuario= 0;
		this.idRol= 0;
		this.tipoDocumento="";
		this.numDocumento="";
		this.nombre="";
		this.correo="";
	}

	public Usuario(long idUsuario, long idRol, String tipoDocumento, String numDocumento, String nombre,
			String correo) {
		super();
		this.idUsuario = idUsuario;
		this.idRol = idRol;
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.correo = correo;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public long getIdRol() {
		return idRol;
	}

	public void setIdRol(long idRol) {
		this.idRol = idRol;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

}
