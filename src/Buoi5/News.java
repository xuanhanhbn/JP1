package Buoi5;

import java.util.Scanner;

public class News implements Inews {
    int ID;
    String Title, PublishDate, Author,Content;
    float AverageRate;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Title: " +Title);
        System.out.println("Input PublishDate: " + PublishDate);
        System.out.println("Input Author: " +Author);
        System.out.println("Input Content: " +Content);
        System.out.println("Input AverageRate: " +AverageRate);
    }
}
