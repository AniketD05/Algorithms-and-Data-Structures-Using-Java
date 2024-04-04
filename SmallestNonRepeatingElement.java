
class SmallestNonRepeatingElement {

	static int checkNonRepeating(int arr[]) {
		int i, j;

		for (i = 0; i < arr.length; i++) {

			for (j = i + 1; j < arr.length; j++){
				if (arr[i] == arr[j])
					break;
			}
			if (j == arr.length){
				return arr[i];
			}	
		}
		return -1;
	}

	public static void main(String[] args) {

		//int arr[]={10,-4,2,0,2,3,7};
		//int arr[]={3,7,-4,0,3,2};

		int arr[]={-2,5,1,-10,5};
		//int arr[]={-2,-10};
		
		

		System.out.print(checkNonRepeating(arr));
	}
}
