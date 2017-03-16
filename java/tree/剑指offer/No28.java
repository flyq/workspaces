public class No28 {
    public static void main(String[] args)  {
	myPrint("abc" );
	char[] a = {'a','b','c'};
	myPrint(a,0);
    }
    private static void myPrint(String str) {
	if(str==null)
	    return;
	char[] chs=str.toCharArray();
	myPrint(chs,0);
    }
    private static void myPrint(char[] str, int i) {
	if (i >= str.length)
	    return;
	if (i == str.length - 1) {
	    System.out.println(String.valueOf(str));
	} else {
	    for (int j = i; j < str.length; j++) {
		char temp = str[j];
		str[j] = str[i];
		str[i] = temp;
		myPrint(str, i + 1);
		temp = str[j];
		str[j] = str[i];
		str[i] = temp;
	    }
	}
    }
}
