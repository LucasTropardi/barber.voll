package barber.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foi")
public class FoiController {
    @GetMapping
    public String foiMesmo() {
        return "Foi sim!";
    }
}
