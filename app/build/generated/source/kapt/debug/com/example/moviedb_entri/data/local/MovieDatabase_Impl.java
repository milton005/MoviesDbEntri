package com.example.moviedb_entri.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDatabase_Impl extends MovieDatabase {
  private volatile MovieDao _movieDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movie_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `overview` TEXT, `original_language` TEXT, `original_title` TEXT, `video` INTEGER, `title` TEXT, `poster_path` TEXT, `backdrop_path` TEXT, `release_date` TEXT, `popularity` REAL, `vote_average` REAL, `movie_id` INTEGER, `adult` INTEGER, `vote_count` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f1faeb7bb7a69872167af99d43778c44')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `movie_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovieTable = new HashMap<String, TableInfo.Column>(14);
        _columnsMovieTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("original_language", new TableInfo.Column("original_language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("original_title", new TableInfo.Column("original_title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("video", new TableInfo.Column("video", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("poster_path", new TableInfo.Column("poster_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("backdrop_path", new TableInfo.Column("backdrop_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("release_date", new TableInfo.Column("release_date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("vote_average", new TableInfo.Column("vote_average", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("movie_id", new TableInfo.Column("movie_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("adult", new TableInfo.Column("adult", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("vote_count", new TableInfo.Column("vote_count", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieTable = new TableInfo("movie_table", _columnsMovieTable, _foreignKeysMovieTable, _indicesMovieTable);
        final TableInfo _existingMovieTable = TableInfo.read(_db, "movie_table");
        if (! _infoMovieTable.equals(_existingMovieTable)) {
          return new RoomOpenHelper.ValidationResult(false, "movie_table(com.example.moviedb_entri.data.local.MovieDbEntity).\n"
                  + " Expected:\n" + _infoMovieTable + "\n"
                  + " Found:\n" + _existingMovieTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f1faeb7bb7a69872167af99d43778c44", "788fc7f50489e13e0c34aeb08ff00b12");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "movie_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `movie_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MovieDao MovieEntityDao() {
    if (_movieDao != null) {
      return _movieDao;
    } else {
      synchronized(this) {
        if(_movieDao == null) {
          _movieDao = new MovieDao_Impl(this);
        }
        return _movieDao;
      }
    }
  }
}
