/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsondemo2;

import java.util.Scanner;

/**
 *
 * @author cb-vishal
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        String path = "../JsonDemo2/src/jsondemo2/test.json";
        String[][] record = new String[][]{
            {"ajit", "chennai", "7811020219", "7685432134", "8976542334"},
            {"vaibhav", "chennai", "8811020213", "7685432134", "8976542312"},
            {"vishal", "chennai", "9011020213", "9085432134", "5676542314"}};
        ContactUtil.constructJsonFile(record, path);
        ContactUtil.loadJson(path);

        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("1.Search by name");
            System.out.println("2.Search by phone");
            System.out.println("3.exit");
            int ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter name::");
                    s.nextLine();
                    String name = s.nextLine();
                    ContactUtil.searchByName(name);
                    break;
                case 2:
                    System.out.println("Enter phone::");
                    s.nextLine();
                    String number = s.nextLine();
                    ContactUtil.searchByContactNumber(number);
                    break;

                case 3:
                    System.exit(0);

            }
        }

    }
}
