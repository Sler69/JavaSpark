import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        //{
            //@Override
            //public Object handle(Request request, Response response) {
              //  return "Hello World!!";
            //}
        //});
    }
}
