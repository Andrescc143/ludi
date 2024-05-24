package co.com.ludi.model.field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Field {
    private String id;
    private String name;
    private String description;
    private int playersCapacity;
    private int statusCode;
    private String sportCenterId;
}
