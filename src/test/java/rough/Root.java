package rough;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Root {

//    @SerializedName("Placeholders")
//    @Expose
//    @Valid
//    @NotNull(message = "Placeholder missing")
    private List<Placeholders> placeHolders;

    public List<Placeholders> getPlaceHolders() {
        return placeHolders;
    }

    public void setPlaceHolders(List<Placeholders> placeHolders) {
        this.placeHolders = placeHolders;
    }
}
