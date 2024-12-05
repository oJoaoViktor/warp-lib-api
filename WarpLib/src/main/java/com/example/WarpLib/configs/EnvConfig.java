package com.example.WarpLib.configs;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvConfig {

    private static final Dotenv dotenv;

    static {
        dotenv = Dotenv.configure()
                       .directory("WarpLib")
                       .load();
    }

    public static String get(String key) {
        return dotenv.get(key);
    }

    public static void loadSystemProperties() {
        System.setProperty("DB_URL", get("DB_URL"));
        System.setProperty("DB_USERNAME", get("DB_USERNAME"));
        System.setProperty("DB_PASSWORD", get("DB_PASSWORD"));
    }
}