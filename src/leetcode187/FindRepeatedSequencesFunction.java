package leetcode187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRepeatedSequencesFunction {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        
        Map<String, Integer> map = new HashMap<>();
        
        int i = 0;
        
        while(i + 10 <= s.length()){
            String sequences = s.substring(i, i + 10);
            i++;
            
            map.put(sequences, map.getOrDefault(sequences, 0) + 1);
            
            if(map.get(sequences) == 2){
                result.add(sequences);
            }
        }
              
        return result;
    }
}
