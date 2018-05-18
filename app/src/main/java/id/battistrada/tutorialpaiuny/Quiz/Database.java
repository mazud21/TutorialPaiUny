package id.battistrada.tutorialpaiuny.Quiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import id.battistrada.tutorialpaiuny.R;

public class Database extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis";

    public Database(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("soal", "Apa nama latin dari gambar di samping?");
        values.put("pil_a", "Punica granatum L.");
        values.put("pil_b","Durio zibethinus L.");
        values.put("pil_c", "Lansium domesticum Correa.");
        values.put("jwban","1");
        values.put("img", R.drawable.ic_launcher_background);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa nama latin dari gambar di samping?");
        values.put("pil_a", "Punica granatum L.");
        values.put("pil_b","Durio zibethinus L.");
        values.put("pil_c", "Lansium domesticum Correa.");
        values.put("jwban","2");
        values.put("img", R.drawable.ic_launcher_background);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa nama latin dari gambar di samping?");
        values.put("pil_a", "Artocarpus heterophillya atau Artocarpus integra");
        values.put("pil_b","Ananas comosus Merr.");
        values.put("pil_c", "Morinda citrifolia L.");
        values.put("jwban","1");
        values.put("img", R.drawable.ic_launcher_background);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa nama latin dari gambar di samping?");
        values.put("pil_a", "Artocarpus heterophillya atau Artocarpus integra");
        values.put("pil_b","Ananas comosus Merr.");
        values.put("pil_c", "Morinda citrifolia L.");
        values.put("jwban","0");
        values.put("img", R.drawable.ic_launcher_background);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa nama latin dari gambar di samping?");
        values.put("pil_a", "Pyrus communis ");
        values.put("pil_b","Musa sp.");
        values.put("pil_c", "Niphelium lappaceum L.");
        values.put("jwban","1");
        values.put("img", R.drawable.ic_launcher_background);
        db.insert("tbl_soal", "soal", values);

    }

    public List<Question> getSoal(){
        List<Question> listSoal = new ArrayList<Question>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Question s = new Question();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setJwban(cursor.getInt(5));
                s.setGambar(cursor.getInt(6));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        onCreate(db);

    }

}