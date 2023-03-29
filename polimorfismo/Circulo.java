

public  class Circulo  {
   double pi= 3.14;

    private float rad;
   

public void setRad(float rad) {
    this.rad = rad;
}


public float getRad() {
    return rad;
}


public void CalcularArea1(){
float area = rad*rad ;
double areaci=pi*area;
System.out.println("el area del circulo de radio   "+this.rad+ " es   "+ areaci);
}

}
