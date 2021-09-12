package com.company;

/* Service метода ппц няма нужда да го пишеш. Просто е добра практика, на която не ни учат в училище.
Майн метода ти трябва да е празен. Ако забележиш в Main metoda просто викам run метода на Сервис класа.
За самия изпит тая логика за пестене на време може просто да я пишеш в Main. Тука си популираме всички класове.
Създаваме единствената инстанция на ticketHandler, която ще ни трябва(тей като той работи като склад.) и си създаваш
колкото си искаш customers i support. Следователно след това си тестваш pipelina или модела ти на работа.
Тука аз тествах цялата логика като първо създадох клиент и съпорт. Клиента изпрати тикет, съпорт1 го пое от
inboxa на ticketHandler и след това го резолвна, поставяйки го в done на ticketHandler.
 */
public class Service {
    private final TicketHandler ticketHandler = new TicketHandler();
    Support support1 = new Support("Ivan");
    Support support2 = new Support("Eldyz");

    Customer customer1 = new Customer(1234);
    Customer customer2 = new Customer(4567);

    public void run() {
        customer1.sendTicket("Testing", ticketHandler);
        System.out.println(ticketHandler.getInbox().get(0));

        support1.assignTicketToSelf(ticketHandler.getInbox().get(0));
        System.out.println(ticketHandler.getInbox().get(0));

        support1.resolveTicket("Closed", ticketHandler);
        System.out.println(ticketHandler.getDone().get(0));
    }
}
