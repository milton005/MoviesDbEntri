package com.example.moviedb_entri.databinding;
import com.example.moviedb_entri.R;
import com.example.moviedb_entri.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBar, 2);
        sViewsWithIds.put(R.id.toolbar, 3);
        sViewsWithIds.put(R.id.rvMovies, 4);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.appbar.AppBarLayout) bindings[2]
            , (androidx.core.widget.ContentLoadingProgressBar) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.appcompat.widget.Toolbar) bindings[3]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pbLoading.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viemodel == variableId) {
            setViemodel((com.example.moviedb_entri.ui.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViemodel(@Nullable com.example.moviedb_entri.ui.HomeViewModel Viemodel) {
        this.mViemodel = Viemodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viemodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViemodelIsLoading((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViemodelIsLoading(androidx.databinding.ObservableBoolean ViemodelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        boolean viemodelIsLoadingGet = false;
        int viemodelIsLoadingViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableBoolean viemodelIsLoading = null;
        com.example.moviedb_entri.ui.HomeViewModel viemodel = mViemodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viemodel != null) {
                    // read viemodel.isLoading
                    viemodelIsLoading = viemodel.getIsLoading();
                }
                updateRegistration(0, viemodelIsLoading);


                if (viemodelIsLoading != null) {
                    // read viemodel.isLoading.get()
                    viemodelIsLoadingGet = viemodelIsLoading.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viemodelIsLoadingGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viemodel.isLoading.get() ? View.VISIBLE : View.GONE
                viemodelIsLoadingViewVISIBLEViewGONE = ((viemodelIsLoadingGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.pbLoading.setVisibility(viemodelIsLoadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viemodel.isLoading
        flag 1 (0x2L): viemodel
        flag 2 (0x3L): null
        flag 3 (0x4L): viemodel.isLoading.get() ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viemodel.isLoading.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}