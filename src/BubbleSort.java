public class BubbleSort {

    public static void main(String[] args) {

        int a[] = {22, 33, -2, 10, 45, 5, -1};
        for (int lastIndex = a.length - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if(a[i]>a[i+1])
                    swap(a, i, i + 1);
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }

    public static void swap(int a[], int i, int j) {
        if (i == j) {
            return;
        }
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
