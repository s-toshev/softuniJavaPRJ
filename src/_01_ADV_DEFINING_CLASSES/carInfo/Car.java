package _01_ADV_DEFINING_CLASSES.carInfo;

public class Car {
   private String brand;
   private String model;
   private int horsepower;

   public String getBrand() {
      return brand;
   }

   public String getModel() {
      return model;
   }

   public int getHorsepower() {
      return horsepower;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public void setHorsepower(int horsepower) {
      this.horsepower = horsepower;
   }
}
