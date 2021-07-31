package myClasses.Items;

import myClasses.Humans.Author;

public class Book implements Cloneable{

    private String name;
    private Author author;

    public void setName(String n){ name=n;}
    public String getName(){ return name;}

    public void setAuthor(String n){ author.setName(n);}
    public String getAuthor(){ return author.getName();}

    public Book(String name, String author){
        this.name = name;
        this.author = new Author(author);
    }

    public String toString(){

        return "Книга '" + name + "' (автор " +  author + ")";
    }

    public Book clone() throws CloneNotSupportedException{
        Book newBook = (Book) super.clone();
        newBook.author=(Author) author.clone();
        return newBook;
    }
}
