package Drones;

import Misiones.Mision;

public abstract class Dron {
	private Integer autonomia = 0;
	private final Integer procesamiento;
	private Mision mision;

	public Dron() {
	this.procesamiento = 0;
	}
	
	public Dron(Integer autonomdia, Integer procesamiento, Mision mision) {
		this.autonomia = autonomia;
		this.procesamiento = procesamiento;
		this.mision = mision;
	}
	
	public Integer getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(Integer autonomia) {
		this.autonomia = autonomia;
	}

	public Integer getProcesamiento() {
		return procesamiento;
	}

	public Mision getMision() {
		return mision;
	}

	public void setMision(Mision mision) {
		this.mision = mision;
	}
	
	public Integer eficienciaOperativa() {
		return this.autonomia * 10 + mision.eficienciaOperativa();
	}
}
