// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int addend = 300;
        int addendMore = 1100;


        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int bonusMore = addendMore > 1000 ? addendMore / 100 : 0;

        int finalAccount = initialAccount + addend + bonus;

        int finalAccound = initialAccount + addendMore + bonus + bonusMore;

        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Бонус: " + bonusMore);
        System.out.println("Итоговый счет:" + finalAccound);


    }
}