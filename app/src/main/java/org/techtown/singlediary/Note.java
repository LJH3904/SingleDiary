package org.techtown.singlediary;

public class Note {
    int _id; String weather;
    String address;
    String locationX;
    String locationY;
    String contents;
    String mood; String picture;
    String createDateStr;
    public  Note(int _id, String  weather,String address,String locationX,String locationY,
                 String contents,String mood, String picture ,String createDateStr){
        this._id = _id;
        this.weather = weather;
        this.address = address;
        this.locationX = locationX;
        this.locationY= locationY;
        this.contents =contents;
        this.mood = mood;
        this.picture = picture;
        this.createDateStr = createDateStr;

    }

}
