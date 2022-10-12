package OOPS;

class encapsulation {
	private String country, nationalAnthem, touristSpot;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNationalAnthem() {
		return nationalAnthem;
	}

	public void setNationalAnthem(String nationalAnthem) {
		this.nationalAnthem = nationalAnthem;
	}

	public String getTouristSpot() {
		return touristSpot;
	}

	public void setTouristSpot(String touristSpot) {
		this.touristSpot = touristSpot;
	}

	public static void main(String[] args) {
		encapsulation j = new encapsulation();
		j.setCountry("India");
		j.setNationalAnthem("Jana gana mana");
		j.setTouristSpot("Kerala");
		System.out.println(j.getCountry() + j.getNationalAnthem() + j.getTouristSpot());
	}
}
