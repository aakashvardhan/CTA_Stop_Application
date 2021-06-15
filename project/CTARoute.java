package project;

import java.util.ArrayList;
 

public class CTARoute {


	private String name;
	private ArrayList<CTAStation> stops = new ArrayList<CTAStation>();
	
	public CTARoute() {
		name = "Unknown";
		stops = new ArrayList<CTAStation>();
	}
	
	public CTARoute(String n, int n1) {
		setName(n);
		stops = new ArrayList<CTAStation>(n1);
	}


	public String getName() {
		return name;
	}
	
	public String printStations() {
		stops.forEach(station -> System.out.println(station.getName()));
		return null;
	}
	@Override
	public String toString() {
		stops.forEach(station -> System.out.println(station.toString()));
		return null;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public CTARoute sortStations(CTARoute s) {
			int num = -1;
			int num1 = -1;
			CTAStation r = null;
			CTAStation t = null;
			int n = s.getStops().size()-1;
			for (int i = 0;i<n;i++) {
				for (int j = 0;j<n-i;j++) {
					num = s.getStops().get(j).getIndex();
					num1 = s.getStops().get(j+1).getIndex();
					if (num>num1) {
						r = s.getStops().get(j);
						t = s.getStops().get(j+1);
						s.stops.set(j, t);
						s.stops.set(j+1, r);
					}
				}
		}
			return s;
		
		
	}

	public ArrayList<CTAStation> getStops() {
		return stops;
	}


	public void setStops(ArrayList<CTAStation> stops) {
		this.stops = stops;
	}

	public void addStation(CTAStation station) {
		
		stops.add(station);
	}
	
	public void setStation(CTAStation station,int index) {
		stops.set(index, station);
	}
	

	public void removeStation(CTAStation station) {
		for (int i =0; i<stops.size();i++) {
			if(stops.get(i).equals(station)) {
				stops.remove(station);
			}
		}
	}
	
	public void editStation(CTAStation old, CTAStation station) {
		for (int i = 0;i<stops.size();i++) {
			if(stops.get(i).equals(old)) {
				stops.set(i, station);
			}
		}
	}


	public void insertStation(int position, CTAStation station) {
		stops.add(position, station);
	}

	public CTAStation lookupStation(String name) {
		for (int i = 0;i<stops.size();i++) {
			if (stops.get(i).getName().equals(name)) {
				return stops.get(i);
			}
		}
		return null;


	}

	public CTAStation nearestStation(double lat, double lng) {
		double smallestDistance = stops.get(0).calcDistance(lat, lng);
		int station = 0;
		for (int i = 0; i < stops.size(); i++) {
			double distance = stops.get(i).calcDistance(lat, lng);
			if (distance < smallestDistance) {
				smallestDistance = distance;
				station = i;
			}
		}

		return stops.get(station);
	}

	public CTAStation nearestStation(GeoLocation location) {
		double smallestDistance = stops.get(0).calcDistance(location);
		int station = 0;
		for (int i = 0; i < stops.size(); i++) {
			double distance = stops.get(i).calcDistance(location);
			if (distance < smallestDistance) {
				smallestDistance = distance;
				station = i;
			}
		}
		return stops.get(station);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CTARoute other = (CTARoute) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stops == null) {
			if (other.stops != null)
				return false;
		} else if (!stops.equals(other.stops))
			return false;
		return true;
	}

}
