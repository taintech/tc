import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class OkonomiyakiShop {

    public int count(int[] osize, int K) {
        Arrays.sort(osize);
        int sum = 0;
        for (int i = 0; i < osize.length; i++) {
            int cur = osize[i];
            int count = 0;
            for (int j = i + 1; j < osize.length; j++) {
                int next = osize[j];
                if (next - cur <= K) count++;
            }
            sum += count;
        }
        return sum;
    }
}
