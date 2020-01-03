class Leap {

    boolean isLeapYear(int year) {
        //Boolean leapYear;

        Boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ? true : false;

     return leapYear;
    }

}
