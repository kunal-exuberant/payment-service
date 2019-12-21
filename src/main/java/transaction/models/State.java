package transaction.models;

import java.util.Map;

public abstract class State {
    private TransactionContext context;
    private Map<SenderTransactionState, State> transitionsMap;
    public abstract void transit(SenderTransactionState state);
    public abstract void peformAction();
}
