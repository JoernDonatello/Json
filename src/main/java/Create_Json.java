import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


import org.json.JSONArray;
import org.json.JSONObject;


public class Create_Json {
    public static void main(String[] args) {
        buildjson();
        //writebyself();
    }

    public static void buildjson() {
        JSONObject obj = new JSONObject();
        obj.put("name", "Joern Marquardt");
        obj.put("location", "Stuttgart");

        JSONObject person1 = new JSONObject();
        person1.put("person1", obj);

        JSONObject obj2 = new JSONObject();

        obj2.put("name", "Patrick Jungk");
        obj2.put("location", "Göppingen");

        JSONObject person2 = new JSONObject();
        person2.put("person2", obj2);


        JSONArray personen = new JSONArray();
        personen.put(person1);
        personen.put(person2);


       writeJson(person2);
        writetofile(personen);

    }

    public static void writetofile(JSONArray result) {
        try (FileWriter file = new FileWriter("C:\\Users\\MARQJOE\\IdeaProjects\\Json\\confi.json")) {
            file.write(result.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writetofilefake(JSONObject result) {
        try (FileWriter file = new FileWriter("C:\\Users\\MARQJOE\\IdeaProjects\\Json\\confi.json")) {
            file.write(result.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void writeJson(JSONObject _jsonobj) {
        System.out.println("bitte gib ein");
        Scanner sc = new Scanner(System.in);
        String neu = sc.next();

        if (neu.equals("Patrick")) {
            System.out.println("klappt");
            changeJson(_jsonobj);
        }else {
            System.out.println("klappt nicht");
            changeJson(_jsonobj);
        }
    }

    public static void changeJson(JSONObject _obj) {

        //JSONObject person = j.getJSONObject(0).getJSONObject("person");
         _obj.getJSONObject("person2").put("name","patrickj");
        writetofilefake(_obj);
    }


    }





    /*public static void writebyself()
    {
        System.out.println("bitte gib ein");
        Scanner sc = new Scanner(System.in);
        String neu = sc.next();

        if (neu == "Patrick" ||  neu =="patrick"){
            System.out.println("klappt wieso aber");
        }
            System.out.println("Bitte geben Sie eine Clustervariable ein");
            String Clustervariable = sc.next();

            System.out.println("Bitte geben Sie ein Variablenname ein");
            String Variablenname = sc.next();

            System.out.println("Bitte geben Sie einen Wert für die Variable: " +Variablenname+ " ein");
            String Variablenwert = sc.next();


            JSONObject obj = new JSONObject();
            obj.put(Variablenname, Variablenwert);

            JSONObject test = new JSONObject();
            test.put(Clustervariable, obj);
            writetofilefake(test);
    }*/