package collection;

/**
 * @Description TODO
 * @Author quancong
 * @Email quancong@ixiappu.com
 * @Date 2020/10/26 daemon
 */
public class MyMap {


    public static void main(String args[]) {

//        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int n=4;
        int a[]=new int[n];

        for (int i = 0; i < n; i++) {
            a[i]=i+1;
        }

        int b = bsearchWithoutRecursion(a, n);
        System.err.println(b);
    }

    public static int bsearchWithoutRecursion(int a[], int key) {
        int low = 0;
        int high = a.length - 1;
        int sum=0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] > key) {
                high = mid - 1;
                sum+=high;
                System.err.println("mid:"+a[mid]+"high:"+high);
            } else if (a[mid] < key) {
                low = mid + 1;
                sum+=low;
                System.err.println("mid:"+a[mid]+"low:"+low);
            } else {
                System.err.println("mid++"+a[mid]);

                System.err.println("sum++"+sum);
                return mid;
            }
        }
        return -1;
    }

}
