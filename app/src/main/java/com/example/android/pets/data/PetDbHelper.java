package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Created by Benjamin on 11/23/2017.
 * Database helper for the pets app
 * Manage database creation and version management
 */

public class PetDbHelper extends SQLiteOpenHelper {

    public  static final String DATABASE_NAME = "shelter.db";

    /** Database version*/
    private static final int DATABASE_VERSION = 1;

    /** Construct new instance of {@link PetDbHelper}.
     * @param context of the app
     */

    public PetDbHelper(Context context){
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    /** This is called when the database is first created */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the pets table

        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetEntry.TABLE_NAME + " ("
                + PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, "
                + PetEntry.COLUMN_PET_BREED + " TEXT, "
                + PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
                + PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0"
                +");";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    /** This is called when the database needs to be upgraded */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
