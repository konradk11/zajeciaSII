package pl.sii;

public class zadanieTabExe {
    public static void main(String[] args) {
//        int[] tablica = new int[5];
//
//
//        for (int i = 0; i < 6 ; i++) {
//
//            try{
//                tablica[i]=i+1;
//                System.out.println(tablica[i]);
//
//
//            }catch (ArrayIndexOutOfBoundsException j){
//                System.out.println("Poza zakresem tablicy");
//            }
//
//
//        }
        int i;
        int num = 1;
        int maxCheck = 5; // maxCheck limit till which you want to find prime numbers
        boolean isPrime = true;

        //Empty String
        String primeNumbersFound = "";

        //Start loop 1 to maxCheck
        for (i = 4; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbersFound);
    }

    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}
