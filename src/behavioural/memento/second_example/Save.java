package behavioural.memento.second_example;

import java.util.Date;

public class Save {
    //final т.к. нам нужен только доступ для чтения, мы не собираемся изменять значения
    private final String version;
    private final Date date;

    public Save(String version, Date date) {
        this.version = version;
        this.date = date;
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
