package com.example.user.rightwear;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Order1 extends SQLiteOpenHelper {


    public static final String Shoulder="Shoulder";
    public static final String Date="date";


    public Order1(Context context) {
        super(context, "Order_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table order1(id integer primary key autoincrement," +
                " design text,neckline text,"+Shoulder+" text,chest text," +
                "armhole text,waist text,stomach text,hip text,thigh text," +
                " calf text,knee text, anklehem text,upperbust text,name text,"+Date+")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists order1");

    }

    public boolean insert(String design , String neckline, String shoulder, String chest,
                          String armhole, String waist, String stomach, String hip,
                          String thigh,String calf,String knee,String anklehem,
                          String upperbust,String name,String date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("design",design);
        contentValues.put("neckline",neckline);
        contentValues.put(Shoulder,shoulder);
        contentValues.put("chest",chest);
        contentValues.put("armhole",armhole);
        contentValues.put("waist",waist);
        contentValues.put("stomach",stomach);
        contentValues.put("hip",hip);
        contentValues.put("thigh",thigh);
        contentValues.put("calf",calf);
        contentValues.put("knee",knee);
        contentValues.put("anklehem",anklehem);
        contentValues.put("upperbust",upperbust);
        contentValues.put("name",name);
        contentValues.put(Date,date);
        long ins = db.insert("order1",null,contentValues);
        if(ins==-1) return  false;
        else return true;

    }
    public Cursor getAllData()//cursor class provied random read write
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from order1",null);
        return res;
    }


}
