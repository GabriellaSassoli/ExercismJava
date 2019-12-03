import java.time.LocalDate;
import java.time.LocalDateTime;



class Gigasecond {

    LocalDate localDate;
    LocalDateTime localDateTime;
    LocalDateTime dateTime;

    Gigasecond(LocalDate moment) {
       this.localDate = moment;

    }

    Gigasecond(LocalDateTime moment) {
       this.localDateTime = moment;
    }

    LocalDateTime getDateTime() {

        return this.localDateTime;
    }

}
