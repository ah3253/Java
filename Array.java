/**
 * Created by Administrator on 2015/6/23 0023.
 */
public class Array {
    public static void main(String[] args) {
		/**
		Integer i = Integer.parseInt(args[0]);
		if(i == 10){
			System.out.println("hello " + i);
		}
		
		if( i == 20){
			System.out.println("world " +  i);
		}
		
		String str = args[1];
		System.out.println("hello " + str);
		
		double number = Double.parseDouble(args[2]);
		System.out.println(10*number);
		
		
		//Integer i = Integer.parseInt(args[0]);
        //int[] arr = new int[3];
        arr[0] = 1090;
        arr[1] = 59;
        arr[2] = 33;
		**/
		
		double[] list = new double[30];
		/**
		list[0]=1;
		list[1]=2;
		list[2]=3;
		
		int i = 0;
		while (i < 30) {
			list[i]=10*i;
			i = i+1;
			
		}
		**/
		
		for(int i = 0; i < 30; i++){
			list[i] = i * 10;
		}
		
		//System.out.println(i);
		int[] arr1 = {1, 3, 5};
		
		System.out.println(list[2]);
    }
}
