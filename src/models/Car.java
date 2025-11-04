package models;

import java.util.Objects;

public class Car  implements Comparable<Car>{
    private int id;
    private String model;
    private String culoare;
    private int anFabricatie;
    private int price;

   public Car(int id, String model, String culoare, int anFabricatie, int price){
       this.id = id;
       this.model = model;
       this.culoare = culoare;
       this.anFabricatie = anFabricatie;
       this.price = price;
   }


   private Car(Builder builder){
       this.id = builder.id;
       this.model = builder.model;
       this.culoare = builder.culoare;
       this.anFabricatie = builder.anFabricatie;
       this.price = builder.price;
   }

   public static class Builder{
       private int id;
       private String model;
       private String culoare;
       private int anFabricatie;
       private int price;

       public Builder id(int id){
           this.id = id;
           return this;
       }

       public Builder model(String model){
           this.model = model;
           return this;
       }

       public Builder culoare(String culoare){
           this.culoare = culoare;
           return this;
       }

       public Builder anFabricatie(int anFabricatie){
           this.anFabricatie = anFabricatie;
           return this;
       }

       public Builder price(int price){
           this.price = price;
           return this;
       }

       public Car build(){
           return new Car(this);
       }
   }
   //Setters
    public void setId(int id){
       this.id = id;
    }
   public void setModel(String model){
       this.model = model;
    }
    public void setCuloare(String culoare){
       this.culoare = culoare;
    }
    public void setAnFabricatie(int anFabricatie){
       this.anFabricatie = anFabricatie;
    }
    public void setPrice(int price){
       this.price = price;
    }
    //Getters
    public int getId(){
       return id;
    }
    public String getModel(){
       return model;
    }
    public String getCuloare(){
       return culoare;
    }
    public int getAnFabricatie(){
       return anFabricatie;
    }
    public int getPrice(){
       return price;
    }

    @Override
    public String toString(){
       return "id: " + this.id + "model: " + this.model + "culoare: " + this.culoare + "anFabricatie: " + this.anFabricatie + "price: " + this.price;
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

