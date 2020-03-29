package pl.termosteam.password.generator.jasypt.util;

public interface PasswordGenerator {
    String encryptedPassword(String secret, String decryptedPassword);

    String decryptedPassword(String secret, String password);
}
