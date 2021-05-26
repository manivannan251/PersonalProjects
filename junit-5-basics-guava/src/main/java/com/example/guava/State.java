package com.example.guava;

import com.google.common.base.MoreObjects;


public class State {
	
	private String statecode;
	
	private String name;
	
	private String regioncode;
	
	private int population;

	public State(String statecode, String name, String regioncode, int population) {
		super();
		this.statecode = statecode;
		this.name = name;
		this.regioncode = regioncode;
		this.population = population;
	}

	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegioncode() {
		return regioncode;
	}

	public void setRegioncode(String regioncode) {
		this.regioncode = regioncode;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("state code", statecode)
				.add("name", name).toString();
	}
	
	
}
