package com.ejemplo;
import static spark.Spark.*; 
import com.google.gson.Gson;

public class Server {
    public static void main(String[] args) {
        User usuario = new User("Renzo", 70);
        Gson gson = new Gson();

        post("/updateWeight", (req, res) -> {
            weightRequest data = gson.fromJson(req.body(), weightRequest.class);
            usuario.updateWeight(data.getNuevoPeso());
            return gson.toJson(usuario);
        });
    }

    static class weightRequest {
        double newWeight;
        public double getNuevoPeso() { return newWeight; }
    }
}
