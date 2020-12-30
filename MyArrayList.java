package Collections.MyArrayList;

public class MyArrayList<E, Object> {
    public Object[] array;
    public int count = 0;

    public int size() {
        return count;
    }

    public void add(E item) {
        int i;
        Object[] newArray = new Object[count + 1];
        for (i=0; i < count; i++) {
            newArray[i] = array[i];
        }
        newArray[count] = (Object) item;
        array = newArray;
        count++;
    }

    public void remove(int index) {
        int i;int k = 0;
        Object[] newArray = new Object[count - 1];
        for (i=0; i < count; i++) {
            if (i != index) {
                newArray[k] = array[i];
                k++;
            }
        }
        array = newArray;
        count--;
    }

    public void remove(E elem) {
        int countU = 0;
        int i ;
        for (i=0; i < count; i++) {
            if (array[i] == elem)
                count++;
        }

        Object[] newArray = new Object[count - count];
        int k = 0;
        for (i=0; i < count; i++) {
            if (array[i] != elem) {
                newArray[k] = array[i];
                k++;
            }
        }

        array = newArray;
        count -= count;
    }

    public E get(int index) {
        return (E)array[index];
    }

    public void clear() {
        int i;
        for (i=0; i < count; i++) {
            this.remove(0);
        }

        count = 0;
    }
}