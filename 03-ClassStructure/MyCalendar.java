public class MyCalendar {
    static int year;
    static int month;
    static int day;
    
    static String myDate() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    static int days() {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }
        
        int daysPassed = 0;

        for (int i = 1; i < month; i++) {
            daysPassed += daysInMonth[i];
        }
        
        daysPassed += day;

        return daysPassed;
    }
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static String MonthName(int a) {
        switch (a) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "balls";
        }
    }

    public static void main(String[] args) {
        year = 2024;
        month = 10;
        day = 23;

        System.out.println("Date: " + myDate());
        System.out.println("Days from the beginning of year: " + days());
        System.out.println("Month name: " + MonthName(month));
    }
}
