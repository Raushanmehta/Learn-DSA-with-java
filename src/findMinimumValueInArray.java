public class findMinimumValueInArray {
    public static void main(String[] args) {

        int[] my_array = {2,9,6,8,6,7,8};
        int minVal = my_array[0];

        for (int i : my_array){
            if(i < minVal){
                minVal = i;
            }
        }
        System.out.println("lowest number : " + minVal);
    }
}
