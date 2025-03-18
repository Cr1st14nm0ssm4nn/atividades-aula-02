package Aula2.lista1.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/curso")
    public Map<String, Object> infoCurso() {
        Map<String, Object> curso = new HashMap<>();
        curso.put("Id", 1);
        curso.put("Name", "Engenharia de Software");
        curso.put("Description", "Melhor Curso");

        return curso;
    }


    @GetMapping("/localizacao")
    public Map<String, String> getLocalizacaoServidor() {
        Map<String, String> localizacao = new HashMap<>();

        Locale locale = Locale.getDefault();
        ZoneId zoneId = ZoneId.systemDefault();

        localizacao.put("Idioma", locale.getLanguage());
        localizacao.put("País", locale.getCountry());
        localizacao.put("Fuso Horário", zoneId.toString());

        return localizacao;
    }
    @GetMapping("/hora")
    public Map<String, String> getHoraServidor() {
        Map<String, String> resposta = new HashMap<>();
        LocalDateTime horaAtual = LocalDateTime.now();
        ZoneId fusoHorario = ZoneId.systemDefault();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        resposta.put("Hora do Servidor", horaAtual.format(formatter));
        resposta.put("Fuso Horário", fusoHorario.toString());

        return resposta;
    }
}

