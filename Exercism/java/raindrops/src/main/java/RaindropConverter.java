class RaindropConverter {

    String convert(int number) {
        String str = "";

        if(number % 3 == 0) {
            str = str + "Pling";
        }
        if(number % 5 == 0) {
            str = str + "Plang";
        }
        if(number % 7 == 0) {
            str = str + "Plong";
        }
        if(str.length() == 0){
            str = str + Integer.toString(number);
        }
    return str;
    }

}
