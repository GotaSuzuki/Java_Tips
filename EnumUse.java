import java.util.Scanner;

public class EnumUse {
  enum Week {
    日曜日, 月曜日, 火曜日, 水曜日, 木曜日, 金曜日, 土曜日
  }

  enum Time {
    午前, 午後, 夜間
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("曜日を入力(0=日、1=月、2=火、3=水、4=木、5=金、6=土):");
    int weekday = scanner.nextInt();
    Week week = Week.values()[weekday];

    System.out.print("時間帯を入力(0=午前、1=午後、2=夜間):");
    int timeSchedule = scanner.nextInt();
    Time time = Time.values()[timeSchedule];

    if (week == Week.日曜日 ||
        (week == Week.火曜日 && time == Time.午前) ||
        (week == Week.水曜日 && time == Time.夜間) ||
        (week == Week.金曜日 && time == Time.午前) ||
        (week == Week.土曜日 && (time == Time.午後 || time == Time.夜間))) {
      System.out.println("休診日");
    } else {
      System.out.println("開院中です");
    }
  }
}
