package cs314.a1;

public class Vector3D {
	double x;
	double y;
	double z;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("woooo\n");
		Vector3D test = new Vector3D(1,3,5);
		System.out.println("The coordinates are " + test.toString());
	}
	public Vector3D(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void scale(double f){
		this.x *= f;
		this.y *= f;
		this.z *= f;
	}
	public Vector3D add(Vector3D v){
		return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
	}
	public Vector3D subtract(Vector3D v){
		return new Vector3D(this.x - v.x, this.y - v.y, this.z - v.z);
	}
	
	// negate
	public void negate(){
		this.scale(-1);	
	}
	
	// dot
	public double dot(Vector3D v){
		return this.x * v.x + this.y * v.y + this.z * v.z;
	}
	
	// magnitude
	public double magnitude(Vector3D v){
		return Math.sqrt(this.x * v.x + this.y * v.y + this.z * v.z);
	}
	
	// override equalto for testing
	public boolean equals(Vector3D v){
		return this.x == v.x && this.y == v.y && this.z == v.z;
	}
	public String toString(){
		return "{" + this.x + ", " + this.y + ", " + this.z + "}";
	}
	
}
