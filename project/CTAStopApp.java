package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CTAStopApp extends CTAStation {

	public static void main(String[] args) throws IOException {

		File CTAfile = new File("src/project/CTAStops.csv");
		String delimitter = ",";
		Scanner sc = new Scanner(CTAfile);
		CTARoute red = new CTARoute("Red",33);
		CTARoute green = new CTARoute("Green",26);
		CTARoute blue = new CTARoute("Blue",33);
		CTARoute brown = new CTARoute("Brown",27);
		CTARoute purple = new CTARoute("Purple",27);
		CTARoute pink = new CTARoute("Pink",22);
		CTARoute orange = new CTARoute("Orange",16);
		CTARoute yellow = new CTARoute("Yellow",3);
		sc.nextLine();
		sc.nextLine();
		while (sc.hasNextLine()) {
			String[] cta_station = sc.nextLine().split(delimitter);
			int redIndex = Integer.parseInt(cta_station[5]);
			int greenIndex = Integer.parseInt(cta_station[6]);
			int blueIndex = Integer.parseInt(cta_station[7]);
			int brownIndex = Integer.parseInt(cta_station[8]);
			int purpleIndex = Integer.parseInt(cta_station[9]);
			int pinkIndex = Integer.parseInt(cta_station[10]);
			int orangeIndex = Integer.parseInt(cta_station[11]);
			int yellowIndex = Integer.parseInt(cta_station[12]);
			CTAStation station = new CTAStation(cta_station[0], Double.parseDouble(cta_station[1]),
				Double.parseDouble(cta_station[2]), cta_station[3], Boolean.parseBoolean(cta_station[4]));
			if (redIndex >= 0) {
				station.setIndex(redIndex);
				red.addStation(station);
				red=red.sortStations(red);

			}
			if (greenIndex >= 0) {
				station.setIndex(greenIndex);
				green.addStation(station);

			}

			if (blueIndex >= 0) {
				station.setIndex(blueIndex);
				blue.addStation(station);
				blue=blue.sortStations(blue);

			}

			if (brownIndex >= 0) {
				station.setIndex(brownIndex);
				brown.addStation(station);
				brown=brown.sortStations(brown);

			}

			if (purpleIndex >= 0) {
				station.setIndex(purpleIndex);
				purple.addStation(station);
				purple=purple.sortStations(purple);

			}

			if (pinkIndex >= 0) {
				station.setIndex(pinkIndex);
				pink.addStation(station);
				pink=pink.sortStations(pink);

			}

			if (orangeIndex >= 0) {
				station.setIndex(orangeIndex);
				orange.addStation(station);
				orange=orange.sortStations(orange);

			}

			if (yellowIndex >= 0) {
				station.setIndex(yellowIndex);
				yellow.addStation(station);
				yellow=yellow.sortStations(yellow);

			}

		}
		boolean repeat = true;
		System.out.println("Welcome to the CTAStop App!");
		System.out.println("Please choose the following options.");
		while (repeat) {
			try {

				System.out.println("\n1: Display Station name" + "\n2: Display Station w/o Wheelchair access"
						+ "\n3: Display Nearest Station" + "\n4: Display information for a station with a specific name"
						+ "\n5: Display information for all stations" + "\n6: Add a new station"
						+ "\n7: Modify existing station" + "\n8: Delete an existing station"
						+ "\n9: Generate a transit path" + "\n10: Exit");
				System.out.print("Enter your choice here: ");
				Scanner reader = new Scanner(System.in);
				int choice = reader.nextInt();

				switch (choice) {

				case 1:
					System.out.println("Red Line: ");
					red.printStations();
					System.out.println();
					System.out.println("Green Line: ");
					green.printStations();
					System.out.println();
					System.out.println("Blue Line: ");
					blue.printStations();
					System.out.println();
					System.out.println("Brown Line: ");
					brown.printStations();
					System.out.println();
					System.out.println("Purple Line: ");
					purple.printStations();
					System.out.println();
					System.out.println("Pink Line: ");
					pink.printStations();
					System.out.println();
					System.out.println("Orange Line: ");
					orange.printStations();
					System.out.println();
					System.out.println("Yellow Line: ");
					yellow.printStations();

					break;
				case 2:
					System.out.print("Need Accessibility?(yes or no)");
					String option = reader.next();
					System.out.print("Enter the line: ");
					String option1 = reader.next();

					switch (option) {

					case "yes":
					case "Yes":
						if (option1.equalsIgnoreCase("red")) {
							for (CTAStation e : red.getStops()) {
								if (e.isWheelchair() == true) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("green")) {
							for (CTAStation e : green.getStops()) {
								if (e.isWheelchair() == true) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("blue")) {
							for (CTAStation e : blue.getStops()) {
								if (e.isWheelchair() == true) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("brown")) {
							for (CTAStation e : brown.getStops()) {
								if (e.isWheelchair() == true) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("purple")) {
							for (CTAStation e : purple.getStops()) {
								if (e.isWheelchair() == true) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("pink")) {
							for (CTAStation e : pink.getStops()) {
								if (e.isWheelchair() == true) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("orange")) {
							for (CTAStation e : orange.getStops()) {
								if (e.isWheelchair() == true) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("yellow")) {
							for (CTAStation e : yellow.getStops()) {
								if (e.isWheelchair() == true) {
									System.out.println(e.getName());
								}
							}
						}
						break;
						
					case "No":
					case "no":
						if (option1.equalsIgnoreCase("red")) {
							for (CTAStation e : red.getStops()) {
								if (e.isWheelchair() == false) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("green")) {
							for (CTAStation e : green.getStops()) {
								if (e.isWheelchair() == false) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("blue")) {
							for (CTAStation e : blue.getStops()) {
								if (e.isWheelchair() == false) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("brown")) {
							for (CTAStation e : brown.getStops()) {
								if (e.isWheelchair() == false) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("purple")) {
							for (CTAStation e : purple.getStops()) {
								if (e.isWheelchair() == false) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("pink")) {
							for (CTAStation e : pink.getStops()) {
								if (e.isWheelchair() == false) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("orange")) {
							for (CTAStation e : orange.getStops()) {
								if (e.isWheelchair() == false) {
									System.out.println(e.getName());
								}
							}
						}
						if (option1.equalsIgnoreCase("yellow")) {
							for (CTAStation e : yellow.getStops()) {
								if (e.isWheelchair() == false) {
									System.out.println(e.getName());
								}
							}
						}
						break;
						
					default:
						System.out.println("Please enter the correct option.");

					}
					
					break;


				case 3:
					System.out.print("Which line do you wnat to be closest to?");
					String line = reader.next();
					System.out.print("Enter the latitude: ");
					double lat = reader.nextDouble();
					System.out.print("Enter the longitude: ");
					double lng = reader.nextDouble();

					if (line.equalsIgnoreCase("red")) {
						System.out.println(red.nearestStation(lat, lng));
					} else
					if (line.equalsIgnoreCase("green")) {
						System.out.println(green.nearestStation(lat, lng));
					} else
					if (line.equalsIgnoreCase("blue")) {
						System.out.println(blue.nearestStation(lat, lng));
					} else
					if (line.equalsIgnoreCase("brown")) {
						System.out.println(brown.nearestStation(lat, lng));
					} else
					if (line.equalsIgnoreCase("purple")) {
						System.out.println(purple.nearestStation(lat, lng));
					} else
					if (line.equalsIgnoreCase("pink")) {
						System.out.println(pink.nearestStation(lat, lng));
					} else
					if (line.equalsIgnoreCase("orange")) {
						System.out.println(orange.nearestStation(lat, lng));
					} else
					if (line.equalsIgnoreCase("yellow")) {
						System.out.println(yellow.nearestStation(lat, lng));
					} else {
						System.out.println("Please enter the options again.");
					}

					break;

				case 4:
					System.out.print("Enter the line of the station: ");
					String line1 = reader.next();
					System.out.print("Enter the name of the station: ");
					String n = reader.next();
					try {

					if (line1.equalsIgnoreCase("red")) {
						CTAStation s = red.lookupStation(n);
						if (s != null) {
							System.out.println(s.toString());
						} else {
							System.out.println("This station does not exist!");
						}
					} else
					if (line1.equalsIgnoreCase("green")) {
						CTAStation g = green.lookupStation(n);
						if (g != null) {
							System.out.println(g.toString());
						} else {
							System.out.println("This station does not exist!");
						}
					} else
					if (line1.equalsIgnoreCase("blue")) {
						CTAStation s = blue.lookupStation(n);
						if (s != null) {
							System.out.println(s.toString());
						} else {
							System.out.println("This station does not exist!");
						}
					} else
					if (line1.equalsIgnoreCase("brown")) {
						CTAStation g = brown.lookupStation(n);
						if (g != null) {
							System.out.println(g.toString());
						} else {
							System.out.println("This station does not exist!");
						}
					} else
					if (line1.equalsIgnoreCase("purple")) {
						CTAStation s = purple.lookupStation(n);
						if (s != null) {
							System.out.println(s.toString());
						} else {
							System.out.println("This station does not exist!");
						}
					} else
					if (line1.equalsIgnoreCase("pink")) {
						CTAStation g = pink.lookupStation(n);
						if (g != null) {
							System.out.println(g.toString());
						} else {
							System.out.println("This station does not exist!");
						}
					} else
					if (line1.equalsIgnoreCase("orange")) {
						CTAStation s = orange.lookupStation(n);
						if (s != null) {
							System.out.println(s.toString());
						} else {
							System.out.println("This station does not exist!");
						}
					} else
					if (line1.equalsIgnoreCase("yellow")) {
						CTAStation g = yellow.lookupStation(n);
						if (g != null) {
							System.out.println(g.toString());
						} else {
							System.out.println("This station does not exist!");
						}
					} else {
						System.out.println("Please enter the correct line.");
					}
					
					} catch(NullPointerException e) {
						System.out.println("Station Not Found!");
					}

					break;

				case 5:
					System.out.println("Red Line: ");
					red.toString();
					System.out.println();
					System.out.println("Green Line: ");
					green.toString();
					System.out.println();
					System.out.println("Blue Line: ");
					blue.toString();
					System.out.println();
					System.out.println("Brown Line: ");
					brown.toString();
					System.out.println();
					System.out.println("Purple Line: ");
					purple.toString();
					System.out.println();
					System.out.println("Pink Line: ");
					pink.toString();
					System.out.println();
					System.out.println("Orange Line: ");
					orange.toString();
					System.out.println();
					System.out.println("Yellow Line: ");
					yellow.toString();
					break;

				case 6:
					System.out.print("Enter the station name: ");
					String st = reader.next();
					System.out.print("Enter the Latitude: ");
					double lat1 = reader.nextDouble();
					System.out.print("Enter the Longitude: ");
					double lng1 = reader.nextDouble();
					System.out.print("Enter the Location(elevated, subway or embankment): ");
					String lo = reader.next();
					System.out.print("Does the station have wheelchair accessibility?");
					boolean wc = reader.nextBoolean();
					System.out.print("Enter the line you want the station to be on: ");
					String rg = reader.next();

					if (rg.equalsIgnoreCase("red")) {
						red.addStation(new CTAStation(st, lat1, lng1, lo, wc));
					} else if (rg.equalsIgnoreCase("green")) {
						green.addStation(new CTAStation(st, lat1, lng1, lo, wc));
					} else if (rg.equalsIgnoreCase("blue")) {
						blue.addStation(new CTAStation(st, lat1, lng1, lo, wc));
					} else if (rg.equalsIgnoreCase("brown")) {
						brown.addStation(new CTAStation(st, lat1, lng1, lo, wc));
					} else if (rg.equalsIgnoreCase("purple")) {
						purple.addStation(new CTAStation(st, lat1, lng1, lo, wc));
					} else if (rg.equalsIgnoreCase("pink")) {
						pink.addStation(new CTAStation(st, lat1, lng1, lo, wc));
					} else if (rg.equalsIgnoreCase("orange")) {
						orange.addStation(new CTAStation(st, lat1, lng1, lo, wc));
					} else if (rg.equalsIgnoreCase("yellow")) {
						yellow.addStation(new CTAStation(st, lat1, lng1, lo, wc));
					} else {
						System.out.println("Please enter again.");
					}

					break;

				case 7:
					System.out.print("Enter the name of the station: ");
					String s_name = reader.next();
					System.out.print("Enter the line that this station is on: ");
					String l = reader.next();
					
					CTAStation c1 = red.lookupStation(s_name);
					CTAStation c2 = green.lookupStation(s_name);
					CTAStation c3 = blue.lookupStation(s_name);
					CTAStation c4 = brown.lookupStation(s_name);
					CTAStation c5 = purple.lookupStation(s_name);
					CTAStation c6 = pink.lookupStation(s_name);
					CTAStation c7 = orange.lookupStation(s_name);
					CTAStation c8 = yellow.lookupStation(s_name);
					
					System.out.print("Modify the name of the station: ");
					String new_sta = reader.next();
					System.out.print("Modify the Latitude: ");
					double lat2 = reader.nextDouble();
					System.out.print("Modify the Longitude: ");
					double lng2 = reader.nextDouble();
					System.out.print("Modify the Location(elevated, subway or embankment): ");
					String lo1 = reader.next();
					System.out.print("Does the station have wheelchair accessibility?");
					boolean wc1 = reader.nextBoolean();
					
					if (l.equalsIgnoreCase("red")) {
						if (c1!=null) {
							red.editStation(c1, new CTAStation(new_sta, lat2, lng2, lo1, wc1));
						} else {
							System.out.println("Unknown");
						}
					} else
					
					if (l.equalsIgnoreCase("green")) {
						if (c2!=null) {
							green.editStation(c2, new CTAStation(new_sta, lat2, lng2, lo1, wc1));
						} else {
							System.out.println("Unknown");
						}
					} else
					
					if (l.equalsIgnoreCase("blue")) {
						if (c3!=null) {
							blue.editStation(c3, new CTAStation(new_sta, lat2, lng2, lo1, wc1));
						} else {
							System.out.println("Unknown");
						}
					} else
						
					if (l.equalsIgnoreCase("brown")) {
						if (c4!=null) {
							brown.editStation(c4, new CTAStation(new_sta, lat2, lng2, lo1, wc1));
						} else {
							System.out.println("Unknown");
						}
					} else if (l.equalsIgnoreCase("purple")) {
						if (c5!=null) {
							purple.editStation(c5, new CTAStation(new_sta, lat2, lng2, lo1, wc1));
						} else {
							System.out.println("Unknown");
						}
					} else
					
					if (l.equalsIgnoreCase("pink")) {
						if (c6!=null) {
							pink.editStation(c6, new CTAStation(new_sta, lat2, lng2, lo1, wc1));
						} else {
							System.out.println("Unknown");
						}
					} else
					
					if (l.equalsIgnoreCase("orange")) {
						if (c7!=null) {
							orange.editStation(c7, new CTAStation(new_sta, lat2, lng2, lo1, wc1));
						} else {
							System.out.println("Unknown");
						}
					} else
						
					if (l.equalsIgnoreCase("yellow")) {
						if (c8!=null) {
							green.editStation(c8, new CTAStation(new_sta, lat2, lng2, lo1, wc1));
						} else {
							System.out.println("Unknown");
						}
					} else {
						System.out.println("Please enter the option again.");
					}
					break;

				case 8:
					System.out.print("Enter the name of the station: ");
					String sta_name = reader.next();
					System.out.print("Enter the line that this station is on: ");
					String rg1 = reader.next();
					CTAStation c = new CTAStation();
					if (rg1.equalsIgnoreCase("red")) {
						c = red.lookupStation(sta_name);

						if (c != null) {
							red.removeStation(c);
						} else {
							System.out.println("Unknown");
						}
					} else if (rg1.equalsIgnoreCase("green")) {
						c = green.lookupStation(sta_name);
						if (c != null) {
							green.removeStation(c);
						} else {
							System.out.println("Unknown");
						}
					} else if (rg1.equalsIgnoreCase("blue")) {
						c = blue.lookupStation(sta_name);
						if (c != null) {
							blue.removeStation(c);
						} else {
							System.out.println("Unknown");
						}
					} else if (rg1.equalsIgnoreCase("brown")) {
						c = brown.lookupStation(sta_name);
						if (c != null) {
							brown.removeStation(c);
						} else {
							System.out.println("Unknown");
						}
					} else if (rg1.equalsIgnoreCase("purple")) {
						c = purple.lookupStation(sta_name);
						if (c != null) {
							purple.removeStation(c);
						} else {
							System.out.println("Unknown");
						}
					} else if (rg1.equalsIgnoreCase("pink")) {
						c = pink.lookupStation(sta_name);
						if (c != null) {
							pink.removeStation(c);
						} else {
							System.out.println("Unknown");
						}
					} else if (rg1.equalsIgnoreCase("orange")) {
						c = orange.lookupStation(sta_name);
						if (c != null) {
							orange.removeStation(c);
						} else {
							System.out.println("Unknown");
						}
					} else if (rg1.equalsIgnoreCase("yellow")) {
						c = yellow.lookupStation(sta_name);
						if (c != null) {
							yellow.removeStation(c);
						} else {
							System.out.println("Unknown");
						}
					} else {
						System.out.println("Please enter the option again.");
					}
					break;

				case 9:
					BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
					String start = "";
					String end = "";
					String co = "";
					CTARoute s_route = null;
					CTARoute e_route = null;
					System.out.println("Enter the starting station: ");
					String s_name1 = io.readLine();
					CTAStation r = red.lookupStation(s_name1);
					CTAStation g = green.lookupStation(s_name1);
					CTAStation b = blue.lookupStation(s_name1);
					CTAStation br = brown.lookupStation(s_name1);
					CTAStation p = purple.lookupStation(s_name1);
					CTAStation pi = pink.lookupStation(s_name1);
					CTAStation o = orange.lookupStation(s_name1);
					CTAStation y = yellow.lookupStation(s_name1);
					//The user is prompted to enter the station where he would want to start with the CTA line(since there could be a station with the same names in different lines), in which the program looks up the station from the object class within the arraylist
					//Then the user is prompted to enter the destination station
					//The if statement is used to compare the two station from these specific cta lines, in which it gives the user an option to transfer between these line through other cta stations
					break;

				case 10:
					System.out.println("Thank you for using the CTAStop App!");
					repeat = false;
					sc.close();
					reader.close();
					break;

				default:
					System.out.println("Please enter the correct choices.");

				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter the correct choices.");
			}
		}
	}
}


	
