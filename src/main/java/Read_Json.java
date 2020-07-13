import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;


public class Read_Json {
    public static void main(String[] args) {
        System.out.println("bitte gib ein");
        Scanner sc = new Scanner(System.in);
        String neu = sc.next();
if (neu == "Patrick" ||  neu =="patrick"){

             System.out.println("klappt wieso aber");
        }
        JSONObject obj = new JSONObject();
        obj.put("name", "Joern Marquardt");
        obj.put("location", "Stuttgart");

        JSONObject person1 = new JSONObject();
        person1.put("person1", obj);

        JSONObject person2 = new JSONObject();
        person2.put("person2", obj);

        JSONArray personen = new JSONArray();
        personen.put(obj);
        personen.put(person2);


        writetofile(personen);


    }

    public static void writetofile(JSONArray _personen) {
        try (FileWriter file = new FileWriter("C:\\Users\\MARQJOE\\IdeaProjects\\Json\\confi2.json")) {
            file.write(_personen.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static void writeJson(JSONObject _jsonobj) {
        System.out.println("bitte gib ein");
        Scanner sc = new Scanner(System.in);
        String neu = sc.next();

        _jsonobj.put("person1", neu);
    }

    public static void changeJson(JSONObject _obj) {
        //JSONObject person = jsonArray.getJSONObject(0).getJSONObject("person");
        _obj.getJSONObject("person1").put("name","patrickj");
        //writetofile(_obj);



    }
}
