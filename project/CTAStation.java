package project;


public class CTAStation extends GeoLocation {
	private String name;
	private String location;
	private boolean wheelchair;
	private int index;

	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public CTAStation() {
		super();
		name = null; 
		location = null;
		wheelchair = false;
	}
	public CTAStation(String name,double lat,double lng,String location,boolean wheelchair) {
		super(lat,lng);
		setName(name);
		setLocation(location);
		setWheelchair(wheelchair);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isWheelchair() {
		return wheelchair;
	}
	public void setWheelchair(boolean wheelchair) {
		this.wheelchair = wheelchair;
	}
	@Override
	public String toString() {
		return "CTAStation [name=" + name + ", location=" + location + ", wheelchair="
				+ wheelchair + "]"; 
	}
	
	
	public boolean equals(CTAStation e) {
		if (e==null) {
			return false;
		}
		if (e==this) {
			return true;
		}
		if ((!(this.getLat()==e.getLat())) || !(this.getLng()==e.getLng())) {
			return false;
		}
		return true;
	}
}
