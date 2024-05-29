package poly.ex3;

public abstract class AbstractAnimal { // 추상 클래스

    public abstract void sound(); // 추상 메서드가 하나라도 있으면 추상 클래스로 정의해야 한다.
    // 메서드 바디부분을 가지지 못함. 컴파일 오류 !

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
