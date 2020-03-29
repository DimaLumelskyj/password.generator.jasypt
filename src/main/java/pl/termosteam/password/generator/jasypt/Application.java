package pl.termosteam.password.generator.jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		System.out.println(decryptPassword("O8PUiDHzgAKmzQpKap+zxqnltgfMhxpI373/nnhghxjLuMJHyOuV8ya9tG9QM0TX", "@x8HcZsUlfdE"));
		SpringApplication.run(Application.class, args);
	}

	static String decryptPassword(String hashedPasswords, String secret) {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword(secret);
		encryptor.setAlgorithm("PBEWithHMACSHA512AndAES_256");
		encryptor.setIvGenerator(new RandomIvGenerator());
		return encryptor.decrypt(hashedPasswords);
	}
}
