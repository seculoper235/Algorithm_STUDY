package DataStructure;

import java.util.*;
import java.util.stream.Collectors;

public class DataTest {
    public static void main(String[] args) {
        String[] dataList1 = {"mislav", "stanko", "mislav", "ana"};
        String[] dataList2 = {"stanko", "ana", "mislav"};

        HashMap<Integer, String> hashMap = new HashMap<>();

        for(String data1: dataList1) {
            hashMap.put(Arrays.asList(dataList1).indexOf(data1), data1);
        }

        List<String> textList = Arrays.stream(dataList1).sorted().collect(Collectors.toList());
        System.out.println("Arrays.toString(textList) = " + textList);

        /*
        // 해시맵 출력하기
        Set<Integer> keySet = hashMap.keySet();
        for(Integer key: keySet) {
            System.out.println("[key]: " +key+ ", [value]: " +hashMap.get(key));
        }

        // 컬렉션 객체 형변환
        Set<String> valueSet = new HashSet<>(hashMap.values());
        ArrayList<String> valueList = new ArrayList<>(hashMap.values());

        //HashMap<?, String> valuemap = new HashMap((Map) hashMap.values());
        //Hashtable valueTable = new Hashtable((Map) hashMap.values());
        String[] valueArr = new String[hashMap.values().size()];

        // 해시맵 키와 값 바꾸기
        Set<Integer> keySet1 = hashMap.keySet();
        HashMap<String, Integer> reverseHashMap = new HashMap<>();
        for(Integer value: keySet1) {
            reverseHashMap.put(hashMap.get(value), value);
        }

        // 해시맵 키와 값 바꾸기(Entry 이용)
        for(Map.Entry<Integer, String> entry: hashMap.entrySet()) {
            reverseHashMap.put(entry.getValue(), entry.getKey());
        }

        // 해시맵 중복 허용 버전(키에다 value를, 값에다 중복수를)
        HashMap<String, Integer> newMap = new HashMap<>();
        for(String item: dataList1) {
            newMap.put(item, newMap.getOrDefault(item, 0)+1);
        }

        for(Map.Entry<String, Integer> item: newMap.entrySet()) {
            System.out.println("[Key] = " + item.getKey()+ ", [Value] = " + item.getValue());
        }

        Arrays.sort(dataList1);
        System.out.println("dataList1 = " + Arrays.toString(dataList1));

        HashMap<Integer, ?> test = new HashMap<>();

         */
    }

    public int lamdaText(int a, int b) {
        return 0;
    }
}
