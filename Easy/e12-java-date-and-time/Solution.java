// https://www.hackerrank.com/challenges/java-date-and-time/

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        String res = "";
        if (dayOfWeek == Calendar.MONDAY) {
            res = "MONDAY";
        } else if (dayOfWeek == Calendar.TUESDAY) {
            res = "TUESDAY";
        } else if (dayOfWeek == Calendar.WEDNESDAY) {
            res = "WEDNESDAY";
        } else if (dayOfWeek == Calendar.THURSDAY) {
            res = "THURSDAY";
        } else if (dayOfWeek == Calendar.FRIDAY) {
            res = "FRIDAY";
        } else if (dayOfWeek == Calendar.SATURDAY) {
            res = "SATURDAY";
        } else if (dayOfWeek == Calendar.SUNDAY) {
            res = "SUNDAY";
        }

        return res;
    }

}

