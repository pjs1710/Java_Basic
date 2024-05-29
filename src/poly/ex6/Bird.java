package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{ // 상속(abstract)은 하나만 가능, 구현(implements)은 무한정 구현 가능.
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
