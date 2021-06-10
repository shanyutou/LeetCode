import java.util.ArrayList;

import javafx.scene.chart.Chart;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        
        if(s.length() == 0) return true;
        /**
         * 通过出栈入栈方式
         */
        ArrayList strust = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            String pop = s.substring(i,i + 1);
            if(strust.size() == 0){
                strust.add(pop);
                continue;
            }
            if(strust.get(strust.size() -1).equals("(")  && pop .equals(")") ){
                strust.remove(strust.size() -1);
                continue;
            }
            if(strust.get(strust.size() -1) .equals("{") && pop .equals("}") ){
                strust.remove(strust.size() -1);
                continue;
            }
            if(strust.get(strust.size() -1) .equals("[")  && pop .equals("]") ){
                strust.remove(strust.size() -1);
                continue;
            }
            strust.add(pop);
        }

        return strust.size() == 0;

    }
}
// @lc code=end

