import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {


    @Test
    public void addingNullMovie() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addingOneMovie() {
        MovieManager manager = new MovieManager();
        manager.add("Терминатор");

        String[] expected = {"Терминатор"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addingThreeMovies() {
        MovieManager manager = new MovieManager();
        manager.add("Терминатор");
        manager.add("Терминатор 2 судный день");
        manager.add("Правдивая ложь");

        String[] expected = {"Терминатор", "Терминатор 2 судный день", "Правдивая ложь"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastThreeMoviesLimit() {
        MovieManager manager = new MovieManager();
        manager.add("Терминатор");
        manager.add("Терминатор 2 судный день");
        manager.add("Правдивая ложь");

        String[] expected = {"Правдивая ложь", "Терминатор 2 судный день", "Терминатор"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void lastThreeMoviesNoLimit() {
        MovieManager manager = new MovieManager(2);
        manager.add("Терминатор");
        manager.add("Терминатор 2 судный день");
        manager.add("Правдивая ложь");

        String[] expected = {"Правдивая ложь", "Терминатор 2 судный день"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
