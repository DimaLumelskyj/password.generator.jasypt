package pl.termosteam.password.generator.jasypt.util;

import org.springframework.stereotype.Component;

@Component("JasyptGeneratorImpl")
public class JasyptGeneratorImpl implements PasswordGenerator {
    private final JasyptEncryptor jasyptEncryptor;

    public JasyptGeneratorImpl(JasyptEncryptor jasyptEncryptor) {
        this.jasyptEncryptor = jasyptEncryptor;
    }

    @Override
    public String encryptedPassword(String secret, String textToEncryption) {
        return jasyptEncryptor.encrypt(secret, textToEncryption);
    }

    @Override
    public String decryptedPassword(String secret, String textToDecryption) {
        return jasyptEncryptor.decryptPassword(textToDecryption, secret);
    }
}
