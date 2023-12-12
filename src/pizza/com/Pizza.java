package pizza.com;

public class Pizza {
    private int price;
    private int extracheese = 100;
    private int extraTopping = 200;
    private int bag = 20;
    private int basePizza;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isBagAdded = false;
    private static boolean veg;

    public Pizza(boolean veg) {
        this.veg = veg;
        basePizza = veg ? 300 : 400;
        this.price = basePizza;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extracheese;
    }

    public void addExtraToppings() {
        isExtraToppingAdded = true;
        this.price += extraTopping;
    }

    public void takeaway() {
        isBagAdded = true;
        this.price += bag;
    }

    public void getBill() {
        String bill = "Base Pizza: " + basePizza + "\n";
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese added: " + extracheese + "\n";
        }
        if (isExtraToppingAdded) {
            bill += "Extra Topping added: " + extraTopping + "\n";
        }
        if (isBagAdded) {
            bill += "Takeaway added: " + bag + "\n";
        }
        bill += "Total Bill: " + this.price + "\n";
        System.out.println(bill); // Print the bill
    }

    public static void main(String[] args) {
        /*Pizza bp = new Pizza(false);
        bp.addExtraCheese();
        bp.addExtraToppings();
         bp.takeaway();
        bp.getBill();*/
        PizzaMain dp=new PizzaMain(true);
		
    	dp.addExtraCheese();
        dp.addExtraToppings();
        dp.takeaway();
        dp.getBill();
    }
}
