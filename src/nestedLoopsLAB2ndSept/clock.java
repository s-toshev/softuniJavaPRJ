package nestedLoopsLAB2ndSept;

public class clock {
    public static void main(String[] args) {
        for (int hh = 0; hh <=23; hh++) {
            for (int mm = 0; mm <=59 ; mm++) {
                System.out.printf("%d:%d%n",hh,mm);
            }
        }

    }
}
