import java.util.Scanner;

public class Kiosk {
    private Scanner sc = new Scanner(System.in);

    public Order setUp() {
        int burger = selectBurger();
        int frozenCustard = selectFrozenCustard();
        int Beer = selectBeer();
        int Drink = selectDrink();
        int price = 0;
        int time = 0;
        Order order = new Order(burger, frozenCustard, Beer, Drink, price, time);
        return order;
    }

    private int selectBurger() {
        System.out.println("[Burgers Menu]");
        System.out.println("1. ShakeBurger");
        System.out.println("2. SmokeShake");
        System.out.println("3. ShroomBurger");
        System.out.println("4. CheeseBurger");
        System.out.println("5. HamBurger");

        String result = sc.nextLine();
        return Integer.parseInt(result);
    }

    private int selectFrozenCustard() {
        String result = sc.nextLine();
        return Integer.parseInt(result);
    }

    private int selectBeer() {
        String result = sc.nextLine();
        return Integer.parseInt(result);
    }

    private int selectDrink() {
        String result = sc.nextLine();
        return Integer.parseInt(result);
    }

    public Order showMenu() {

    }
}
