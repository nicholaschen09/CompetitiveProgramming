import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


	public class stargazing1 {

	    static class Planet {
	        int x, y;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String firstLine = in.nextLine();
	        int numPlanets = Integer.parseInt(firstLine);

	        List<Planet> planets = new ArrayList<Planet>();
	        Planet first = new Planet();
	        first.x = 0;
	        first.y = 0;
	        planets.add(first);

//	        System.out.println("numPlanets: " + numPlanets);
	        for (int i = 1 ; i < numPlanets ; i++) {
	             String line = in.nextLine();
	             String[] split = line.split(" ");
	             int p = Integer.parseInt(split[0]);
	             int xDiff = Integer.parseInt(split[1]);
	             int yDiff = Integer.parseInt(split[2]);

	             Planet init = planets.get(p-1);
	             Planet planet = new Planet();
	             planet.x = init.x + xDiff;
	             planet.y = init.y + yDiff;

	             planets.add(planet);

	        }

	        List<Planet> uniquePlanets = new ArrayList<Planet>();
	        for (Planet p : planets) {
	            boolean add = true;
	            for (Planet u : uniquePlanets) {
	                if (p.x == u.x && p.y ==u.y) {
	                    add = false;
	                }
	            }
	            if (add) {
	                uniquePlanets.add(p);
	            }
	        }

	        System.out.println(uniquePlanets.size());
	    }
	}
