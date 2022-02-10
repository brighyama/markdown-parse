Test: MarkdownParse.class MarkdownParseTest.class
	javac -cp "lib/\*" MarkdownParseTest.java 

MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java