/*
    File Name: StackInterface.java
    Full Name: Aashin Shazar
 */
package arraystack;

/**
 *
 * @author abeer
 */
public interface StackInterface<T> {
    public void push(T entry);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public void removeBatch(int entry);
}
