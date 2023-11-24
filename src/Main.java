public class Main {
    public static void main(String[] args) {
        // creation of strings to be printed
        String even = "Baz";
        String divsbyfive = "inga!";

        // loop through 1 to 100
        for (int i = 0; i <= 100; i++) {

            // if number is divisible by 2 and 5 print concatenated string
            if(((i % 2) == 0) && ((i % 5) == 0)){
                System.out.println(even + divsbyfive);

            // if number is divisible by 2 print even string
            } else if((i % 2) == 0){
                System.out.println(even);

            // if number is divisible by 5 print divsbyfive string
            } else if ((i % 5) == 0) {
                System.out.println(divsbyfive);

            // else print number
            } else {
                System.out.println(i);
            }
        }

    }
}