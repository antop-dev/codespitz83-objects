/**
 * 판매원
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // 매표소의 존재를 숨겼다. (캡슐화)
    // 판매원이 매표소가 아니라 은행에 돈을 보관하도록 만들고 싶다면 TicketSeller만 변경하면 된다.
    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }

}
