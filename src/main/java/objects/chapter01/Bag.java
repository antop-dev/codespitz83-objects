package objects.chapter01;

/**
 * Bag 클래스는 초대장(ticket), 티켓(invitation), 현금(amount)을 인스턴스 변수로 포함한다.
 */
public class Bag {
    // 현금
    private Long amount;
    // 초대장
    private Invitation invitation;
    // 티켓
    private Ticket ticket;

    public Bag(Long amount) {
        this(amount, null);
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    /**
     * 초대장 소유 여부
     *
     * @return
     */
    private boolean hasInvitation() {
        return invitation != null;
    }

    /**
     * 티켓 소유 여부
     *
     * @return
     */
    public boolean hasTicket() {
        return ticket != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    /**
     * 현금 감소
     *
     * @param amount
     */
    private void minusAmount(Long amount) {
        this.amount += amount;
    }

    /**
     * 현금 증가
     *
     * @param amouut
     */
    public void plusAmount(Long amouut) {
        this.amount -= amount;
    }

}
