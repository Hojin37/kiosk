import java.util.ArrayList;

public class Order {

    private static final int Yes = 1;

    private final List<Product> products = new ArrayList<>();

    private final int confirmNumber;

    private final int cancelNumber;

    public Order(int menuSize, int frozenCustard, int beer, int drink, int price, int time) {
        this.confirmNumber = menuSize + 1;
        this.cancelNumber = menuSize + 2;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getConfirmNumber() {
        return confirmNumber;
    }

    public int getCancelNumber() {
        return cancelNumber;
    }

    public void addOrderOrNot(int isAdded, Product product) {
        if (isAdded == Yes) {
            products.add(product);
            System.out.println(product.getName() + " 가 장바구니에 추가되었습니다.\n");
        }
    }
    public void cancelOrderOrNot(int input) {
        if (input == Yes) {
            System.out.println("진행하던 주문이 취소되었습니다.\n");
        } else {
            this.products.clear();
        }
    }

    public void confirmOrderOrNot(int input, int waitingNumber) throws InterruptedException {
        if (input == Yes) {
            this.products.clear();
            System.out.println("주문이 완료되었습니다!\n");
            System.out.println("대기번호는 [ " + waitingNumber + " ] 번 입니다.");
            System.out.println("(3초 후 메뉴판으로 돌아갑니다.)\n");
            Thread.sleep(3000);
        }
    }
}
