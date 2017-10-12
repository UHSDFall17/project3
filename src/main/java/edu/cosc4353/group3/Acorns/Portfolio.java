package edu.cosc4353.group3.Acorns;

public class Portfolio {
	private double growth = 0.0;
	private String sect = "";
	
	public Portfolio(double growthRate, String sector) {
		growth = growthRate;
		sect = sector;
	}
	public String returnPortfolioSector() {
		return sect;
	}
	public double returnPortfolioGrowth() {
		return growth;
	}
}
