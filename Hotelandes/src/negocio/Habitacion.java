package negocio;

public class Habitacion {
	
	private long idHabitacion;
	private long idTipo;
	private String ocupado;
	private long idUsuario;
	private double cuenta;
	
	public Habitacion()
	{
		this.idHabitacion=0;
		this.idTipo=0;
		this.ocupado="";
		this.idUsuario=0;
		this.cuenta=0;
		
	}

	public Habitacion(long idHabitacion, long idTipo, String ocupado, long idUsuario, double cuenta) {
		super();
		this.idHabitacion = idHabitacion;
		this.idTipo = idTipo;
		this.ocupado = ocupado;
		this.idUsuario = idUsuario;
		this.cuenta = cuenta;
	}

	public long getIdHabitacion() {
		return idHabitacion;
	}

	public void setIdHabitacion(long idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	public long getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(long idTipo) {
		this.idTipo = idTipo;
	}

	public String getOcupado() {
		return ocupado;
	}

	public void setOcupado(String ocupado) {
		this.ocupado = ocupado;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public double getCuenta() {
		return cuenta;
	}

	public void setCuenta(double cuenta) {
		this.cuenta = cuenta;
	}
	
	

}
