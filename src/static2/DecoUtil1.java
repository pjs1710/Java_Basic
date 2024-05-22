package static2;

public class DecoUtil1 {

    public String deco(String str) { // 인스턴스 메서드 > static이 없는 메서드는 인스턴스 생성해야 호출 가능
        return "*" + str + "*";
    }
}
