package static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count);

        // Data2의 인스턴스는 data1, data2, data3으로 총 3개의 인스턴스가 생성되고, Counter의 인스턴스인 counter는 Data2의 각각의 인스턴스에서 하나의
        // counter 인스턴스로 접근해서 ++; 했기 때문에 count값은 3으로 측정된다.
    }
}
