package project;

public class GeoLocation {

	private double lat;
	private double lng;
	
	public GeoLocation(){
		lat = 0.0;
		lng = 0.0;
	}

	
	public GeoLocation(double la, double ln) {
		this.lat = la;
		this.lng = ln;
	}
	public double getLat(){
		return lat;
		
	}
	public double getLng() {
		return lng;
	}
	public void setLat(double la) {
		if (lat>=-90 && lat<=90) {
			lat = la;
		} else {
			lat = 0.0;
		}
	}
	
	public void setLng(double ln) {
		if (lng>=-180 && lng<=180) {
			lng = ln;
		} else {
			lng= 0.0;
		}
	}
	
	private String constructString() {
		return (lat + "," + lng);
	}
	
	public String toString() {
		return constructString();
	}
	
	
	public boolean equals(GeoLocation other) {
		if (!(this.lat==other.getLat()) && !(this.lng==other.getLng())) {
			return true;
		}
		return false;
	}
	
	public double calcDistance(GeoLocation l) {
		return Math.sqrt(Math.pow(l.getLat()-lat, 2)+Math.pow(l.getLng()-lng,2));
	}
	
	public double calcDistance(double lat1, double lng1) {
		return Math.sqrt(Math.pow(lat1-lat, 2)+Math.pow(lng1-lng,2));
	}
	
	
	
}

