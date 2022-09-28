/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author JavierSoto
 */
public class CalculoInteres {

   
    private float tinteres ;
    private float nyears;
    private float capital ;
    
        public CalculoInteres (float tinteres, float capital, float nyears) {
        this.tinteres = tinteres;
        this.capital = capital;
        this.nyears = nyears;
        //this.calcular
    }
        
 public float calculo () {
     return this.capital * (this.tinteres / 100)*100 * this.nyears;
 }
        
  public double resultado () {
     return this.capital + (this.capital * ((this.tinteres/100)*100) * this.nyears);
 }
 
    public double getTinteres() {
        return tinteres;
    }

    public void setTinteres(float tinteres) {
        this.tinteres = tinteres;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public double getNyears() {
        return nyears;
    }

    public void setNyears(float nyears) {
        this.nyears = nyears;
    }
   
  //  double resultado = getCapital() * (getTinteres()/100) * getNyears();
}
