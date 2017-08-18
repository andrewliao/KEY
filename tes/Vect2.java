/*
If you have any questions on how does this work or what do the methods here do, ask a TA.
*/
public class Vect2{
    double x;
    double y;
    
    public Vect2(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Vect2(){
        this(0,0);
    }
    
    
    
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}

   
	
	
	
    public Vect2 mult(double scalar){
        return new Vect2(this.x*scalar, this.y*scalar);
    }
    public double mult(Vect2 vector){
        return this.x*vector.getX()+this.y*vector.getY();
    }
    
    public Vect2 add(Vect2 vector){
        return new Vect2(this.x+vector.getX(), this.y+vector.getY());
    }
    public Vect2 neg(){
        return new Vect2(-this.x, -this.y);
    }
    public Vect2 subtract(Vect2 vector){
        return this.add(vector.neg());
    }
    
    
    public Vect2 rotate(double angle){
        return new Vect2(this.x*Math.cos(angle)-this.y*Math.sin(angle), this.y*Math.cos(angle)+this.x*Math.sin(angle));
    }
    public Vect2 rotate(double angle, Vect2 center){
        return this.subtract(center).rotate(angle).add(center);
    }
    
    
    public double magnitude(){
        return Math.sqrt(this.mult(this));
    }
    
    public String toString(){
        return "("+this.getX()+", "+this.getY()+")";
    }
}