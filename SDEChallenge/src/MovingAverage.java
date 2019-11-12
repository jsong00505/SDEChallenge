public interface MovingAverage {

    // Adds the item
    void add(int item);

    // Gets the average of the last N items
    double ave();

    // Gets the item based on the given index
    int get(int i);
}
