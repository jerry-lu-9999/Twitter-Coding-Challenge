// ADD IMPORTS HERE

public class Puzzle2 {

    /**
     * Given the timestamp, convert to the time display for the given timezone.
     *
     * @param timestamp epoch time in milliseconds
     * @param timezone  Timezone to use for display
     * @return Display string for the time in the proper timezone
     */
    public static String convertToDisplayTime(Long timestamp, String timezone) {
	// IMPLEMENT CODE HERE
	return null;
    }

    public static void main(String[] args)throws Exception {

        System.out.println(convertToDisplayTime(1383858000000L,"America/New_York"));
        System.out.println(convertToDisplayTime(1383840000000L,"Europe/London"));
        System.out.println(convertToDisplayTime(1383858000000L,"America/Bogota"));
        System.out.println(convertToDisplayTime(1383807600000L,"Asia/Tokyo"));
        System.out.println(convertToDisplayTime(1383868800000L,"America/Los_Angeles"));
        System.out.println(convertToDisplayTime(1383825600000L,"Asia/Dubai"));
        System.out.println(convertToDisplayTime(1383811200000L,"Asia/Hong_Kong"));
    }
}
