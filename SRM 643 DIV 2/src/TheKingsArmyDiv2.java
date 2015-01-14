import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class TheKingsArmyDiv2 {
    private static final char H = 'H';
    private static final char S = 'S';

    public int getNumber(String[] state) {
        if (state.length == 0) return 0;
        int count = 0;
        for (String s : state) {
            for (char c : s.toCharArray()) {
                if (c == H) count++;
            }
        }
        if (count == 0) return 2;
        int l = state.length;
        int m = state[0].length();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++) {
                char c = state[i].charAt(j);
                if (c == H
                        && ((i > 1 && state[i - 1].charAt(j) == H)
                        || (i + 1 < l && state[i + 1].charAt(j) == H)
                        || (j > 1 && state[i].charAt(j - 1) == H)
                        || (j + 1 < m && state[i].charAt(j + 1) == H)))
                    return 0;
            }
        }
        return 1;
    }
}
