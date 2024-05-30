package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {

    // Main 부분도 변하는 부분 없음.
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("결제할 수단을 입력하세요 (종료 : exit) : ");
            String payOption = scanner.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("결제할 금액을 입력하세요 : ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(payOption, amount);
        }
    }
}
