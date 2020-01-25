package lv.accenture.bootcamp.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DateValidator {

    enum Month {

        JANUARY {
            @Override
            public int getDays(int year) {
                return 31;
            }

            @Override
            public String getName() {
                return "January";
            }
        },

        FEBRUARY {
            @Override
            public int getDays(int year) {
                return year % 4 == 0 ? 29 : 28;
            }

            @Override
            public String getName() {
                return "February";
            }
        },

        MARCH {
            @Override
            public int getDays(int year) {
                return 31;
            }

            @Override
            public String getName() {
                return "March";
            }
        },

        APRIL {
            @Override
            public int getDays(int year) {
                return 30;
            }

            @Override
            public String getName() {
                return "April";
            }
        },

        MAY {
            @Override
            public int getDays(int year) {
                return 31;
            }

            @Override
            public String getName() {
                return "May";
            }
        },

        JUNE {
            @Override
            public int getDays(int year) {
                return 30;
            }

            @Override
            public String getName() {
                return "June";
            }
        },

        JULY {
            @Override
            public int getDays(int year) {
                return 31;
            }

            @Override
            public String getName() {
                return "July";
            }
        },

        AUGUST {
            @Override
            public int getDays(int year) {
                return 31;
            }

            @Override
            public String getName() {
                return "August";
            }
        },

        SEPTEMBER {
            @Override
            public int getDays(int year) {
                return 30;
            }

            @Override
            public String getName() {
                return "September";
            }
        },

        OCTOBER {
            @Override
            public int getDays(int year) {
                return 31;
            }

            @Override
            public String getName() {
                return "October";
            }
        },

        NOVEMBER {
            @Override
            public int getDays(int year) {
                return 30;
            }

            @Override
            public String getName() {
                return "November";
            }
        },

        DECEMBER {
            @Override
            public int getDays(int year) {
                return 31;
            }

            @Override
            public String getName() {
                return "December";
            }
        };

        public abstract int getDays(int year);
        public abstract String getName();
    }


    public static void main(String[] args) {

        Map<Integer, Month> monthMapping = new HashMap<>();
        monthMapping.put(1, Month.JANUARY);
        monthMapping.put(2, Month.FEBRUARY);
        monthMapping.put(3, Month.MARCH);
        monthMapping.put(4, Month.APRIL);
        monthMapping.put(5, Month.MAY);
        monthMapping.put(6, Month.JUNE);
        monthMapping.put(7, Month.JULY);
        monthMapping.put(8, Month.AUGUST);
        monthMapping.put(9, Month.SEPTEMBER);
        monthMapping.put(10, Month.OCTOBER);
        monthMapping.put(11, Month.NOVEMBER);
        monthMapping.put(12, Month.DECEMBER);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date: ");
        int date = scanner.nextInt();

        System.out.println("Enter month: ");
        int month = scanner.nextInt();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();



        if (date > 0 && month > 0) {

            Month monthEnum = monthMapping.get(month);

            int maxDays = monthEnum.getDays(year);
            String monthName = monthEnum.getName();
            boolean invalidInput = false;

            switch (month) {
                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "February";
                    maxDays = (year % 4 == 0) ? 29 : 28;
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    maxDays = 30;
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    maxDays = 30;
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    maxDays = 30;
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    maxDays = 30;
                    break;
                case 12:
                    monthName = "December";
                    break;
                default:
                    invalidInput = true;
            }

            if (!invalidInput && date <= maxDays) {

                if (year < 0) {
                    year = year * -1;
                    System.out.println(date + ". " + monthName + ", " + year + " BC");
                } else {
                    System.out.println(date + ". " + monthName + ", " + year);
                }

            } else {
                System.out.println("Invalid request");
            }
        } else {
            System.out.println("Invalid request");
        }


    }

}