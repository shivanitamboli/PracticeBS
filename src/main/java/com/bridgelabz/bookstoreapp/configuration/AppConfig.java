package com.bridgelabz.bookstoreapp.configuration;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.mail.MailException;
        import org.springframework.mail.SimpleMailMessage;
        import org.springframework.mail.javamail.JavaMailSender;
        import org.springframework.mail.javamail.MimeMessagePreparator;
        import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
        import org.springframework.security.crypto.password.PasswordEncoder;

        import javax.mail.internet.MimeMessage;
        import java.io.InputStream;
@Configuration
public class AppConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JavaMailSender javamailsender() {
        return new JavaMailSender() {

            @Override
            public void send(SimpleMailMessage simpleMessage) throws MailException {
                // TODO Auto-generated method stub

            }

            @Override
            public void send(SimpleMailMessage... simpleMessages) throws MailException {
                // TODO Auto-generated method stub

            }

            @Override
            public MimeMessage createMimeMessage() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public MimeMessage createMimeMessage(InputStream contentStream) throws MailException {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public void send(MimeMessage mimeMessage) throws MailException {
                // TODO Auto-generated method stub

            }

            @Override
            public void send(MimeMessage... mimeMessages) throws MailException {
                // TODO Auto-generated method stub

            }

            @Override
            public void send(MimeMessagePreparator mimeMessagePreparator) throws MailException {
                // TODO Auto-generated method stub

            }

            @Override
            public void send(MimeMessagePreparator... mimeMessagePreparators) throws MailException {
                // TODO Auto-generated method stub

            }
        };
    }
}