package Test.tandem.task2;

import java.util.HashMap;
import java.util.Map;

public class ElementExampleImpl implements IElement {

    public static class Context {

        // количество операций присвоения
        private int operationCount = 0;
        private int getOperationCount() { return this.operationCount; }
        // проверка на уникальность номеров элементов
        private Map<Integer, ElementExampleImpl> uniqueMap = new HashMap<>();
        private void doSomething(){
            allOperation++;
            this.operationCount++;
        }
        private static  long allOperation = 0;

        private static long getAllOperation() {
            return allOperation;
        }
    }


    private final Context context;
    private final long id;
    private Integer number = null;


    public ElementExampleImpl(final int number) {
        context = new Context();
        this.id = System.identityHashCode(this);
        this.setNumber(number);
    }
    //чило операций
    public int getOperationCount(){
        return context.getOperationCount();
    }
    public long getAllOperation(){
        return Context.getAllOperation();
    }
    /*public void done(){}*/
    @Override
    public long getId() { return this.id; }

    @Override
    public int getNumber() { return this.number; }

    private void setNumber(final int number) {
        if (null != this.number) {
            if (this != this.context.uniqueMap.remove(this.number)) {
                throw new IllegalStateException("Unexpected situation.");
            }
        }

        final ElementExampleImpl old = this.context.uniqueMap.put(this.number = number, this);
        if (null == old) { return; }
        if (this == old) { return; }
        throw new IllegalStateException("Duplicate numbers.");
    }

    @Override
    public void setupNumber(final int number) {
        this.setNumber(number);

        // число таких операций фиксируется
        this.context.doSomething();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return "Clone nit supported Operation"; // клонировать элементы нельзя
    }
    @Override
    public String toString(){
        return "number " + number;
    }
}