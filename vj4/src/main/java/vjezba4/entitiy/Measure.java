package vjezba4.entitiy;



import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Measure {
    private int value;
    private String unit;
    private Long device_id;
}




