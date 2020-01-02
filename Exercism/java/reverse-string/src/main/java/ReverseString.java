class ReverseString {

    String reverse(String inputString) {
        StringBuilder oS = new StringBuilder();
        for( int i = 0; i < inputString.length(); i++)
            oS.append(inputString.charAt(inputString.length()-i-1));
        System.out.println(oS);
        String outputString = oS.toString();
        return outputString;
    }
  
}