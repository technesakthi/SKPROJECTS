package Labsession;
import java.util.*;
public class ArrayNumFreq {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            Map<Integer, Integer> freqMap = new LinkedHashMap<>();
            for (int num : arr) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            }
            for (Integer key : freqMap.keySet()) {
                System.out.println(key + " occurs " + freqMap.get(key) + " times");
            }

        }
    }


