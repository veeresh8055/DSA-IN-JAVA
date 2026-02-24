public class date {
    public static void main(String[] args) {

        int day = 2;
        int month = 12;
        int year = 1000;

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31 && year >= 1000 && year <= 9999) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date ");
                }

                break;
            case 2:
                if (day >= 1 && day <= 29 && year >= 1000 && year <= 9999) {
                    if (year % 4 == 0) {
                        if (day == 29) {

                            System.out.println("Valid");
                        } else {
                            System.out.println("Invalid");
                        }

                    } else {

                        System.out.println("valid day ");
                    }
                } else {
                    System.out.println("Invalid date ");
                }

                break;

            case 3:
                if (day >= 1 && day <= 31 && year >= 1000 && year <= 9999) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date ");
                }

                break;
            case 4:
                if (day >= 1 && day <= 30 && year >= 1000 && year <= 9999) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date ");
                }
                break;
            case 5:
                if (day >= 1 && day <= 31 && year >= 1000 && year <= 9999) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date ");
                }
                break;

            case 6:
                if (day >= 1 && day <= 30 && year >= 1000 && year <= 9999) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date ");
                }
                break;
            case 7:
                if (day >= 1 && day <= 31 && year >= 1000 && year <= 9999) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date ");
                }
                break;
            case 8:
                if (day >= 1 && day <= 31 && year >= 1000 && year <= 9999) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date ");
                }
                break;
            case 9:
                if (day >= 1 && day <= 30 && year >= 1000 && year <= 9999) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date ");
                }
                break;
            case 10:
                if (day >= 1 && day <= 31 && year >= 1000 && year <= 9999) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date ");
                }
                break;
            case 11:
                if (day >= 1 && day <= 30 && year >= 1000 && year <= 9999) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date ");
                }
                break;
            case 12:
                if (day >= 1 && day <= 31 && year >= 1000 && year <= 9999) {
                    System.out.println("Valid date");
                } else {
                    System.out.println("Invalid date ");
                }
                break;

            default:
                System.out.println("Invalid date ");
        }
    }
}
