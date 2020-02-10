package lv.accenture.bootcamp.io.model;

import java.text.SimpleDateFormat;

public class Lection {

    private Long date;

    private Boolean presence;

    private Byte mark;
    private SimpleDateFormat formatter;

    public Lection(Long date, Boolean presence, Byte mark) {
        this.date = date;
        this.presence = presence;
        this.mark = mark;
    }

    public Long getDate() {
        return date;
    }

    public Boolean getPresence() {
        return presence;
    }

    public Byte getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "\t\tLection{" +
                "date=" + formatter.format(date) +
                ", presence=" + presence +
                ", mark=" + mark +
                "}\n";
    }

    public void setFormatter(SimpleDateFormat dateFormat) {
        this.formatter = dateFormat;
    }

    public SimpleDateFormat getFormatter() {
        return formatter;
    }
}
