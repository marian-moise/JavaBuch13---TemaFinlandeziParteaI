package week4;

import libs.LyyraCard;

public class Exercise77 {
    public static void main(String[] args) {
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        System.out.println("Pekka: " + cardPekka);
        cardBrian.payEconomical();
        System.out.println("Brian: " + cardBrian);
        cardPekka.loadMoney(20);
        System.out.println("Pekka: " + cardPekka);
        cardBrian.payGourmet();
        System.out.println("Brian: " + cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        System.out.println("Pekka: " + cardPekka);
        cardBrian.loadMoney(50);
        System.out.println("Brian: " + cardBrian);

        // write code here
    }
}
