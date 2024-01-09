public class Weather {

    // Find after how many days the temperature is hitting high ?
    // for ex: 1st day temp is 58 it has to wait for two more days to hit next highest temp
    // input: [58, 56, 61, 55, 57, 44, 40, 35, 46]
    // output: [2, 1, 0, 1, 0, 3, 2, 1, 0 ]

    public static void main(String[] args) {
        findHottestNextDay(new int[] {58, 56, 61, 55, 57, 44, 40, 35, 46});
    }

    private static void findHottestNextDay(int[] daysWeather) {
        for (int i = 0; i < daysWeather.length; i++) {
            for (int j = i; j < daysWeather.length ; j++) {
                if (daysWeather[j] > daysWeather[i]) {
                    System.out.print(j - i);
                    break;
                }
            }
        }
    }


}

