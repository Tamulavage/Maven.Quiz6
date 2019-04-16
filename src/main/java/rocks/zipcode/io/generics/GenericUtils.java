package rocks.zipcode.io.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericUtils {
    /**
     * @param collection - collection to be converted to an array
     * @param <T>        - type of collection
     * @return array with contents identical to `collection`
     */
    public static <T> T[] toArray(Collection<T> collection) {

        T[] t = collection.toArray((T[]) Array.newInstance(collection.getClass(), collection.size()));
        System.out.println("t");
       for(int i = 0; i < collection.size(); i++)
       {
           System.out.println("T");
        }
        return t;
    }
}
