package barber.voll.api.controller;

import barber.voll.api.barbeiro.DadosCadastroBarbeiro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/barbeiros")
public class BarbeiroController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroBarbeiro dados) {
        System.out.println(dados);
    }
}
