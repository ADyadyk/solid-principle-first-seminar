package homework;

public class Persister implements Saveable{
    @Override
    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}
