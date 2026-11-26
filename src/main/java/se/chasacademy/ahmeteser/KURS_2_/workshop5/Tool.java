package se.chasacademy.ahmeteser.KURS_2_.workshop5;


public class Tool {

    private final String id;
    private final String name;
    private final String category;
    private final double dailyRate;
    private final boolean available;

    public Tool(
            String id,
            String name,
            String category,
            double dailyRate,
            boolean available) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.dailyRate = dailyRate;
        this.available = available;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {

        return String.format(
                "%-12s | %-12s | %6.2f kr/dag | %s",
                name,
                category,
                dailyRate,
                available ? "Tillgänglig" : "Utlånad"
        );
    }
}