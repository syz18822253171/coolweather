package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	public static final String CREATE_PROVINCE = "create table province ("
			+ "id integer primary key autoincrement, "
			+ "province_name text, "
			+ "province_code text)";
	/**
	 * City�������
	 */
	public static final String CREAT_CITY = "create table city ("
			+ "id integer primary key autoincrement, "
			+ "city_name text, "
			+ "city_code text,"
			+" provice_id integer)";
	/**
	 *  County�������
	 */
	public static final String CREAT_COUNTY = "create table county ("
			+ "id integer primary key autoincrement, "
			+ "county_name text, "
			+ "county_code text,"
			+" city_id integer)";
	
	//���캯��
	public CoolWeatherOpenHelper(Context context, String name, CursorFactory factory, int version) 
	{
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) 
	{
		db.execSQL(CREATE_PROVINCE);//����Province��
		db.execSQL(CREAT_CITY);
		db.execSQL(CREAT_COUNTY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) 
	{
		

	}

}
