package hello.core.singleton;

public class StatefulService {

//    private int price; // 상태를 유지하느 필드, 10000 -> 200000

//    public void order(String name, int price) {
//        System.out.println("name = " + name + " price = " + price);
//        this.price = price; // 문제 발생!
//    }

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
