package tasks;

/**
 * Реализовать трехмерный вектор.
 * Условие: https://habr.com/ru/post/440436/#20
 * Там есть решение. Сначала попробуйте самостоятельно.
 */
class Vector {
    private double x;
    private double y;
    private double z;
    Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
        return Math.sqrt(x*x + y*y + z*z);
    }
    public double scalar_multi(Vector k){
        return x*k.x + y*k.y + z*k.z;
    }
    public double angle(Vector y){
        return scalar_multi(y) / this.length() * y.length();
    }

    public Vector vectr_multi(Vector k){
        return new Vector(y*k.z - z*k.y, z*k.x - x*k.z, x*k.y - y*k.x);
    }

    public Vector sum(Vector k){
        return new Vector(x + k.x, y + k.y, z + k.z);
    }

    public Vector sub(Vector k){
        return new Vector(x - k.x, y - k.y, z - k.z);
    }

    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

}

public class Task04 {

}
