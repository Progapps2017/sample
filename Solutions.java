import java.util.*;
/**
 * @author Progapps Group 2
 */

public class Solutions {
	static Scanner key = new Scanner(System.in);
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
	
	//Added by Pocaan, Dominic P.
	/**
	 * 
	 * @param a Length of the String b input.
	 * @param b String input.
	 * @return
	 */
	public static String antonAndDanik(int a, String b){
		boolean check = false;
		if (b.length() != a) {
			check = false;
		} else{
			check = true;
		}
		
		if (check != true) {
			System.out.print("!!!");
			System.exit(0);
		}
		
		int winAnton = 0;
		int winDanik = 0;
		String x = b.toUpperCase();
		
		for (int i = 0; i < x.length(); i++) {
			if ('A' == x.charAt(i)) {
				winAnton++;
			}
		}
		
		for (int i = 0; i < x.length(); i++) {
			if ('D' == x.charAt(i)) {
				winDanik++;
			}
		}
		
		String result = "";
		
		if (winAnton > winDanik) {
			result = "Anton";
		} else if (winAnton < winDanik) {
			result = "Danik";
		} else {
			result = "Friendship";
		}
		
		return result;
	}
	//Added by Gregorio, Marc Lawrence S.
	/**
	 *
	 * @param s Number of Anton's collection.
	 * @return the total number of faces of the shapes
	 **/
	public static int sumOfFaces(int s)	{
		int result = 0;
        	String[] shapes = {"tetrahedron", "cube", "octahedron", "dodecahedron", "icosahedron"};
        	for (int i = 0; i < s; i++) {
            		int numOfFace = 0;
            		String sh = key.nextLine();
            		sh = sh.toLowerCase();
            		if (sh.equals(shapes[0])) {
                		numOfFace = 4;
           		} else if (sh.equals(shapes[1])) {
                		numOfFace = 6;
            		} else if (sh.equals(shapes[2])) {
                		numOfFace = 8;
            		} else if (sh.equals(shapes[3])) {
                		numOfFace = 12;
            		} else {
                		numOfFace = 20;
            		}	
            		result += numOfFace;
        	}
        	return result;
    }
}
