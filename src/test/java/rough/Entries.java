package rough;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Entries {
    @SerializedName("API")
    @Expose
    @Valid
    @NotNull(message = "API missing")
    private String API;

    @SerializedName("Description")
    @Expose
    @Valid
    @NotNull(message = "Description missing")
    private String Description;

    @SerializedName("Auth")
    @Expose
    @Valid
    @NotNull(message = "Auth missing")
    private String Auth;

    @SerializedName("HTTPS")
    @Expose
    @Valid
    @NotNull(message = "HTTPS missing")
    private boolean HTTPS;

    @SerializedName("Cors")
    @Expose
    @Valid
    @NotNull(message = "Cors missing")
    private String Cors;

    @SerializedName("Link")
    @Expose
    @Valid
    @NotNull(message = "Link missing")
    private String Link;

    @SerializedName("Category")
    @Expose
    @Valid
    @NotNull(message = "Category missing")
    private String Category;

    public String getAPI() {
        return API;
    }

    public void setAPI(String API) {
        this.API = API;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAuth() {
        return Auth;
    }

    public void setAuth(String auth) {
        Auth = auth;
    }

    public boolean isHTTPS() {
        return HTTPS;
    }

    public void setHTTPS(boolean HTTPS) {
        this.HTTPS = HTTPS;
    }

    public String getCors() {
        return Cors;
    }

    public void setCors(String cors) {
        Cors = cors;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
