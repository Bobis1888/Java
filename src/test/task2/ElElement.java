package test.task2;

public class ElElement implements IElement {

    @Override
    public long getId() {
        return this.hashCode();
    }
    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public void setupNumber(int number) {

    }
}
