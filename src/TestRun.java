import java.util.Arrays;

public class TestRun {
    public TestRun() {
    }

    public static void main(String[] args) {
        Person person= new Person("Subash",25,6.0f);
        Person.printGreeting();
        System.out.println(person.name);

     //**************Reversing an Array***************************
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] reverseArray=new int[arr.length];
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseArray));


        //******************Reversing a String******************
        String str ="Learning Java";
        char[] chars = str.toCharArray();
        char[] reverse = new char[chars.length];
        for (int i = 0; i <reverse.length ; i++) {
            reverse[i]=chars[chars.length-1-i];

        }
        String reverseString= new String(reverse);
        System.out.println(str);
        System.out.println(reverse);
    }
}
