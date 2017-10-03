package edu.cosc4353.group3.AcornsEmulator;

public class Portfolio {
	private Double growth = 0.0;
	private String sect = "";
	
	public Portfolio(double growthRate, String sector) {
		growth = growthRate;
		sect = sector;
	}
	public static Portfolio returnPortfolio(Portfolio portfolio) {
		return portfolio;
	}
}
