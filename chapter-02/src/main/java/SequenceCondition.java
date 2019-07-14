/**
 * 순번 조건
 */
public class SequenceCondition implements DiscountCondition {
    private int sequnece;

    public SequenceCondition(int sequnece) {
        this.sequnece = sequnece;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequnece);
    }
}