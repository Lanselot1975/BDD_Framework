package rough;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Placeholders {
    @SerializedName("userId")
    @Expose
    @Valid
    @NotNull(message = "userId missing")
    private String userId;

    @SerializedName("id")
    @Expose
    @Valid
    @NotNull(message = "id missing")
    private String id;

    @SerializedName("title")
    @Expose
    @Valid
    @NotNull(message = "title missing")
    private String title;

    @SerializedName("body")
    @Expose
    @Valid
    @NotNull(message = "body missing")
    private String body;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
