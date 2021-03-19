package Sort;

public interface AbstractSort {
    default int[] sort(int[] array){
        return array;
    }
}
