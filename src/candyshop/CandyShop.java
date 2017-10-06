package CandyShop;

import java.util.ArrayList;

public class CandyShop {

    protected static String CANDY;
    protected static String LOLLIPOP;
    private int storedSugar;
    private double income;
    private ArrayList<Sweets> storage;

    public CandyShop(int sugar) {
        CANDY = "candy";
        LOLLIPOP = "lollipop";
        storage = new ArrayList<>();
        storedSugar = sugar;
    }

    public void createSweets(String name) {
        storage.add(new Sweets(name));
        storedSugar -= storage.get(storage.size() - 1).sugar;
    }

    public void raise(double percentage) {
        for (int i = 0; i < storage.size() ; i++) {
            storage.get(i).raisePrice(percentage);
        }
    }

    public void sell (String name, int sellCount) {
        while (sellCount > 0) {
            for (int i = 0; i < storage.size(); i++) {
                if (storage.get(i).name.equals(name)) {
                    income += storage.get(i).price;
                    storage.remove(i);
                    sellCount--;
                }
            }
        }
    }

    public void buySugar(int buyAmount) {
        storedSugar += buyAmount;
        income -= (buyAmount / 10);
    }

    public int countCandy() {
        int count = 0;
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).name.equals("candy")) {
                count++;
            }
        }
        return count;
    }

    public int countLollipop() {
        int count = 0;
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).name.equals("lollipop")) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Inventory: " + countCandy() + " candies, " + countLollipop() + " lollipops, Income: " +
                income + "$, Sugar: " + storedSugar + "gr";
    }
}
