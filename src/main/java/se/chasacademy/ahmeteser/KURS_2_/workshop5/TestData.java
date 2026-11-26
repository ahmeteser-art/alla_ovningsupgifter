package se.chasacademy.ahmeteser.KURS_2_.workshop5;

import java.util.ArrayList;
import java.util.List;

public class TestData {
    public static List<Tool> getSampleTools() {

        List<Tool> tools = new ArrayList<>();

        tools.add(new Tool(
                "T101", "Cirkelsåg",
                "Elverktyg", 150.0, true));

        tools.add(new Tool(
                "T102", "Skruvdragare",
                "Elverktyg", 75.0, false));

        tools.add(new Tool(
                "T103", "Hammare",
                "Handverktyg", 25.0, true));

        tools.add(new Tool(
                "T104", "Slagborr",
                "Elverktyg", 120.0, true));

        tools.add(new Tool(
                "T105", "Häcksax",
                "Trädgård", 90.0, false));

        tools.add(new Tool(
                "T106", "Fogsvans",
                "Handverktyg", 30.0, true));

        tools.add(new Tool(
                "T107", "Slipmaskin",
                "Elverktyg", 90.0, true));

        return tools;
    }
}
