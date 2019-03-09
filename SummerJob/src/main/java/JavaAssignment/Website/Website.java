package JavaAssignment.Website;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Website {
    @Id
    private String name;
    private String url;

    public Website() {

    }


    public Website(@JsonProperty("name") String name,
                   @JsonProperty("url") String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

}
