public class Point3D extends Point2D{
    protected float z;
    public Point3D(){
    }
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y ,float z){
        setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] xyz = {x,y,z};
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
