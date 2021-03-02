package ChainATM;

import java.util.Scanner;

public class DemoChainATM {

    private DispenseChain c1;

    public DemoChainATM() {
        // initialize the chain
        this.c1 = new Baht1000Dispenser();
        DispenseChain c2 = new Baht500Dispenser();
        DispenseChain c3 = new Baht100Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        DemoChainATM atmDispenser = new DemoChainATM();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 100 != 0) {
                System.out.println("Amount should be in multiple of 100s.");
                return;
            }
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }

    }
}
