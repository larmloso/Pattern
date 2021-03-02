

public class DemoIterator {


    public static void main(String[] args) {
        NumberCollection nums = populateNumbers();
        NumberIterator baseIterator = nums.iterator(NumberTypeEnum.ALL);
        while (baseIterator.hasNext()) {
            Number c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("******");
        // Channel Type Iterator
        NumberIterator primeIterator = nums.iterator(NumberTypeEnum.PrimeNumber);
        while (primeIterator.hasNext()) {
            Number c = primeIterator.next();
            System.out.println(c.toString());
        }
    }

    private static NumberCollection populateNumbers() {
        NumberCollection numbers = new NumberCollectionImpl();
        numbers.addNumber(new Number(1, NumberTypeEnum.NotprimeNumber));
        numbers.addNumber(new Number(2, NumberTypeEnum.PrimeNumber));
        numbers.addNumber(new Number(3, NumberTypeEnum.PrimeNumber));
        numbers.addNumber(new Number(4, NumberTypeEnum.NotprimeNumber));
        numbers.addNumber(new Number(5, NumberTypeEnum.PrimeNumber));
        numbers.addNumber(new Number(6, NumberTypeEnum.NotprimeNumber));
        numbers.addNumber(new Number(7, NumberTypeEnum.PrimeNumber));
        numbers.addNumber(new Number(8, NumberTypeEnum.NotprimeNumber));
        numbers.addNumber(new Number(9, NumberTypeEnum.NotprimeNumber));
        return numbers;
    }
    
}
