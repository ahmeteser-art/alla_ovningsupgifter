package se.chasacademy.ahmeteser.KURS_2_.workshop5;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // ===================================
        // 1. ORIGINAL DATA
        // ===================================

        System.out.println("\n=== ORIGINAL TOOLS ===");

        List<Tool> tools = TestData.getSampleTools();

        printTools(tools);


        // ===================================
        // 2. SORT BY NAME
        // ===================================

        System.out.println("\n=== SORT BY NAME ===");

        List<Tool> byName = TestData.getSampleTools();

        byName.sort(
                Comparator.comparing(Tool::getName)
        );

        printTools(byName);


        // ===================================
        // 3. SORT BY PRICE DESCENDING
        // ===================================

        System.out.println("\n=== PRICE: EXPENSIVE FIRST ===");

        List<Tool> byPrice = TestData.getSampleTools();

        byPrice.sort(
                Comparator.comparing(Tool::getDailyRate)
                        .reversed()
        );

        printTools(byPrice);


        // ===================================
        // 4. COMBINED SORTING
        // CATEGORY + PRICE
        // ===================================

        System.out.println("\n=== CATEGORY + PRICE ===");

        List<Tool> combined = TestData.getSampleTools();

        combined.sort(
                Comparator.comparing(Tool::getCategory)
                        .thenComparing(Tool::getDailyRate)
        );

        printTools(combined);


        // ===================================
        // 5. AVAILABLE FIRST
        // INLINE LAMBDA
        // ===================================

        System.out.println("\n=== AVAILABLE FIRST ===");

        List<Tool> availableFirst = TestData.getSampleTools();

        availableFirst.sort(
                (t1, t2) -> Boolean.compare(
                        t2.isAvailable(),
                        t1.isAvailable()
                )
        );

        printTools(availableFirst);


        // ===================================
        // 6. REUSABLE COMPARATOR CONSTANT
        // ===================================

        System.out.println("\n=== REUSABLE COMPARATOR ===");

        List<Tool> reusable = TestData.getSampleTools();

        reusable.sort(ToolComparators.BY_PRICE_ASC);

        printTools(reusable);


        // ===================================
        // 7. FILTERING
        // AVAILABLE TOOLS ONLY
        // ===================================

        System.out.println("\n=== AVAILABLE TOOLS ONLY ===");

        List<Tool> availableTools = tools.stream()
                .filter(Tool::isAvailable)
                .toList();

        printTools(availableTools);


        // ===================================
        // 8. FILTERING + SORTING
        // AVAILABLE AND CHEAP
        // ===================================

        System.out.println("\n=== AVAILABLE AND CHEAP ===");

        List<Tool> availableAndCheap = tools.stream()
                .filter(Tool::isAvailable)
                .filter(t -> t.getDailyRate() < 100)
                .sorted(
                        Comparator.comparing(Tool::getDailyRate)
                )
                .toList();

        printTools(availableAndCheap);


        // ===================================
        // 9. SMART SEARCH COMPARATOR CLASS
        // ===================================

        System.out.println("\n=== SMART SEARCH ===");

        List<Tool> smartSearch = TestData.getSampleTools();

        smartSearch.sort(
                new ToolSmartSearchComparator()
        );

        printTools(smartSearch);
    }


    // ===================================
    // REUSABLE PRINT METHOD
    // ===================================

    private static void printTools(List<Tool> tools) {

        for (Tool tool : tools) {
            System.out.println(tool);
        }
    }
}