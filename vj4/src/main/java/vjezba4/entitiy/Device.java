package vjezba4.entitiy;
import java.util.*;

import lombok.*;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Device {
    private Long id;
    private Set<Measure> measures;
}




