package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/* Lombok - @Data - поема Getter/Setters/Hashcode/Equals metodite; @AllArgsConstructor - поема конструктор с
всичките променливи (fields), който имаме в класа; @NoArgsConstructor - съответно дефаулт конструктор без
променливите. :Д Ако нямаш някакво допълнително условие в задачата за поемане на някаква валидация в
setterite може да изплозваш това - едно че ще си спестиш време от писане на глупости и друго, че
има голям шанс да ги впечатлиш. Поне на работа се впечатляват ако го знаеш. ;) Само уточни че се нарича 'Lombok'*/
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TicketHandler {
    private List<Ticket> inbox = new ArrayList<>();
    private List<Ticket> done = new ArrayList<>();
}
/*TicketHandler работи като Repository (хранилище за съдържание на тикетите, съответно в две категории, да може ако
имаме функция за преглеждане на свободните тикети в inbox да ни показва само тях и съответно само тези в done
с готов статут.) Съответно като писах класа си мислех че ще има повече методи от 0 хД, затова не 'handleva' много
няма да е зле да се прекръсти и да не се ползва тази конвенция на изпита. */