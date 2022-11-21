package labshopeventsourcing.query;

import java.util.List;
import java.util.Date;
import lombok.Data;

@Data
public class OrderStatus {

        private Long id;
        private String status;
        private Long amount;
        private Long qty;
        private String productId;


}