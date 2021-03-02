

public class Number {
    
    private NumberTypeEnum TYPE;
    private int Numbers;

    public Number(int i, NumberTypeEnum type) {
        this.Numbers = i;
        this.TYPE = type;
    }

    public int getNumber() {
        return Numbers;
    }

    public NumberTypeEnum getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Frequency=" + this.Numbers + ", Type=" + this.TYPE;
    }
}
