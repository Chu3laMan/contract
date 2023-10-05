package co.chu3la.contract.domain;


import co.chu3la.contract.response.BaseResponse;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name= "transaction")
public class Transaction extends BaseEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String type;
    private Date date;
    private String accountNumber;
    private String currency;
    private String amount;
    private String marchantName;
    private String marchantLogo;

}
