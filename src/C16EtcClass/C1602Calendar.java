package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C1602Calendar {

    public static void main(String[] args) {
////    날짜 관련 클래스의 종류 : Calendar(java,util),java.time 패키지 안에 있는 Local~ 클래스.
//        Calendar time = Calendar.getInstance();
//        System.out.println(time.getTime());
//
////        특정한 숫자값은 get함수의 input값으로 주어 원하는 날짜 정보를 출력할 수 있게해준다.
//        System.out.println(time.get(Calendar.YEAR));
//        System.out.println(time.get(Calendar.MONTH)+1);
//        System.out.println(time.get(Calendar.DAY_OF_MONTH));
//        System.out.println(time.get(Calendar.DAY_OF_WEEK)); // 요일 금 ->6
//        System.out.println(time.get(Calendar.HOUR_OF_DAY)); //24시
//        System.out.println(time.get(Calendar.MINUTE));
//        System.out.println(time.get(Calendar.SECOND));

////        java.time패키지 : Local~ 클래스
//        LocalTime present_time = LocalTime.now();
//        System.out.println(present_time);
//
//        LocalDate present_date = LocalDate.now();
//        System.out.println(present_date);
//
//        LocalDateTime this_time = LocalDateTime.now();
//        System.out.println(this_time);

//        임의로 특정 시간을 만들어 내고 싶을 때, of 매서드 사용
        LocalDate birthDay = LocalDate.of(1980, 02,19);
//        일반 내장 매서드
        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getMonth());
        System.out.println(birthDay.getDayOfMonth());
        LocalTime birthTime = LocalTime.of(15,02,19);

        LocalDateTime birthDayTime = LocalDateTime.of(birthDay, birthTime);
//        크로노필드 enum 타입 사용 : 매개변수로 크로노필드를 받아 프로그램의 우연성 향상
        System.out.println(birthDayTime.get(ChronoField.YEAR));
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR));
//        0 : 오전, 1: 오후
        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY));
//        현재 시간은 오전/오후 입니다.
        String str = LocalTime.now().get(ChronoField.AMPM_OF_DAY) == 0 ? "오전" : "오후";
        System.out.println("현재 시간은 : " + str);

    }
}
