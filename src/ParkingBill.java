/**source: https://app.codility.com/programmers/trainings/5/parking_bill/
 * level easy
 */
public class ParkingBill {
    public int solution(String E, String L) {
        final int entranceFee = 2;
        final int firstCost = 3;
        final int nextCost = 4;

        String[] entranceTime = E.split(":");
        String[] exitTime = L.split((":"));

        int entranceHour = Integer.parseInt(entranceTime[0]);
        int entranceMinute = Integer.parseInt(entranceTime[1]);
        int exitHour = Integer.parseInt(exitTime[0]);
        int exitMinute = Integer.parseInt(exitTime[1]);

        int durationMinutes = (exitHour - entranceHour) * 60 + exitMinute - entranceMinute;
        int durationHours = durationMinutes / 60;
        if (durationHours * 60 != durationMinutes) {
            durationHours += 1;
        }

        int afterFirstHourFee = durationHours - 1 > 0 ? (durationHours - 1) * nextCost : 0;

        return entranceFee + firstCost + afterFirstHourFee;
    }
}
