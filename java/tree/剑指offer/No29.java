public class No29 {

    public static void main(String[] args) {
	int[] arr={1,2,3,2,2,2,5,4,2};
	System.out.println(findNum(arr));
    }
    private static Integer findNum(int[] arr) {
	if(arr==null)
	    return null;
    
    
	int result=arr[0];
	int count=1;
	for(int i=1;i<arr.length;i++){
	    if(count==0){
		result=arr[i];
		count=1;
	    }
	    else if(arr[i]==result){
		count++;
	    }
	    else{
		count--;
	    }
	}
	return result;
    }
}
