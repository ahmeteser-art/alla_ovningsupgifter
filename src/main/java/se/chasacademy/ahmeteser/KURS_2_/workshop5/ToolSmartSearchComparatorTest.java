package se.chasacademy.ahmeteser.KURS_2_.workshop5;

import org.junit.jupiter.api.*;

import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;

class ToolSmartSearchComparatorTest {

    private final Comparator<Tool> comparator =
            new ToolSmartSearchComparator();


    @Test
    @DisplayName("Available tools should come first")
    void availableToolsShouldComeFirst() {

        Tool available = new Tool(
                "T1", "Hammare",
                "Handverktyg", 50, true
        );

        Tool unavailable = new Tool(
                "T2", "Såg",
                "Handverktyg", 20, false
        );

        int result = comparator.compare(
                available,
                unavailable
        );

        assertTrue(
                result < 0,
                "Available tool should come first"
        );
    }


    @Test
    @DisplayName("Electric tools should come before hand tools")
    void electricToolsShouldComeFirst() {

        Tool electric = new Tool(
                "T1", "Cirkelsåg",
                "Elverktyg", 100, true
        );

        Tool hand = new Tool(
                "T2", "Hammare",
                "Handverktyg", 20, true
        );

        int result = comparator.compare(
                electric,
                hand
        );

        assertTrue(
                result < 0,
                "Electric tool should come first"
        );
    }


    @Test
    @DisplayName("Cheaper electric tools should come first")
    void cheaperElectricToolsShouldComeFirst() {

        Tool cheap = new Tool(
                "T1", "Skruvdragare",
                "Elverktyg", 50, true
        );

        Tool expensive = new Tool(
                "T2", "Cirkelsåg",
                "Elverktyg", 150, true
        );

        int result = comparator.compare(
                cheap,
                expensive
        );

        assertTrue(
                result < 0,
                "Cheaper tool should come first"
        );
    }
}