package isp1;

import isp1.pay.impl.InternetPaymentService;
import isp1.pay.impl.TerminalPaymentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payCreditCard(10);
        internetService.payPhoneNumber(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
    }
}
/*
* Был нарушен "Принцип разделения интерфейсов. Интерфейс Payable был разбит на несколько интерфейсов.
* Каждый конкретный класс, характеризующий форму оплаты, имплементирует только тот интерфейс, который он
* поддерживает.
* */