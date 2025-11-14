public class Oven
{
    private int maxTemp;
    private int currentTemp;

    public Oven (int in_maxTemp, int in_currentTemp)
    {
       maxTemp = in_maxTemp;
       currentTemp = in_currentTemp;
    }

    public boolean isOn ()
    {
        if (currentTemp > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void turnOff ()
    {
        if (currentTemp > 0)
        {
            currentTemp = 0;
        }
    }
   
   public void preheat (int temp)
   {
    if ()
   }
}
