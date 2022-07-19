package com.laura.spring.springcore.properties;

import java.util.Properties;

public class Languages {

	private Properties countryAndLanguages;

	@Override
	public String toString() {
		return "Languages [countryAndLanguages=" + countryAndLanguages + "]";
	}

	public Properties getCountryAndLanguages() {
		return countryAndLanguages;
	}

	public void setCountryAndLanguages(Properties countryAndLanguages) {
		this.countryAndLanguages = countryAndLanguages;
	}
}
