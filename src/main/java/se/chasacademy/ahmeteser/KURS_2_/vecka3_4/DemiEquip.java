
package se.chasacademy.ahmeteser.KURS_2_.vecka3_4;

import java.util.List;

// 1. Ortak sözleşme
interface EquipmentItem {
    String getName();
    double getDailyCost();
    boolean isAvailable();
}

// 2. Tool sınıfı
class Tool implements EquipmentItem {

    private String name;
    private double dailyCost;
    private boolean available;

    public Tool(String name, double dailyCost, boolean available) {
        this.name = name;
        this.dailyCost = dailyCost;
        this.available = available;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getDailyCost() {
        return dailyCost;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "name='" + name + '\'' +
                ", dailyCost=" + dailyCost +
                ", available=" + available +
                '}';
    }
}

// 3. SportEquipment sınıfı
class SportEquipment implements EquipmentItem {

    private String name;
    private double dailyCost;
    private boolean available;

    public SportEquipment(String name, double dailyCost, boolean available) {
        this.name = name;
        this.dailyCost = dailyCost;
        this.available = available;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getDailyCost() {
        return dailyCost;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "SportEquipment{" +
                "name='" + name + '\'' +
                ", dailyCost=" + dailyCost +
                ", available=" + available +
                '}';
    }
}

// 4. Book sınıfı - Ödevin istediği üçüncü nesne türü
class Book {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

// 5. ResourceService - Mevcut sınıfını koruyoruz
class ResourceService {

    public static <T> T getFirst(List<T> list) {

        if (list == null || list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }
}

// 6. ListTools - Ödevin istediği yeni yardımcı sınıf
class ListTools {

    // Listenin ilk elemanını getirir
    public static <T> T first(List<T> items) {

        if (items == null || items.isEmpty()) {
            return null;
        }

        return items.get(0);
    }

    // Listenin son elemanını getirir
    public static <T> T last(List<T> items) {

        if (items == null || items.isEmpty()) {
            return null;
        }

        return items.get(items.size() - 1);
    }
}

// 7. Ana sınıf
public class DemiEquip {

    public static void main(String[] args) {

        System.out.println("=== GENERICS ===");

        // STRING
        List<String> names = List.of(
                "verktygsförrådet",
                "sportförrådet"
        );

        // INTEGER
        List<Integer> numbers = List.of(
                10, 20, 30
        );

        // TOOL
        List<Tool> tools = List.of(
                new Tool("cirkelsåg", 100.0, true),
                new Tool("borrmaskin", 80.0, true)
        );

        // SPORT EQUIPMENT
        List<SportEquipment> sportEquipments = List.of(
                new SportEquipment("fotboll", 50.0, true),
                new SportEquipment("basketboll", 30.0, false)
        );

        // BOOK
        List<Book> books = List.of(
                new Book("Clean Code"),
                new Book("Effective Java")
        );

        // =================================
        // ÖDEV: ListTools TESTLERİ
        // =================================

        System.out.println("\n=== STRING ===");

        System.out.println("First: " + ListTools.first(names));
        System.out.println("Last: " + ListTools.last(names));

        System.out.println("\n=== INTEGER ===");

        System.out.println("First: " + ListTools.first(numbers));
        System.out.println("Last: " + ListTools.last(numbers));

        System.out.println("\n=== BOOK ===");

        System.out.println("First: " + ListTools.first(books));
        System.out.println("Last: " + ListTools.last(books));

        System.out.println("\n=== TOOL ===");

        System.out.println("First: " + ListTools.first(tools));
        System.out.println("Last: " + ListTools.last(tools));

        System.out.println("\n=== SPORT EQUIPMENT ===");

        System.out.println("First: " + ListTools.first(sportEquipments));
        System.out.println("Last: " + ListTools.last(sportEquipments));

        // =================================
        // ESKİ ResourceService METODUNU DA
        // KORUYORUZ VE TEST EDİYORUZ
        // =================================

        System.out.println("\n=== RESOURCE SERVICE ===");

        String firstName = ResourceService.getFirst(names);
        Tool firstTool = ResourceService.getFirst(tools);
        SportEquipment firstSportEquipment =
                ResourceService.getFirst(sportEquipments);

        System.out.println("First name: " + firstName);
        System.out.println("First tool: " + firstTool);
        System.out.println("First sport equipment: " + firstSportEquipment);
    }
}
