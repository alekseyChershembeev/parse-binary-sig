package ru.beeline.parsebinarysig.util;

import java.nio.charset.StandardCharsets;

/**
 * Author: Aleksey Chershembeev
 * created : 20.09.2021 - 16:40
 * description:
 */
public interface DecodeSig {


    default byte[] decodeHexToBinary(String hex) {
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }


    default String decodeHexToString(String hex) {
        return new String(decodeHexToBinary(hex), StandardCharsets.UTF_8);
    }


    default String decodeHexToBitString(String hex) {
        return null;
    }

    default String decodeHexToOctetString(String hex) {
        return null;
    }


    default int decodeHexToInt(String hex) {
        return Integer.parseInt(hex, 16);
    }


}
