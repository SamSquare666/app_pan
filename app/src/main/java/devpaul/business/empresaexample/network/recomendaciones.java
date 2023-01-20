package devpaul.business.empresaexample.network;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class recomendaciones {
    @SerializedName("recomendaciones")
    private List<recomendaciones> recomendacionesList;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("fecha")
    private String fecha;

    public recomendaciones(List<recomendaciones> recomendacionesList, String name, String description, String fecha) {
        this.recomendacionesList = recomendacionesList;
        this.name = name;
        this.description = description;
        this.fecha = fecha;
    }

    public List<recomendaciones> getRecomendacionesList() {
        return recomendacionesList;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFecha() {
        return fecha;
    }
}
