package se.chasacademy.ahmeteser.KURS_2_.workshop5;

import java.util.Comparator;

public final class ToolComparators {

    private ToolComparators() {
        // Utility class
    }

    // Alfabetik isim sıralaması
    public static final Comparator<Tool> BY_NAME =
            Comparator.comparing(Tool::getName);

    // En ucuz ürün önce
    public static final Comparator<Tool> BY_PRICE_ASC =
            Comparator.comparing(Tool::getDailyRate);

    // En pahalı ürün önce
    public static final Comparator<Tool> BY_PRICE_DESC =
            Comparator.comparing(Tool::getDailyRate)
                    .reversed();

    // Kategori alfabetik, sonra fiyat artan
    public static final Comparator<Tool> BY_CATEGORY_AND_PRICE =
            Comparator.comparing(Tool::getCategory)
                    .thenComparing(Tool::getDailyRate);

    // Kullanılabilir ürünler önce
    public static final Comparator<Tool> AVAILABLE_FIRST =
            Comparator.comparing(Tool::isAvailable)
                    .reversed();
}