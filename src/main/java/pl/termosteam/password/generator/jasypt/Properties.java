package pl.termosteam.password.generator.jasypt;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class Properties {
    @Value("${jasypt.algorithm}")
    private String algorithm;
}
