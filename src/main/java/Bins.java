import java.lang.reflect.Array;

public class Bins
{
    private int[] bins;
    int max;
    int min;

    public Bins(int min, int max)
    {
        bins = new int[max - min + 1];
        this.max = max;
        this.min = min;
    }

    public void incrementBin(int binNum)
    {
        bins[binNum - min] += 1;
    }

    public int getBinTotal(int binNum)
    {
        return bins[binNum - min];
    }
}


