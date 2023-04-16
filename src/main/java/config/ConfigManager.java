package config;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.SneakyThrows;

import java.io.FileReader;

public class ConfigManager {
    public static final JsonObject SETTINGS = loadData("src/main/resources/settings.json");

    @SneakyThrows
    private static JsonObject loadData(String fileNameOrPath) {
        try (FileReader reader = new FileReader(fileNameOrPath)) {
            return JsonParser.parseReader(reader).getAsJsonObject();
        } catch (Exception e) {
            throw new Exception("Data parse error. File: " + fileNameOrPath);
        }
    }
}
