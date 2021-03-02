

public interface NumberCollection {
    public void addNumber(Number c);
    public void removeNumber(Number c);
    public NumberIterator iterator(NumberTypeEnum type);
}
