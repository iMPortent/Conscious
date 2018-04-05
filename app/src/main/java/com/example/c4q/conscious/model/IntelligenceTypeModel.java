package com.example.c4q.conscious.model;

/**
 * Created by NiemaWidaha on 4/2/18.
 */

/**
 * holds the model for the intelligence type:
 */
public class IntelligenceTypeModel {

    // private fields:
    int name;
    int photoID;
    int description;



    // default constructor:
    public IntelligenceTypeModel(int name, int photoID, int description) {
        this.name = name;
        this.photoID = photoID;
        this.description = description;
    }

    // getters + setters:

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }
} // ends intelligence type model
