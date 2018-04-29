public class Dog {
  public String name;
  public int number;
  public double price;
  
    public Dog(String name, int number, double price) {
        this.name = name;
        this.number = number;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {
         Dog dog1 = new Dog("jerry", 10, 5000.0);
        System.out.println("name:-" + dog1.getName());
        System.out.println("number:-" + dog1.getNumber());
        System.out.println("price:-" + dog1.getPrice());
        // TODO code application logic here
    }
    
}
