package co.com.invima.onlineprocedure.canonicalmodel.dto.email;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmailDTO implements Serializable {


    String sendTo;
    String body;
    String subject;
    //List<File> file;
    List<String> files;
}
