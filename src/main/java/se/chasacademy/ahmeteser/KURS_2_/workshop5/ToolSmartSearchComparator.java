package se.chasacademy.ahmeteser.KURS_2_.workshop5;

import java.util.Comparator;

public class ToolSmartSearchComparator implements Comparator<Tool> {
    @Override
    public int compare(Tool t1, Tool t2) {

        // 1. Available tools first
        int result = Boolean.compare(
                t2.isAvailable(),
                t1.isAvailable()
        );

        if (result != 0) {
            return result;
        }

        // 2. Electric tools first
        boolean t1Electric =
                t1.getCategory().equals("Elverktyg");

        boolean t2Electric =
                t2.getCategory().equals("Elverktyg");

        result = Boolean.compare(
                t2Electric,
                t1Electric
        );

        if (result != 0) {
            return result;
        }

        // 3. Cheapest tools first
        return Double.compare(
                t1.getDailyRate(),
                t2.getDailyRate()
        );
    }
}