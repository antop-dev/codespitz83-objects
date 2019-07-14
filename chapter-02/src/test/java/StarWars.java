import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class StarWars {

    public static void main(String[] args) {
        Movie startWars = new Movie("스타워즈",
                Duration.ofMinutes(210),
                Money.wons(10000),
                new NoneDiscountPolicy()
        );

        // 할인 없음
        System.out.println(
                startWars.calculateMovieFee(
                        new Screening(startWars, 2, LocalDateTime.of(2018, 10, 11, 10, 0, 0))
                )
        );

    }


}
