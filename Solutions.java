import java.util.*;
/**
 * @author Progapps Group 2
 */

public class Solutions {
	public static void main(String[] args) {
		
	}
    //Added by Ballares, Justine Paul C.
    /**
     * @param {int} n the length of the string
     * @param {String} s contains the word representation (B or W)
     * @return {String} First line containing the number of black group and Second line how many black per each group
     */
	public static String jCrossword(int n, String s) {
		if (s.length() > n) {
			return "";
		}

		String k1 = "";
		String k2 = "";
		int bCount = 0;
		char buffer = 'W';
		int bufferIndex = 0;

		if (s.indexOf('B') == -1) {
			return "0";
		} else {
			buffer = s.charAt(s.indexOf('B'));
			bufferIndex = s.indexOf('B');
			bCount++;
		}
		if (!(bufferIndex + 1 == s.length())) {
			for (int x = bufferIndex + 1; x < s.length(); x++) {
				if (s.charAt(x) == 'B') {
					bCount++;
				}
				if (buffer != s.charAt(x)) {
					buffer = s.charAt(x);

					if (bCount != 0 && buffer != 'B') {
						k2 += bCount + ((s.indexOf('B', x) == -1) ? "" : " ");
						bCount = 0;
					}
				}

				if (x + 1 == s.length() && bCount != 0) {
					k2 += bCount;
				}
			}
		} else {
			k2 += bCount;
		}
		
		String[] bGroup = k2.split(" ");
		//change this later
		k1 += bGroup.length;
		return k1 + "\n" + k2;
	}
}
