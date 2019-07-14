import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Titanic {

    public static void main(String[] args) {
        Movie titanic = new Movie("타이타닉",
                Duration.ofHours(3),
                Money.wons(11000),
                new PercentDiscountPolicy(0.1,
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
                        new SequenceCondition(2),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(13, 59))
                )
        );

        // 2번째 영화
        System.out.println(
                titanic.calculateMovieFee(
                        new Screening(titanic, 2, LocalDateTime.of(2018, 10, 11, 10, 0, 0))
                )
        );

        // 목요일 12시 영화
        System.out.println(
                titanic.calculateMovieFee(
                        new Screening(titanic, 4, LocalDateTime.of(2019, 7, 4, 12, 0, 0))
                )
        );

        // 할인 없음
        System.out.println(
                titanic.calculateMovieFee(
                        new Screening(titanic, 10, LocalDateTime.of(2019, 7, 5, 23, 0, 0))
                )
        );

    }


}
