package objects.chapter01;

/**
 * 관람객은 소지품을 보관하기 위해 가방을 소지할 수 있다.
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    // 가방의 존재를 숨겼다. (캡슐화)
    // 가방이 아니라 작은 지갑을 소지하도록 코드를 변경하고 싶다면 Audience 내부면 변경하며 된다.
    public Long buy(Ticket ticket) {
        // 가방도 캡슐화
        return bag.hold(ticket);
    }
}
