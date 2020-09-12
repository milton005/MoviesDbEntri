package com.example.moviedb_entri.data.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.paging.DataSource.Factory;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieDbEntity> __insertionAdapterOfMovieDbEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieDbEntity = new EntityInsertionAdapter<MovieDbEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movie_table` (`id`,`overview`,`original_language`,`original_title`,`video`,`title`,`poster_path`,`backdrop_path`,`release_date`,`popularity`,`vote_average`,`movie_id`,`adult`,`vote_count`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieDbEntity value) {
        stmt.bindLong(1, value.getRowId());
        if (value.getOverview() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOverview());
        }
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getOriginalLanguage());
        }
        if (value.getOriginalTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOriginalTitle());
        }
        final Integer _tmp;
        _tmp = value.getVideo() == null ? null : (value.getVideo() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
        if (value.getTitle() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTitle());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPosterPath());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getBackdropPath());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getReleaseDate());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindDouble(10, value.getPopularity());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindDouble(11, value.getVoteAverage());
        }
        if (value.getId() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, value.getId());
        }
        final Integer _tmp_1;
        _tmp_1 = value.getAdult() == null ? null : (value.getAdult() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, _tmp_1);
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getVoteCount());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM movie_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final MovieDbEntity movieEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovieDbEntity.insert(movieEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertList(final List<MovieDbEntity> MovieRepoEntityList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovieDbEntity.insert(MovieRepoEntityList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<MovieDbEntity>> getAll() {
    final String _sql = "SELECT * FROM movie_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"movie_table"}, false, new Callable<List<MovieDbEntity>>() {
      @Override
      public List<MovieDbEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfRowId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final List<MovieDbEntity> _result = new ArrayList<MovieDbEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieDbEntity _item;
            final int _tmpRowId;
            _tmpRowId = _cursor.getInt(_cursorIndexOfRowId);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpOriginalLanguage;
            _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final String _tmpOriginalTitle;
            _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            final Boolean _tmpVideo;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp == null ? null : _tmp != 0;
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final Float _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getFloat(_cursorIndexOfVoteAverage);
            }
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final Boolean _tmpAdult;
            final Integer _tmp_1;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp_1 == null ? null : _tmp_1 != 0;
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            _item = new MovieDbEntity(_tmpRowId,_tmpOverview,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpVideo,_tmpTitle,_tmpPosterPath,_tmpBackdropPath,_tmpReleaseDate,_tmpPopularity,_tmpVoteAverage,_tmpId,_tmpAdult,_tmpVoteCount);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public DataSource.Factory<Integer, MovieDbEntity> getAllMoviePaged() {
    final String _sql = "SELECT * FROM movie_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, MovieDbEntity>() {
      @Override
      public LimitOffsetDataSource<MovieDbEntity> create() {
        return new LimitOffsetDataSource<MovieDbEntity>(__db, _statement, false , "movie_table") {
          @Override
          protected List<MovieDbEntity> convertRows(Cursor cursor) {
            final int _cursorIndexOfRowId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(cursor, "overview");
            final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(cursor, "original_language");
            final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(cursor, "original_title");
            final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(cursor, "video");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
            final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(cursor, "poster_path");
            final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(cursor, "backdrop_path");
            final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(cursor, "release_date");
            final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(cursor, "popularity");
            final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(cursor, "vote_average");
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "movie_id");
            final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(cursor, "adult");
            final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(cursor, "vote_count");
            final List<MovieDbEntity> _res = new ArrayList<MovieDbEntity>(cursor.getCount());
            while(cursor.moveToNext()) {
              final MovieDbEntity _item;
              final int _tmpRowId;
              _tmpRowId = cursor.getInt(_cursorIndexOfRowId);
              final String _tmpOverview;
              _tmpOverview = cursor.getString(_cursorIndexOfOverview);
              final String _tmpOriginalLanguage;
              _tmpOriginalLanguage = cursor.getString(_cursorIndexOfOriginalLanguage);
              final String _tmpOriginalTitle;
              _tmpOriginalTitle = cursor.getString(_cursorIndexOfOriginalTitle);
              final Boolean _tmpVideo;
              final Integer _tmp;
              if (cursor.isNull(_cursorIndexOfVideo)) {
                _tmp = null;
              } else {
                _tmp = cursor.getInt(_cursorIndexOfVideo);
              }
              _tmpVideo = _tmp == null ? null : _tmp != 0;
              final String _tmpTitle;
              _tmpTitle = cursor.getString(_cursorIndexOfTitle);
              final String _tmpPosterPath;
              _tmpPosterPath = cursor.getString(_cursorIndexOfPosterPath);
              final String _tmpBackdropPath;
              _tmpBackdropPath = cursor.getString(_cursorIndexOfBackdropPath);
              final String _tmpReleaseDate;
              _tmpReleaseDate = cursor.getString(_cursorIndexOfReleaseDate);
              final Double _tmpPopularity;
              if (cursor.isNull(_cursorIndexOfPopularity)) {
                _tmpPopularity = null;
              } else {
                _tmpPopularity = cursor.getDouble(_cursorIndexOfPopularity);
              }
              final Float _tmpVoteAverage;
              if (cursor.isNull(_cursorIndexOfVoteAverage)) {
                _tmpVoteAverage = null;
              } else {
                _tmpVoteAverage = cursor.getFloat(_cursorIndexOfVoteAverage);
              }
              final Integer _tmpId;
              if (cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = cursor.getInt(_cursorIndexOfId);
              }
              final Boolean _tmpAdult;
              final Integer _tmp_1;
              if (cursor.isNull(_cursorIndexOfAdult)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = cursor.getInt(_cursorIndexOfAdult);
              }
              _tmpAdult = _tmp_1 == null ? null : _tmp_1 != 0;
              final Integer _tmpVoteCount;
              if (cursor.isNull(_cursorIndexOfVoteCount)) {
                _tmpVoteCount = null;
              } else {
                _tmpVoteCount = cursor.getInt(_cursorIndexOfVoteCount);
              }
              _item = new MovieDbEntity(_tmpRowId,_tmpOverview,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpVideo,_tmpTitle,_tmpPosterPath,_tmpBackdropPath,_tmpReleaseDate,_tmpPopularity,_tmpVoteAverage,_tmpId,_tmpAdult,_tmpVoteCount);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public int getNumOfRows() {
    final String _sql = "SELECT COUNT(*) FROM movie_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
