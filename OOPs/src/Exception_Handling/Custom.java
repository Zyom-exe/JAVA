package Exception_Handling;
class ChamaroKaException extends Exception
{
    ChamaroKaException(String message)
    {
        super(message);
    }
}
class Voting
{
    static void checkAge(int age) throws ChamaroKaException
    {
        if(age < 18)
        {
            throw new ChamaroKaException("Not eligible for voting");
        }
        else
        {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            checkAge(16);
        }
        catch(ChamaroKaException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
