package com.duing.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456@!");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("123456");
        System.out.println(username);
        System.out.println(password);

        //EcXP5Lnwe3VveufZmpJvSg==
        //R9UZPoR5P0oAOG8D8ixwcQ==
    }
}
