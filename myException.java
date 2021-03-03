package Person;

public class myException  extends Exception{
    @Override
    public String getMessage(){
        return " Попытка записи за пределы массива";
    }

}

