package activities;

public class Activity12 {

    public static void main(String[] args) {
        //int num1, num2;
        Addable ad1 = (num1, num2) -> (num1 + num2);
        System.out.println("num1" + ad1.add(10, 20));
        Addable ad2 = (int num1, int num2) -> {
            return (num1 + num2);
        };
        System.out.println(ad2.add(15, 80));
    }
}

