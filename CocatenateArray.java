package arrays;

import java.util.Arrays;

public class CocatenateArray {

	public static void main(String[] args) 
	{
		int [] arr1 = {33,45,65,23,12};
		int [] arr2 = {67,87,90,56,45};
		
		int alen = arr1.length;
		int blen = arr2.length;
		int[] result = new int[alen+blen];
		
		System.arraycopy(arr1, 0, result, 0, alen);
        System.arraycopy(arr2, 0, result, alen, blen);

        System.out.println(Arrays.toString(result));
	}

}
