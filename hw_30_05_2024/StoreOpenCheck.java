package org.example.hw_30_05_2024;

public class StoreOpenCheck {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;  // Значение зависит от реального состояния, здесь просто пример
        boolean isReweOpen = false;  // Аналогично, это пример

        boolean canShop = canBuy(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду, это " + canShop);
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }
}
