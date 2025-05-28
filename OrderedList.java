/*
Kyle Reed
Prof. Huang
COS-210-300
25 February 2025
*/


// Ordered List that contains various methods and behaviors
import java.util.LinkedList;
import java.util.ListIterator;

// Private LinkedList<E>theList method that contains list with data
public class OrderedList<E extends Comparable<E>> {
    private LinkedList<E> theList;

    // Constructor
    public OrderedList() {
        theList = new LinkedList<>();
    }

    // Public void add(E obj) method to insert number into list while preserving order
   
    public void add(E element) {
        ListIterator<E> iterator = theList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().compareTo(element) > 0) {
                iterator.previous();
                iterator.add(element);
                return;
            }
        }
        iterator.add(element); // Public Iterator iterator() method for returning an iterator to the list
    }

    // Public E get(int index) method for returning number to specified position in order
    public E get(int index) {
        return theList.get(index);
    }

    // Public boolean remove(E obj) to remove first occurence of specified number from the list
    public boolean remove(E element) {
        return theList.remove(element);
    }

    // Public int size() method to return size of list
    public int size() {
        return theList.size();
    }

    // toString method to display the list
    @Override
    public String toString() {
        return theList.toString();
    }
}