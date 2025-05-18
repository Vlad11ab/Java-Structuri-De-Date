package models;

import java.util.Objects;

public class Car  implements Comparable<Car>{
    private String model;
    private String culoare;
    private int anFabricatie;

   public Car(String model, String culoare, int anFabricatie){
       this.model = model;
       this.culoare = culoare;
       this.anFabricatie = anFabricatie;
   }


   private Car(Builder builder){
       this.model = builder.model;
       this.culoare = builder.culoare;
       this.anFabricatie = builder.anFabricatie;
   }

   public static class Builder{
       private String model;
       private String culoare;
       private int anFabricatie;

       public Builder model(String model){
           this.model = model;
           return this;
       }

       public Builder culoare(String culoare){
           this.culoare = culoare;
           return this;
       }

       public Builder anFabricatie(int anFabricate){
           this.anFabricatie = anFabricatie;
           return this;
       }

       public Car build(){
           return new Car(this);
       }
   }
   //Setters
   public void setModel(String model){
       this.model = model;
    }
    public void setCuloare(String culoare){
       this.culoare = culoare;
    }
    public void setAnFabricatie(int anFabricatie){
       this.anFabricatie = anFabricatie;
    }
    //Getters
    public String getModel(){
       return model;
    }
    public String getCuloare(){
       return culoare;
    }
    public int getAnFabricatie(){
       return anFabricatie;
    }

    @Override
    public String toString(){
       return "model: " + this.model + "culoare: " + this.culoare + "anFabricatie: ";
    }

    @Override
    public boolean equals(Object o){
        if( o == null ){
            return false;
        }
        Car other=(Car) o;
        return this.model.equals(other.model);


    }

    @Override
    public int compareTo(Car o) {
       if(o.anFabricatie>this.anFabricatie){
           return  1;
       }else if(o.anFabricatie<this.anFabricatie) {
           return -1;
       }
       return 0;
    }

}

//List     Queue(Stiva si Coada)      Set(unicitate si ordinea )


//dictionare  key  value

//todo: implementare queue