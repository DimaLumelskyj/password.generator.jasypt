package pl.termosteam.password.generator.jasypt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.termosteam.password.generator.jasypt.service.PasswordService;

@RestController
@RequiredArgsConstructor
public class PasswordController {
    private final PasswordService passwordService;

    //http://localhost:8080/encrypt?secret=Dfgdt2233rfsf;text=skjhskfjsofnffkskf_wrewvv$%^

    @GetMapping("text/encrypt")
    @ResponseBody
    public String encryptController(@RequestParam(value = "secret") String secret, @RequestParam(value = "text") String text) {
        return passwordService.encrypt(secret, text).toString();
    }

    @GetMapping("text/decrypt")
    @ResponseBody
    public String decryptController(@RequestParam(value = "secret") String secret, @RequestParam(value = "text") String text) {
        return passwordService.decrypt(secret, text).toString();
    }

}
