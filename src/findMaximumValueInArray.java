public class findMaximumValueInArray {
    public static void main(String[] args) {
        int [] my_array = {9,8,3,9,7,96,5};
        int maxVal = my_array[0];

        for (int i : my_array){
            if(i>maxVal){
                maxVal=i;
            }
        }
        System.out.println("Largest Number : " + maxVal);

    }
}
