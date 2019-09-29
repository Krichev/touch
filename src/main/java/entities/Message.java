package entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
    //I think it's better to create a role field instead to send role in field name
    private String name;
    private String text;
}
