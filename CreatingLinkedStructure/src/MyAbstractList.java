public abstract class MyAbstractList<E> implements MyList<E> {

    protected int size = 0; // size of the list

    //Create a default list
    protected MyAbstractList(){

    }

    //Crete a list from an array of objects
    protected MyAbstractList(E[] objects){
        for(int i = 0; i < objects.length; i++){
            add(objects[i]);
        }
    }

    @Override
    public void add(E e) {
        add(size, e);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(E e) {
        if(indexOf(e) >= 0){
            remove(indexOf(e));
            return true;
        }
        else
            return false;
    }

    @Override
    public int size() {
        return size;
    }


}
