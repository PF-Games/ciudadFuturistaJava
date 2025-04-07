package Drones;

import Misiones.Vigilancia;

public class DronComercial extends Dron {

	public DronComercial(int i, int j, Vigilancia vigilancia) {
		super();
	}
	
	public DronComercial(Integer autonomia, Integer procesamiento, Mision) {
		super(autonomia, procesamiento, mision);
	}

}
