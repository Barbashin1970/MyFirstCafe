package ru.cafe;
public class Main {
    public static void main(String[] args) {
        Cafe restaurant = new Cafe();
        restaurant.checkPears();
        restaurant.showMenu();
        for (int i = 0; i < restaurant.menuLength(); i++) {
            restaurant.cook(restaurant.menu[i]);
            restaurant.checkPears();
        }
    }
}