package ru.beeline.parsebinarysig.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Author: Aleksey Chershembeev
 * created : 20.09.2021 - 18:49
 * description:
 */
public class Utils {


    //onlyForTests
    public static byte[] readFileBinary(String path) {

        byte[] bytes = null;
        try {
            //Change
            bytes = Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            System.out.println("error path in readFileBinary " + path);
            e.printStackTrace();
        }
        return bytes;
    }

    //TODO add readFileBinary with bufferedReader
}
