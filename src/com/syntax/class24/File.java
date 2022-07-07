package com.syntax.class24;

public abstract class File {

    /*
    Create a class File that will have the
    following behaviors: open, edit, close.
    Edit and close are implemented method
    while open is an abstract. Create 3
    subclasses: JavaFile, WordFile,
    PdfFile that will provide specific
    implementation of open behavior.
    Example: to open .java file we need
    notepad++ or sublime text, to open
    .doc file we need Microsoft Word to be
    installed etc.
     */

    abstract void open();
    abstract void edit();
    abstract void close();
}
class JavaFile extends File {
    @Override
    void open() {
        System.out.println("Please open your Java file");
    }

    @Override
    void edit() {
        System.out.println("You can easily edit Java files using IntelliJ");
    }

    @Override
    public void close() {
        System.out.println("To close Java files in IntelliJ click the 'x' next to the class name");
    }
}
class WordFile extends File {
    @Override
    void open() {
        System.out.println("To open .doc file you need Microsoft Word to be installed");
    }

    @Override
    void edit() {
        System.out.println("Microsoft Word allows you to edit .doc files ");
    }

    @Override
    void close() {
        System.out.println("To close Microsoft Word files click the 'x' on the top, right-hand corner");
    }
}

class PdfFile extends File {
    @Override
    void open() {
        System.out.println("To open a .pdf file you need Adobe Acrobat Reader");
    }

    @Override
    void edit() {
        System.out.println("To edit a .pdf file you need Adobe Acrobat Reader");
    }
    @Override
    void close() {
        System.out.println("Once you are done with your .pdf file be sure to close it");
    }
}