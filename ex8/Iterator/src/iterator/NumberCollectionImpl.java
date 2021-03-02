

import java.util.ArrayList;
import java.util.List;

public class NumberCollectionImpl implements NumberCollection {

    List<Number> numbersList;

    public NumberCollectionImpl() {
        numbersList = new ArrayList<>();
    }

    public void addNumber(Number c) {
        this.numbersList.add(c);
    }

    public void removeNumber(Number c) {
        this.numbersList.remove(c);
    }

    @Override
    public NumberIterator iterator(NumberTypeEnum type) {
        return new NumberIteratorImpl(type, this.numbersList);
    }

    private class NumberIteratorImpl implements NumberIterator {

        private NumberTypeEnum type;
        private List<Number> nums;
        private int position;

        public NumberIteratorImpl(NumberTypeEnum ty,
                List<Number> numbersList) {
            this.type = ty;
            this.nums = numbersList;
        }
        
        @Override
        public boolean hasNext() {  // implement iteration
            while (position < nums.size()) {
                Number c = nums.get(position);
                if (c.getTYPE().equals(type) || type.equals(NumberTypeEnum.ALL)) {
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }
        @Override
        public Number next() {
            Number c = nums.get(position);
            position++;
            return c;
        }
    }
}