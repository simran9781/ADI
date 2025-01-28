public class HighestALtitude {
    public int largestAltitude(int[] gain) {
        int prefixsum=0;
        int max =0;
        for(int i=0;i<gain.length;i++)
        {
            prefixsum+=gain[i];
            max = Math.max(prefixsum,max);
        }

        return max;
    }
}
