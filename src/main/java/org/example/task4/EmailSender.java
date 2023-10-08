package org.example.task4;

import org.example.task2.Email;

public class EmailSender {
    private final EmailService mockEmailService;
    public EmailSender(EmailService mockEmailService) {
        this.mockEmailService = mockEmailService;
    }

    public void sendEmail(Email email) {
// Здесь происходит отправка электронного письма
    }

    public void sendWelcomeEmail(String email) {
        String subject = "Добро пожаловать!";
        String body = "Добро пожаловать в наше приложение!";
        mockEmailService.sendEmail(email,subject,body);

    }
}
