class Hamming {
    private String leftStrand;
    private String rightstrand;
    private int difference;


    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightstrand = rightStrand;

        if(leftStrand.isBlank() && !rightStrand.isBlank()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if(rightStrand.isBlank() && !leftStrand.isBlank()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() throws IllegalArgumentException {

        for (int i = 0; i < this.rightstrand.length(); i++) {


                if (this.leftStrand.charAt(i) != this.rightstrand.charAt(i)) difference ++;

        }


            // If none of the above conditions is true,
            // it implies both the strings are equal

            return difference;

        }




}
