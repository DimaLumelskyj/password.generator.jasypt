package pl.termosteam.password.generator.jasypt.util;

import lombok.RequiredArgsConstructor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;
import org.springframework.stereotype.Component;
import pl.termosteam.password.generator.jasypt.Properties;


@Component
@RequiredArgsConstructor
public class JasyptEncryptor {
    private final Properties properties;

    public String encrypt(String secret, String text) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setAlgorithm(properties.getAlgorithm());
        encryptor.setIvGenerator(new RandomIvGenerator());
        encryptor.setPassword(secret);
        return encryptor.encrypt(text);
    }

    public String decrypt(String secret, String text) {

        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(secret);
        encryptor.setAlgorithm("PBEWithHMACSHA512AndAES_256");
        encryptor.setIvGenerator(new RandomIvGenerator());
        return encryptor.decrypt(text);
    }

    public String decryptPassword(String hashedPasswords, String secret) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(secret);
        encryptor.setAlgorithm("PBEWithHMACSHA512AndAES_256");
        encryptor.setIvGenerator(new RandomIvGenerator());
        return encryptor.decrypt(hashedPasswords);
    }
}
