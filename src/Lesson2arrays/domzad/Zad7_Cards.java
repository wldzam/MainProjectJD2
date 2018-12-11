package Lesson2arrays.domzad;
//7. Написать программу, эмулирующую выдачу случайной карты из колоды в 52 карты.
//      Вывести результат в формате "Карта of Масть". Например, "AceofSpades".
//      Валет - Jack, Дама - Queen, Король - King, 
// Туз - Ace, Червы - Hearts, Пики - Spades, Трефы - Clubs, Бубны - Diamonds


public class Zad7_Cards {

    public static void main(String[] args) {
        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        int i = (int) (Math.random() * RANKS.length);
        int j = (int) (Math.random() * SUITS.length);
        System.out.println(RANKS[i] + " of " + SUITS[j]);


    }}
