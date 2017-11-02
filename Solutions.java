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
					k2 += bCount;public static String hulk(int n){
		try{
        	String a = "";
        	if(n < 1 || n > 100){
	        	return "0";
	        }
	        for(int c=1; c<=n; c++){
	        	if(c%2==1){
	        		a = a+"I hate ";
	        	} else {
	        		a = a+"I love ";
	        	}
	        	if (c==n){
	        		a = a+"it";
	        	}else{
	        		a = a+"that ";
	        	}
       		}
       		return a;    
        } catch(Exception e){
        	return "0";
        }
	}
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
	 public static int antonAndPolyhedrons(int s)	{
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
    
    /**
     @author Andrada, Jason Roy
     @return finalVal The average distance to travel
    */
    public static int TheNewYearMeetingFriends(){
    	int finalVal = 0;
    	Scanner input = new Scanner(System.in);
    
    	int firstInt = input.nextInt();
    	int secInt = input.nextInt();
    	int thirdInt = input.nextInt();    
     
    	int minVal = Math.min(firstInt,Math.min(secInt,thirdInt));
    	int maxVal = Math.max(firstInt,Math.max(secInt,thirdInt));
    	int finalVal = maxVal - minVal;
    	
    	return finalVal;
    }
    
	/**
	Added by ur boi Kyle Christian Mangahas, Spawn of Conrado and Teresa Mangahas
	*/
	public static void Anton  {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] numbersString = s.split(" ");
		int sum = 0;
		int[] numbersNum = new int[numbersString.length];
		for(int i = 0; i<numbersString.length; i++){
			numbersNum[i] = Integer.parseInt(numbersString[i]);
		}
		sum = getSum(numbersNum);
		System.out.println(sum);
	}
	/**
	@return Sum of the numbers formed (256 and 32)
	*/
	static int getSum(int[] array) {
		int sum = 0;
		for(;;){
			if(array[0] == 0) {
				break;
			} else if(array[2] == 0) {
				break;
			} else if(array[3] == 0) {
				break;
			}
			sum += 256;
			array[0]--;
			array[2]--;
			array[3]--;
			
		}
		for(;;){
			if(array[1] == 0){
				break;
			} else if(array[0] == 0) {
				break;
			}
			sum += 32;
			array[1]--;
			array[0]--;
		}
		return(sum);
	}
	
	//Added by San Juan, Jan Paula S.
	/**
	 *@param length Number of letters in a message
	 *@param message Contains the message
	 *@param array An array of the maximum lengths of substring each letter can appear in
	 *@return number of ways to split the message, length of the longest substring and minimum number of substrings
	 */
	public static int[] mahmoudAndAMessage(int length, String message, int[] array){
		int[] array26 = new int[26];
		int[] dp1 = new int[1005];
		int[] dp2 = new int[1005];
		int maxSubstring = 0;
		boolean problem = false;
		for (int i = 0; i < 26; i++){
			if (array26.length >= array.length) {
				array26[i] = array[i];
			} else {
				do {
					problem = false;
					try {
						array26[i] = Integer.parseInt(new Scanner(System.in).next());
					} catch(NumberFormatException x) {
						problem = true;
						System.out.print(" ");
					}
				} while(problem == true);
			}
			System.out.print(" ");
		}
		dp1[0] = 1;
		dp2[0] = 0;
		for(int i = 1; i <= length; i++){
			int f = 0;
			dp2[i] = length;
			for(int i2 = i - 1; i2 >= 0; i2--) {
				f = Math.max(f, i - array[message.charAt(i2) - 'a']);
				if(f > i2) {
					continue;
				}
				dp1[i] = (dp1[i] + dp1[i2]) % 1000000007;
				dp2[i] = Math.min(dp2[i], 1 + dp2[i2]);
				maxSubstring = Math.max(maxSubstring, i - i2);
			}
		}
		int[] output = {dp1[length], maxSubstring, dp2[length]};
		return output;
	}
	
	//Added by Lawrence Christian R. Pagalanan
	/**
	 * @param in number of layers of love and hate
	 * @return Dr. Banner's feelings in one line (e.g. I hate that I love it)
	 */
	public static String hulk(int in){
		try{
			String a = "";
			if (n < 1 || n > 100){
				return "0";
			}
			for (int c=1; c<=n; c++){
				if(c%2==1){
					a = a+"I hate ";
				} else {
					a = a+"I love ";
				}
				if (c==n){
					a = a+"it";
				} else {
					a = a+"that ";
				}
			}
			return a;
		} catch (Exception e) {
			return "0";
		}
	}
}
	/*Added by Viviene Foz
	**/
public class LuckyYear{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long lucky[] = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900,1000,2000,3000,4000,5000,6000,7000,8000,9000,10000,20000,30000,40000,50000,60000,70000,80000,90000,100000,200000,300000,400000,500000,600000,700000,800000,900000,1000000,2000000,3000000,4000000,5000000,6000000,7000000,8000000,9000000,10000000,20000000,30000000,40000000,5000000,60000000,70000000,80000000,90000000,100000000,200000000,300000000,400000000,500000000,600000000,700000000,800000000,900000000,1000000000,2000000000};
		for(int n = 0;i<83;i++){
			if(n<lucky[i]{
				System.out.println(lucky[i] - n);
				System.exit(0);
			}
		}
	}
}

