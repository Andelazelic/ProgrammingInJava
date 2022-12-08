package vjezba4.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Users {
    Long userId;
    Long deviceId;
    Address address;
}


