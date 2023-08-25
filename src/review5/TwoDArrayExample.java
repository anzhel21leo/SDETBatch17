package review5;

public class TwoDArrayExample {
    public static void main(String[] args) {
        String[][] countries= {
                {"Canada", "USA"},
                {"Ecuador", "Brazil", "Chile", "Argentina"},
                {"Romania", "France", "Italy"},
        };
        System.out.println(countries.length); //3-number of 1D arrays

        for(String[] countryArray:countries){ //outer loop iterates over 1D array
            for(String country:countryArray){ //inner loop iterates over each element INSIDE THAT ARRAY
                System.out.println(country);
            }
        }
    }
}
