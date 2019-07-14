import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Avatar {

    public static void main(String[] args) {
        Movie avatar = new Movie("아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy(Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59))
                )
        );

        // 월요일 11시 20분 상영
        System.out.println(
                avatar.calculateMovieFee(
                        new Screening(avatar, 3, LocalDateTime.of(2019, 7, 15, 11, 20, 00))
                )
        );

        // 첫번째 상영
        System.out.println(
                avatar.calculateMovieFee(
                        new Screening(avatar, 1, LocalDateTime.of(2019, 7, 15, 11, 20, 00))
                )
        );

        // 할인 없음
        System.out.println(
                avatar.calculateMovieFee(
                        new Screening(avatar, 3, LocalDateTime.of(2019, 7, 14, 17, 00, 00))
                )
        );

    }

}
