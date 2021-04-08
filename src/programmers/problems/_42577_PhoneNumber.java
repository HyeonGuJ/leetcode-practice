package programmers.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _42577_PhoneNumber {


    public boolean solution(String[] phoneBook) {

        Map<String, Boolean> map = new HashMap();

        //make map
        for (int i = 0; i < phoneBook.length; i++) {
            String phoneNumber = phoneBook[i];
            for (int j = 1; j < phoneNumber.length(); j++) {
                map.put(phoneNumber.substring(0, j), true);
            }
        }

        Set<String> keys = map.keySet();

        //make answer
        for (int i = 0; i < phoneBook.length; i++) {
            String phoneNumber = phoneBook[i];
            if (keys.contains(phoneNumber)) {
                return false;
            } else {
                continue;
            }
        }
        return true;
    }
}
