public class Foo {

    private static int countEven(int size, int[] arr) {

        int even = 0;

        for(int index = 0; index < size; index++) {
            if(arr[index] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    private static void createArr(int size, int[] arr) {
        for(int index = 0; index < size; index++) {
            arr[index] = index;
        }
    }

    public static void main(String[] args) {

        int sizeFoo = 5;
        int sizeBar = 100;

        int[] Foo = {0, 1, 2, 3, 4};
        int[] Bar = new int[100];

        createArr(sizeBar, Bar);

        int evenFoo = countEven(sizeFoo, Foo);
        int evenBar = countEven(sizeBar, Bar);

        System.out.printf("Even numbers in Foo: " + evenFoo);
        System.out.printf("\nEven numbers in Bar: " + evenBar);
        System.out.printf("\n");

    }

}
