package memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1(); // method1이 종료된 직후에 지역변수인 data1도 제거가 된다. 그렇게 되면 Data 클래스의 인스턴스를 참조하는 곳이 아무 곳도 없다. 즉, 사용되는 곳이 없으니 메모리 낭비 자원.
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10); // data1.value = 10 // 인스턴스 생성 (참조값도 같이)
        // System.out.println("data1 = " + data1); 인스턴스 생성하고 (data1.value = 10) 참조값을 저장 (data1)
        method2(data1); // method2에 data1 참조값을 넘겨준다.
        System.out.println("method1 end");
    }

    // method1은 method2를 호출하면서 Data data2 매개변수에 data1의 참조값(주소)를 넘긴다.
    // 즉 method1에 있는 data1과 method2에 있는 data2는 둘 다 같은 참조값(주소)를 가르키고 있다.
    static void method2(Data data2) { // 받은 참조값으로 Data 클래스에 접근해서
        System.out.println("method2 start");
        System.out.println("data.value = " + data2.getValue()); // data2.value = 10 data2의 참조값은 현재 data1과 같고 data1의 참조값으로 Data 클래스의 인스턴스에 접근 가능
        System.out.println("method2 end");
    }
}