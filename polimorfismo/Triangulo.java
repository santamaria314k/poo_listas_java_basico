public class Triangulo {

    private float htr;
   private float btr;

    public void setTri(float htr) {
        this.htr = htr;
    }
    
    
    public float getTri() {
        return htr;
    }
    

    public void setTr(float btr) {
        this.btr = btr;
    }
    
    
    public float getTr() {
        return btr;
    }


    
    public void CalcularArea2(){
    float areatt = btr*htr ;
    double areatr=areatt/2;
    System.out.println("el area del triangulo de altura   "+this.htr+ " y de base   "+ btr+"es   "+areatr);
    }
    






}
