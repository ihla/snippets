package co.joyatwork.filters;

public class LinearAcceleration {
	
	private final float alpha;
	private float gravity;

	public LinearAcceleration(float alpha) {
		this.alpha = alpha;
		this.gravity = 0;
	}

	public float calculate(float value) {
		gravity = alpha * gravity + (1 - alpha) * value;
		return value - gravity;
	}
}
