package lv.accenture.bootcamp.spring;

import org.springframework.stereotype.Component;

@Component("EmailNotifier")
public class EmailNotifier implements NotificationChannel {
    @Override
    public void notifyUser(User user) {
        System.out.println(user.getFullName() + " notifed By email" );
    }
}
