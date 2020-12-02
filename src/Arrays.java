public class Arrays {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int first= array[array.length-5];
        int last= array[array.length-1];
        array[0]=last;
        array[4]=first;

        System.out.println(array[0]+array[2]);
    }
}

