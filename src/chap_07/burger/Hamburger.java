package chap_07.burger;

public class Hamburger {
    public String name;

    public Hamburger() {
        this.name = "햄버거";
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("주 재료는 : ");
        for (Ingredients ingredient : Ingredients.values()) {
            System.out.println(ingredient);
        }
    }
}

class Cheeseburger extends Hamburger {
    public Cheeseburger() {
        this.name = "치즈버거";
    }

    public void cook() {
        super.cook();
        System.out.println("치즈");
    }
}

class Shrimpburger extends Hamburger {
    public Shrimpburger() {
        this.name = "새우버거";
    }

    public void cook() {
        super.cook();
        System.out.println("새우");
    }
}

enum Ingredients {
    양상추, 패티, 피클
}