package transaction.models;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Data
public class TransactionStore {
     public static Map<Integer, TransactionContext> transactionContextStore = new HashMap<Integer, TransactionContext>();
}
