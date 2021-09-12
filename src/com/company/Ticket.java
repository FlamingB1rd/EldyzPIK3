package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* Lombok - @Data - поема Getter/Setters/Hashcode/Equals metodite; @AllArgsConstructor - поема конструктор с
всичките променливи (fields), който имаме в класа; @NoArgsConstructor - съответно дефаулт конструктор без
променливите. :Д Ако нямаш някакво допълнително условие в задачата за поемане на някаква валидация в
setterite може да изплозваш това - едно че ще си спестиш време от писане на глупости и друго, че
има голям шанс да ги впечатлиш. Поне на работа се впечатляват ако го знаеш. ;) Само уточни че се нарича 'Lombok'*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private String message;
    private boolean isResolved;
    private String status;

    public Ticket(String message) {
        this.message = message;
        isResolved = false;
        status = "Open";
    }
}
/* Ticket е прост клас който описва обекта тикет. Задаваме му ккакво съобщение ще съдържа. Какъв му е съответния статут
(по-този начи може лесно да се сменя после) и дали е разрешен или не. В случея ovveridvam Ломбока с мой собствен
конструктор защото искам да използвам конструктор в който подавам само message вмест всичко или нищо. Тва не е нужно
ппц, защото в конструктора мога просто да напиша после -> new Ticket(message, false, "Open") и ще имам същите резултати
при създаване на нов тикет заради Ломбока, но ако те карат да пишеш после много инстанции ще спечелиш време по този
начин, тей като ще пишеш само new Ticket(message).
 */
