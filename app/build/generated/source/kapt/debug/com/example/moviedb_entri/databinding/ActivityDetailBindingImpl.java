package com.example.moviedb_entri.databinding;
import com.example.moviedb_entri.R;
import com.example.moviedb_entri.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailBindingImpl extends ActivityDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBar, 6);
        sViewsWithIds.put(R.id.toolbar, 7);
        sViewsWithIds.put(R.id.txtTitle, 8);
        sViewsWithIds.put(R.id.imageViewBack, 9);
        sViewsWithIds.put(R.id.imageView3, 10);
        sViewsWithIds.put(R.id.guideline3, 11);
        sViewsWithIds.put(R.id.textView3, 12);
        sViewsWithIds.put(R.id.textView5, 13);
        sViewsWithIds.put(R.id.textView7, 14);
        sViewsWithIds.put(R.id.textView9, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[9]
            , (com.google.android.material.textview.MaterialTextView) bindings[1]
            , (com.google.android.material.textview.MaterialTextView) bindings[2]
            , (com.google.android.material.textview.MaterialTextView) bindings[12]
            , (com.google.android.material.textview.MaterialTextView) bindings[13]
            , (com.google.android.material.textview.MaterialTextView) bindings[3]
            , (com.google.android.material.textview.MaterialTextView) bindings[14]
            , (com.google.android.material.textview.MaterialTextView) bindings[15]
            , (com.google.android.material.textview.MaterialTextView) bindings[5]
            , (com.google.android.material.textview.MaterialTextView) bindings[4]
            , (androidx.appcompat.widget.Toolbar) bindings[7]
            , (com.google.android.material.textview.MaterialTextView) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textMovieName.setTag(null);
        this.textReleaseDate.setTag(null);
        this.textView6.setTag(null);
        this.textViewTotalVotes.setTag(null);
        this.textViewVoteAverage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.data == variableId) {
            setData((com.example.moviedb_entri.models.ResultsItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.example.moviedb_entri.models.ResultsItem Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String dataTitle = null;
        java.lang.String dataVoteAverageToString = null;
        java.lang.Float dataVoteAverage = null;
        java.lang.Integer dataVoteCount = null;
        com.example.moviedb_entri.models.ResultsItem data = mData;
        java.lang.String dataReleaseDate = null;
        java.lang.String dataVoteCountToString = null;
        java.lang.String dataOverview = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.title
                    dataTitle = data.getTitle();
                    // read data.voteAverage
                    dataVoteAverage = data.getVoteAverage();
                    // read data.voteCount
                    dataVoteCount = data.getVoteCount();
                    // read data.releaseDate
                    dataReleaseDate = data.getReleaseDate();
                    // read data.overview
                    dataOverview = data.getOverview();
                }


                if (dataVoteAverage != null) {
                    // read data.voteAverage.toString()
                    dataVoteAverageToString = dataVoteAverage.toString();
                }
                if (dataVoteCount != null) {
                    // read data.voteCount.toString()
                    dataVoteCountToString = dataVoteCount.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textMovieName, dataTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textReleaseDate, dataReleaseDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView6, dataOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewTotalVotes, dataVoteCountToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewVoteAverage, dataVoteAverageToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}