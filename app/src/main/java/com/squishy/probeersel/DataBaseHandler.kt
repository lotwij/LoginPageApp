package com.squishy.probeersel

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val DATABASE_NAME = "MyDB"
val TABLE_NAME = "Users"
///val COL_EMAIL = "email"
val COL_NAME = "name"
val COL_AGE = "age"
val COL_ID = "id"

class DataBaseHandler(var context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null,1){
    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE " + TABLE_NAME +  " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
///                COL_EMAIL + " VARCHAR(255)," +
                COL_NAME + " VARCHAR(256)," +
                COL_AGE + " INTEGER)";

        db?.execSQL(createTable)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun insertData(user: User){
        val db = this.writableDatabase
        var cv = ContentValues()
///        cv.put(COL_EMAIL,user.email)
        cv.put(COL_NAME,user.name)
        cv.put(COL_AGE, user.age)
        val result = db.insert(TABLE_NAME,null,cv)
        if(result == -1.toLong())
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()

    }

}
