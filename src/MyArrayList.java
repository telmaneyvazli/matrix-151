public class MyArrayList <T> {
    T array [];
    int index =0;
    int size = 10;
    MyArrayList(){
        array = (T[]) new Object[size];
    }
    void add(T input){
        if(size == index){
            T array2 [] = (T[]) new Object[size=size+5];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }

            for (int i = 0; i <array2.length; i++) {
                array = array2;
                array[i] = array2[i];
            }
        }
        array[index++]=input;
    }
    T get (int index){
        return array[index];
    }
}