// Generated by data binding compiler. Do not edit!
package com.example.moviedb_entri.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.moviedb_entri.R;
import com.example.moviedb_entri.models.ResultsItem;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textview.MaterialTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageViewBack;

  @NonNull
  public final MaterialTextView textMovieName;

  @NonNull
  public final MaterialTextView textReleaseDate;

  @NonNull
  public final MaterialTextView textView3;

  @NonNull
  public final MaterialTextView textView5;

  @NonNull
  public final MaterialTextView textView6;

  @NonNull
  public final MaterialTextView textView7;

  @NonNull
  public final MaterialTextView textView9;

  @NonNull
  public final MaterialTextView textViewTotalVotes;

  @NonNull
  public final MaterialTextView textViewVoteAverage;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final MaterialTextView txtTitle;

  @Bindable
  protected ResultsItem mData;

  protected ActivityDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appBar, Guideline guideline3, ImageView imageView3, ImageView imageViewBack,
      MaterialTextView textMovieName, MaterialTextView textReleaseDate, MaterialTextView textView3,
      MaterialTextView textView5, MaterialTextView textView6, MaterialTextView textView7,
      MaterialTextView textView9, MaterialTextView textViewTotalVotes,
      MaterialTextView textViewVoteAverage, Toolbar toolbar, MaterialTextView txtTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBar = appBar;
    this.guideline3 = guideline3;
    this.imageView3 = imageView3;
    this.imageViewBack = imageViewBack;
    this.textMovieName = textMovieName;
    this.textReleaseDate = textReleaseDate;
    this.textView3 = textView3;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView9 = textView9;
    this.textViewTotalVotes = textViewTotalVotes;
    this.textViewVoteAverage = textViewVoteAverage;
    this.toolbar = toolbar;
    this.txtTitle = txtTitle;
  }

  public abstract void setData(@Nullable ResultsItem data);

  @Nullable
  public ResultsItem getData() {
    return mData;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailBinding>inflateInternal(inflater, R.layout.activity_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDetailBinding>inflateInternal(inflater, R.layout.activity_detail, null, false, component);
  }

  public static ActivityDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDetailBinding)bind(component, view, R.layout.activity_detail);
  }
}
