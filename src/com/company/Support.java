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
public class Support {
    private String username;
    private Ticket assignedTicket;

    public Support(String username) {
        this.username = username;
        assignedTicket = null;
    }

    public void assignTicketToSelf(Ticket ticket) {
        this.assignedTicket = ticket;
        ticket.setStatus("Taken by " + this.username);
    }

    public void resolveTicket(String statusMessage, TicketHandler ticketHandler) {
        assignedTicket.setResolved(true);
        assignedTicket.setStatus(statusMessage);
        ticketHandler.getInbox().remove(assignedTicket);
        ticketHandler.getDone().add(assignedTicket);
    }
}
/* Supporta са като Customers, имат username и съм им добавил още едно поле(field) assignedTicket -> Така по лесно
 ще може да повикваме точно този тикет после. Той има 2 метода. Първо ще вземе един тикет от inboxa на ticketHandler
 и ще си го асигне на себе си, променяйки и статута на тикета. (assignTicketToSelf) 2я метод е за симулацията
 на действието на 3то парти или "разрешаването на тикета" (resolveTicket). Там просто си играем с assignatiq Ticket.
 Променяме му статуа на true, добавил съм в сатута да се пише custom съобщение но това си е излишно по услови и
 съответно като сме готови -> махаме го от inboxa на ticketHandler и го слагаме в done boxa на ticketHandler.
 */