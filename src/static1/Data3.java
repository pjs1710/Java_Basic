package static1;

public class Data3 {
    public String name; // 멤버 변수
    public static int count; // 클래스 변수, 정적 변수, static 변수
    // static이 붙은 멤버 변수 count는 인스턴스 영역에 생성되지 않는다. DataCountMain3에서 new했을 때 count는 인스턴스인데 인스턴스 영역에 생성되지 않는다.
    // 대신에 count 변수는 메서드 영역에서 관리한다.

    public Data3(String name) {
        this.name = name;
        count++;
    }
}