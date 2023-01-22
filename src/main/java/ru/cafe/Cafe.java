package ru.cafe;

public class Cafe {
    int pearsCount;

    String[] menu = {"Шарлотка грушевая", "Компот грушевый", "Салат из груш и лисичек", "Рулет с грушами"};
    public int menuLength() {
        return menu.length;
    }
    public void showMenu() {
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Сегодня у нас в меню " + menu[i]);
        }
    }

    public void checkPears() {
        if (pearsCount < 5) {
            System.out.println("Осталось " + pearsCount + " груш");
            pearsCount = pearsCount + 5;
            System.out.println("Заказали 5 груш на склад");
        } else {
            System.out.println("Груш " + pearsCount + " - пока достаточно");
        }
    }

    public void cook(String name) {
        System.out.println("Готовим " + name);
        pearsCount = pearsCount - 1;
    }

}