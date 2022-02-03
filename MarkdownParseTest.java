import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {

    List<String> strList;

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of("https://something.com", "some-page.html"));
    }

    @Test
    public void testGetLinks2() throws IOException {
        Path fileName = Path.of("test2-file.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of());
    }

    @Test
    public void testGetLinks3() throws IOException {
        Path fileName = Path.of("test3-file.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of("https://hello.com"));
    }

    @Test
    public void testGetLinks4() throws IOException {
        Path fileName = Path.of("test4-file.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of());
    }

    @Test
    public void testGetLinks5() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of("https://something.com", "some-page.html"));
    }

    @Test
    public void testGetLinks6() throws IOException {
        Path fileName = Path.of("test-file3.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of());
    }

    @Test
    public void testGetLinks7() throws IOException {
        Path fileName = Path.of("test-file4.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of());
    }

    @Test
    public void testGetLinks8() throws IOException {
        Path fileName = Path.of("test-file5.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of());
    }

    @Test
    public void testGetLinks9() throws IOException {
        Path fileName = Path.of("test-file6.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of("page.com"));
    }

    @Test
    public void testGetLinks10() throws IOException {
        Path fileName = Path.of("test-file7.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of());
    }

    @Test
    public void testGetLinks11() throws IOException {
        Path fileName = Path.of("test-file8.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of());
    }

    @Test
    public void testAddition() {
        assertEquals(2, 1+1);
    }

    @Test
    public void testGetLinks12() throws IOException {
        Path fileName = Path.of("test-file9.md");
        String contents = Files.readString(fileName);
        this.strList = MarkdownParse.getLinks(contents);

        assertEquals(this.strList, List.of());
    }
}

// javac -cp "lib/\*" MarkdownParseTest.java
// java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest

// javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
// java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest

