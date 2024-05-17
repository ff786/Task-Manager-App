/*
package com.example.myapplication

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context, factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {

    // below is the method for creating a database by a sqlite query
    override fun onCreate(db: SQLiteDatabase) {
        // below is a sqlite query, where column names
        // along with their data types is given
        val query = ("CREATE TABLE " + TABLE_NAME + " ("
                + RID + " INTEGER PRIMARY KEY, " +
                RECEIVER_NAME + " TEXT," +
                DESCRIPTION + " TEXT" + ")")

        // we are calling sqlite
        // method for executing our query
        db.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        // this method is to check if table already exists
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    // This method is for adding data in our database
    fun addName(name : String, descriptionGem : String ){

        val values = ContentValues()

        values.put(RECEIVER_NAME, name)
        values.put(DESCRIPTION, descriptionGem)

        val db = this.writableDatabase

        db.insert(TABLE_NAME, null, values)
        db.close()
    }

    // below method is to get
    // all data from our database
    fun getName(): Cursor? {

        val db = this.readableDatabase

        return db.rawQuery("SELECT * FROM " + TABLE_NAME, null)

    }

    companion object{
        // here we have defined variables for our database

        private val DATABASE_NAME = "REMINDER_EMERALD_OASIS"

        // below is the variable for database version
        private val DATABASE_VERSION = 1

        val TABLE_NAME = "MY_REMINDERS"

        val RID = "id"

        val RECEIVER_NAME = "receiverName"

        val DESCRIPTION = "gemDescription"
    }
}
*/
