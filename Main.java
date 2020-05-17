package pack1;
import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ввод и сортировка");

        /*int[] arr=new int[7];
        System.out.println("Введите целые числа с клавиатуры:");
        for (int i=0; i<arr.length; i++) {
            arr[i]=Integer.parseInt(reader.readLine());
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Введите число для поиска в массиве:");
        int number = Integer.parseInt(reader.readLine());
        boolean mark = false;

        for (int elem:arr) {
            if(number==elem) {
                mark=true;
                break;
            }
        }
        System.out.println("В массиве есть число " + number+ ": "+mark);

        int index = -1;
        for (int i =0; i<arr.length; i++) {
            if(number==arr[i]) {
                index=i;
                mark = true;
                break;
            }
        }
        System.out.println("Индекс искомого элемента = " +index);*/


        System.out.println("Сортировка пузырьком:");

        int[] arr1=new int[7];
        System.out.println("Введите целые числа с клавиатуры:");
        for (int i=0; i<arr1.length; i++) {
            arr1[i]=Integer.parseInt(reader.readLine());
        }
        System.out.println(Arrays.toString(arr1));

        int c;
        for (int i=arr1.length-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if (arr1[j]>arr1[j+1]) {
                    c=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=c;
                }
            }

        }
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arr1));


        System.out.println("Бинарный поиск:");

        int first = 0;
        int last = arr1.length - 1;

        System.out.println("Введите искомое число с клавиатуры:");
        int number1 = Integer.parseInt(reader.readLine());

        System.out.println("Индекс числа "+number1+": "+binarySearch(arr1, number1, first, last));


        /*

        String[] strArr = new String[7];
        for (int i=0; i<arr.length; i++){
          strArr[i] = reader.readLine();
        }
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        System.out.println("Коллекции");

        Set<Integer> set1 = new TreeSet<>();
        System.out.println("Введите целые числа с клавиатуры:");
        for (int i=0; i<7; i++) {
            set1.add(Integer.parseInt(reader.readLine()));

        }
        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<>();
        System.out.println("Введите целые числа с клавиатуры:");
        for (int i=0; i<7; i++) {
            set2.add(Integer.parseInt(reader.readLine()));

        }
        System.out.println(set2);

        Set<User> set3 = new TreeSet<>();
        set3.add(new User("login1", "pass1", true));
        set3.add(new User("login2", "pass2", true));
        set3.add(new User("login3", "pass3", false));
        set3.add(new User("login3", "pass4", false));

        System.out.println(set3);*/

    }
    public static int binarySearch(int[] sortedArray,int key,int low,int high) {
        int index1 = -1;


        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index1 = mid;
                break;
            }
        }
        return index1;
    }


}

