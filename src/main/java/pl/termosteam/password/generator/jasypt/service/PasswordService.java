package pl.termosteam.password.generator.jasypt.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.termosteam.password.generator.jasypt.dto.PasswordResponseDto;
import pl.termosteam.password.generator.jasypt.util.PasswordGenerator;

@Service
public class PasswordService {
    private final PasswordGenerator passwordGenerator;

    public PasswordService(
            @Qualifier("JasyptGeneratorImpl") PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;
    }

    public PasswordResponseDto encrypt(String secret, String text) {
        return new PasswordResponseDto(secret, passwordGenerator.encryptedPassword(secret, text), text);
    }

    public PasswordResponseDto decrypt(String secret, String text) {
        return new PasswordResponseDto(secret, text, passwordGenerator.decryptedPassword(secret, text));
    }

}
