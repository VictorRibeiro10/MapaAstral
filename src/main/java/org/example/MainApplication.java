package org.example;

import org.example.enums.AnoLunar;
import org.example.enums.Ascendente;
import org.example.enums.Signos;
import org.example.exceptions.SignoLunarNaoExisteException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.*;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Sistema Mapa Astral");
        System.out.println();


        LocalDateTime victor = LocalDateTime.of(1996, 8, 1, 21, 30);

        ZoneId localNascimentoVictor = ZoneId.of("America/Sao_Paulo");

        ZonedDateTime victorTudo = ZonedDateTime.of(victor, localNascimentoVictor);

        System.out.println("Idade: ");
        Period period = Period.between(victorTudo.toLocalDate(), LocalDate.now());
        System.out.println(period.getYears());

        System.out.println();

        System.out.println("Signo: ");
        System.out.println(Signos.getSigno(MonthDay.of(victorTudo.getMonth(), victorTudo.getDayOfMonth())));

        System.out.println();

        System.out.println("Ascendente: ");
        System.out.println(Ascendente.getAscendente(victorTudo.toLocalTime()));

        System.out.println();

        System.out.println("Signo Lunar: ");
        try {
            System.out.println(AnoLunar.getLunar(victorTudo));
        } catch (SignoLunarNaoExisteException exception) {
            System.out.println(exception.getLocalizedMessage());
        }

        System.out.println();

        System.out.println("Nasceu em ano bissesto: ");
        System.out.println(Year.isLeap(victorTudo.getYear()));

    }

    }
