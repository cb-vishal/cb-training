/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsondemo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jsondemo2.Contact.Person;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author cb-vishal
 */
public class ContactUtil {

    private static List<Contact> directory = new ArrayList<>();

    public static void constructJsonFile(String record[][], String path) throws Exception {
        JSONObject obj = new JSONObject();
        JSONArray list = new JSONArray();

        for (int i = 0; i < record.length; i++) {
            JSONObject obj2 = new JSONObject();
            obj2.put(Person.NAME.value(), record[i][0]);
            obj2.put(Person.ADDRESS.value(), record[i][1]);
            obj2.put(Person.MOBILE.value(), record[i][2]);
            obj2.put(Person.HOME.value(), record[i][3]);
            obj2.put(Person.WORK.value(), record[i][4]);
            list.put(obj2);

        }
        obj.put("PhoneDirectory", list);

        FileWriter file = new FileWriter(path);
        file.write(obj.toString());
        file.flush();
        file.close();

    }

    public static void loadJson(String path) throws Exception {

        File file = new File(path);
        BufferedReader read = new BufferedReader(new FileReader(file));
        String str = read.readLine();
        System.out.println(str);
        JSONObject obj = new JSONObject(str);

        JSONArray contact = (JSONArray) obj.get("PhoneDirectory");

        for (int i = 0; i < contact.length(); i++) {

            Contact con = new Contact();
            JSONObject mobj = (JSONObject) contact.getJSONObject(i);
            con.setName(mobj.get(Person.NAME.value()).toString());
            con.setAdd(mobj.get(Person.ADDRESS.value()).toString());
            con.setMobile(mobj.get(Person.MOBILE.value()).toString());
            con.setWork(mobj.get(Person.WORK.value()).toString());
            con.setHome(mobj.get(Person.HOME.value()).toString());

            directory.add(con);

        }
    }

    public static void searchByName(String name) {
        Iterator it = directory.iterator();
        int f = 1;
        while (it.hasNext()) {
            Contact con = (Contact) it.next();

            if (name.equals(con.getname())) {
                f = 0;
                System.out.println(con);
            }
        }
        if (f == 1) {
            System.out.println("Record not found");
        }

    }

    public static void searchByContactNumber(String number) {
        Iterator it = directory.iterator();
        int f = 1;
        while (it.hasNext()) {
            Contact con = (Contact) it.next();

            if (number.equals(con.getMobile()) || number.equals(con.getHome()) || number.equals(con.getWork())) {
                f = 0;
                System.out.println(con);
                break;
            }
        }
        if (f == 1) {
            System.out.println("Record not found");
        }
    }

}
