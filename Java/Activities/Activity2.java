package activities;

public class Activity2 {
    public static void main(String[]args){
       int num[]={10,77,10,54,-11,10};
       int sum=0;
       for(int number:num){
           //System.out.println(number);
           if(number==10){
               sum+=number;
               //System.out.println(sum);

           }
       }
        if(sum==30)
            System.out.println("SUM: "+sum);
        else
            System.out.println("Invalid number");

    }
}
