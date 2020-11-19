public class StringPractice {
    public static void main(String[] args) {
        String s = "Alice Adventures in, Wonderland is one of the best selling stories of all time the people will tell Alice story story to their children at bedtimes, Alice story is intruiging part is that";
        String[] str = s.split(" ");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() >= 5) {
                count++;
            }

        }
        System.out.println(count);
        System.out.println(str[2].length());

        int aliceCount=0;
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("Alice")){
                aliceCount++;
            }
        } System.out.println(aliceCount);
    }
    }
