public class DecoratorTest {

    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifierDecorator(notifier);

        Notifier slackAndSmsNotifier =
                new SlackNotifierDecorator(smsNotifier);

        slackAndSmsNotifier.send("Server is running successfully.");
    }
}
