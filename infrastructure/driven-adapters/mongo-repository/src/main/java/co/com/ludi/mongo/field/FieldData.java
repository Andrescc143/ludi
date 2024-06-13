package co.com.ludi.mongo.field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder(toBuilder = true)
@Document(collection = "Field")
@NoArgsConstructor
@AllArgsConstructor
public class FieldData {
    @Id
    private String id;
    private String name;
    private String description;
    private int playersCapacity;
    private int statusCode;
    private String sportCenterId;
}
