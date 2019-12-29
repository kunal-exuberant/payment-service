package transaction.models;

import lombok.Getter;
import java.util.Map;

@Getter
public abstract class State {
    private TransactionContext context;
    private Map<SenderTransactionState, State> transitionsMap;

    public State transit(Action action) throws Exception{
            if(getTransitionsMap().containsKey(action)){
                return getTransitionsMap().get(action);
            }
            else{
                throw new Exception("No state mapped to this state");
            }
    }

    public abstract void performAction() throws Exception;
}
