class IsogramChecker {

    boolean isIsogram(String phrase) {
         String newPhrase = phrase.toLowerCase();
        System.out.println(newPhrase);
        char[] chars = newPhrase.toCharArray();
        int var = 0;
        boolean result = false;

        for(int i = 0; i < phrase.length();  i++){

            for(int j = i + 1; j< phrase.length();j++) {

                if (chars[i] == chars[j] && chars[i] != '-' && chars[i] != ' ') {
                    System.out.print("Le due lettere " + chars[i] +  " "+ chars[j] +" sono uguali\n");
                    var++;
                };
            }
        }
        if (var==0) result= true;
        return result;
    }

}
