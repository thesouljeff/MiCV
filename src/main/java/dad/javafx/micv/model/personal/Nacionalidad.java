package dad.javafx.micv.model.personal;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Nacionalidad {
	private StringProperty denominacion = new SimpleStringProperty();
	
	public Nacionalidad() {}
	
	public Nacionalidad(String denominacion) {
		setDenominacion(denominacion);
	}

	public final StringProperty denominacionProperty() {
		return this.denominacion;
	}

	public final String getDenominacion() {
		return this.denominacionProperty().get();
	}

	public final void setDenominacion(final String denominacion) {
		this.denominacionProperty().set(denominacion);
	}

	@Override
	public String toString() {
		return denominacion.get();
	}

}
