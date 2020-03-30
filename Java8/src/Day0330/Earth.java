package Day0330;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SUPERFACE_ARIA;
	
	static {
		EARTH_SUPERFACE_ARIA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
