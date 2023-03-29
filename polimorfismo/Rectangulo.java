public  class  Rectangulo  {

    private float llado;
    private float lado;
   

public void setLado(float lado) {
    this.lado = lado;
}


public float getLado() {
    return lado;
}

public void setLlado(float llado) {
    this.llado = llado;
}


public float getLlado() {
    return llado;
}



public void CalcularArea(){
float area =llado *lado;
System.out.println("el area del Rectangulo de lado   "+this.lado+"  es   "+ area);
}

}
