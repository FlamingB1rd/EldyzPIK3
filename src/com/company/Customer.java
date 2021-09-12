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
public class Customer {
    private long customerNumber;

    public void sendTicket (String message, TicketHandler ticketHandler) {
        Ticket ticket = new Ticket(message);
        ticketHandler.getInbox().add(ticket);
    }
}
/* Customer си има само customerNumber и съответно може да изпраща тикети. В случея в самия тикет създаваме
тикета, като му задаваме съобщение, а конструктора на тикет сме му задали да ни задава дефаултни стойности на
неговите fieldove status и isResolved (съответно 'Open' и false). На този метод ще трябва да подадем и инстанция
на ticketHandler, която ще ни действа като инстанция за запазване на информация. За да може после да работим върху
този тикет и множество други който други customers са пращали ни трябва отделен клас, който хем ще пази тикетите,
хем ще може да го повикваме в други класове за да си работим пак върху тях. В случея го взимаме за да вкараме новия
тикет вътре.
 */
