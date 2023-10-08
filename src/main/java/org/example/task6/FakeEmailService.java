package org.example.task6;

import org.example.task5.EmailService;

public class FakeEmailService extends EmailService {
    private final List<EmailMessage> sentMessages = new ArrayList<>();

    @Override
    public void sendEmail(String to, String subject, String body) {
// Вместо реальной отправки сохраняем сообщение
        EmailMessage emailMessage = new EmailMessage(to, subject, body);
        sentMessages.add(emailMessage);
    }

    public List<EmailMessage> getSentMessages() {
        return sentMessages;
    }
}
