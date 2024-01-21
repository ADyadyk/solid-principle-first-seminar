package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");

        Persister persister = new Persister();
        Reporter reporter = new Reporter();

        reporter.report(user);
        persister.save(user);

        // Вторая проверка:
        System.out.println();
        User tom = new User("Tom");
        reporter.report(tom);
        persister.save(tom);
    }
}
/*
* В классе User нарушен "Принцип единственной ответственности"
* Было исправлено добавлением класса Reporter, который реализует интерфейс Reportable. В него
* был перенесен метод report(). Метод save() был удален из класса User так как он реализован в классе Persister.
* Так же в класс Persister был закрыт для расширения. То есть нарушен "Принцип открытости-закрытости"
* Было исправлено имплементацией интерфейса Saveable.
* Также в классе Persister было убрано поле User, теперь user непосредственно передаётся в метод. Аналогично
* всё выполнено в классе Reporter.
* */