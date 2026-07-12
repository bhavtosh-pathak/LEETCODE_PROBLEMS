class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] arr=startTime.split(":");
        String[] brr=endTime.split(":");
        int start=Integer.parseInt(arr[0])*3600+Integer.parseInt(arr[1])*60+Integer.parseInt(arr[2]);
        int end=Integer.parseInt(brr[0])*3600+Integer.parseInt(brr[1])*60+Integer.parseInt(brr[2]);
        int diff=Math.abs(start-end);
        return diff;
    }
}