package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Benjamin on 11/23/2017.
 * A pet contract class
 */

public final class PetContract {

    PetContract () {}

    public static final class PetEntry implements BaseColumns{

        public static final String TABLE_NAME = "pets"; // name of the table

        public static final String _ID = BaseColumns._ID;  // unique id of pet INTEGER
        public static final String COLUMN_PET_NAME = "name"; // Name of the pet. Type: TEXT
        public static final String COLUMN_PET_BREED = "breed"; // Breed of the pet. Type: TEXT
        public static final String COLUMN_PET_GENDER = "gender"; // Gender of the pet. Type: INTEGER
        public static final String COLUMN_PET_WEIGHT = "weight"; // Weight of the pet. Type: INTEGER

        /** Possible values for gender of pets */
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;

    }
}
