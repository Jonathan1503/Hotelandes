package negocio;

public class TipoHabitacion {
	
	private long id;
	private String tipo;
	private int cantidad;
	
	public TipoHabitacion(){
		this.id=0;
		this.tipo="";
		this.cantidad=0;
	}

	public TipoHabitacion(long id, String tipo, int cantidad) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
