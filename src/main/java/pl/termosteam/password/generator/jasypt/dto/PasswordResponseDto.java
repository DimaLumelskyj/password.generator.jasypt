package pl.termosteam.password.generator.jasypt.dto;

import lombok.Data;

@Data
public class PasswordResponseDto {
    private final String secret;
    private final String encrypted;
    private final String decrypted;

    @Override
    public String toString() {
        return "<table style=\"margin-left: auto; margin-right: auto;\" border=\"1\">" +
                "<tbody>" +
                "<tr>" +
                "<td>Secret password</td>" +
                "<td>" + secret + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>Decrypted text</td>" +
                "<td>" + decrypted + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>Encrypted text</td>" +
                "<td>" + encrypted + "</td>" +
                "</tr>" +
                "</tbody>" +
                "</table>";
    }
}
