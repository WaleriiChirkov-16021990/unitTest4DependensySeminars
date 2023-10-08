package org.example.task2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyZeroInteractions;

class EmailSenderTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSendEmailWithDummy() {
// Создаем фиктивный объект Email
        Email dummyEmail = mock(Email.class);

// Создаем экземпляр EmailSender
        EmailSender emailSender = new EmailSender();

// Вызываем метод sendEmail с фиктивным объектом Email
        emailSender.sendEmail(dummyEmail);

// Проверяем, что с фиктивным объектом Email не было взаимодействий
        verifyZeroInteractions(dummyEmail);
    }
}