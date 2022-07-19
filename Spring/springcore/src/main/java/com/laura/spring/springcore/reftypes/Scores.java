package com.laura.spring.springcore.reftypes;

public class Scores {

	private Double math;
	private Double physics;
	private Double Chemistry;

	public Double getMath() {
		return math;
	}

	public void setMath(Double math) {
		this.math = math;
	}

	public Double getPhysics() {
		return physics;
	}

	public void setPhysics(Double physics) {
		this.physics = physics;
	}

	public Double getChemistry() {
		return Chemistry;
	}

	public void setChemistry(Double chemistry) {
		Chemistry = chemistry;
	}

	@Override
	public String toString() {
		return "Scores [math=" + math + ", physics=" + physics + ", Chemistry=" + Chemistry + "]";
	}
	

}
