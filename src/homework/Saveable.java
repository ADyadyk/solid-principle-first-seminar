package homework;

public interface Saveable <T extends User>{
    void save(T user);
}
