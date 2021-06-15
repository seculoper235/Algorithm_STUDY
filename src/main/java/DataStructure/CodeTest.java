package DataStructure;


import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

class DataSet {
    String[] genres ={"classic", "pop", "classic", "classic", "pop"};
    int[] plays = {500, 600, 150, 800, 2500};
    HashSet<String> testSet = new HashSet<String>(Arrays.asList(genres));



    public void Test() {
        Arrays.stream(genres).collect(Collectors.toSet());

        testSet.stream().collect(Collectors.toList());
    }
}

public class CodeTest {
}
