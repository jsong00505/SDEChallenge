import java.util.ArrayList;

public class MovingAverageImpl implements MovingAverage {
    ArrayList<Integer> list = new ArrayList<>();
    int n;
    int start;
    int sum;

    public MovingAverageImpl(int n) {
        this.n = n;
        start = 0;
        sum = 0;
    }

    @Override
    public void add(int item) {
        list.add(item);
        if(list.size() > item) {
            sum -= list.get(start++);
        }
        sum += item;
    }

    @Override
    public double ave() {
        int size = 1;

        if(list.size() > n) {
            size = n;
        } else if(list.size() > 0) {
            size = list.size();
        }

        return sum / size;
    }

    @Override
    public int get(int i) {
        if(i >= list.size()) {
            throw new IndexOutOfBoundsException("Invalid Access!");
        }
        return list.get(i);
    }
}


