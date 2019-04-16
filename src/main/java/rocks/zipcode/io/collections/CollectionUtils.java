package rocks.zipcode.io.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUtils {

    /**
     * @param collection - object to be converted to list
     * @param <E>        - type of collection
     * @return list with identical contents
     */
    public static <E> List<E> toList(Collection collection) {
        List<E> list = new ArrayList<>();
        list.addAll(collection);
        return list;
    }

    /**
     * @param nestedCollection - collection to be evaluated
     * @param collection       - collections to be sought within `nestedCollection`
     * @return true if `nestedCollection` contains a collection with contents identical to `collection`
     */
    public static Boolean contains(Collection<? extends Collection<?>> nestedCollection, Collection<?> collection) {

        return  nestedCollection.contains(collection);
    }

    /**
     * @param collections - collections to be nested
     * @return a single collection containing each of the collections passed in as an argument
     */
    public static Collection<? extends Collection<?>> nest(Collection<?>... collections) {
        List<ArrayList<?>> retVal = new ArrayList<ArrayList<?>>();
//        retVal.forEach( -> add(collections[0]));

        return retVal;
    }

    /**
     * @param collections - collections to be combined
     * @return a single collection containing the aggregate contents of each collection passed in as an argument
     */
    public static Collection<?> flatten(Collection<?>... collections) {
        Collection<?> retVal = new ArrayList<>();
//        for(int i =0; i< collections.length; i++){
//            retVal.add(collections[i]);
//        }
//        retVal.addAll(collections);
//        retVal.stream(collections::addAll);
        return retVal;
    }
}
