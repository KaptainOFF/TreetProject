package com.kapitanov;
import java.util.Date;

public class Treet {
    private String mAuthor;
    private String mDescription;
    private Date mCreationDate;

    public String getAuthor() {
        return mAuthor;
    }

    public String getDescription() {
        return mDescription;
    }

    public Date getCreationDate() {
        return mCreationDate;
    }

    public Treet(String author,String description, Date creationDate) {
        this.mAuthor = author;
        this.mDescription = description;
        this.mCreationDate = creationDate;
    }

    public String[] getWords() {
        return mDescription.toLowerCase().split("[^\\w#@']");
    }

    @Override
    public String toString() {
        return ("Author: " + mAuthor +
                ", Descripton: " + mDescription +
                ", Date: " + mCreationDate);

    }

}
