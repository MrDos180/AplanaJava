public class Arrays {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int first= array[0];
        int last= array[array.length-1];
        int mid= array[array.length/2];
        array[0]=last;
        array[4]=first;

        System.out.println(array[0]+mid);
    }
}

