package uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016\u00a2\u0006\u0002\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016\u00a2\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001a\u0010\u0019\u001a\u00020\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tJ\u001a\u0010\u001b\u001a\u00020\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tJ\u001a\u0010\u001c\u001a\u00020\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/ui/adapter/CachingAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Luz/alpha/qandlidiabetstartup/data/local/room/DiseaseEntity;", "Luz/alpha/qandlidiabetstartup/presentation/detection/ui/adapter/CachingAdapter$ViewHolder;", "()V", "colors", "", "", "deleteListener", "Lkotlin/Function1;", "", "listener", "updateListener", "onBindViewHolder", "holder", "error/NonExistentClass", "position", "(Lerror/NonExistentClass;I)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Lerror/NonExistentClass;", "setColors", "list", "setDeleteListener", "block", "setListener", "setUpdateListener", "MyDiffUtil", "ViewHolder", "app_debug"})
public final class CachingAdapter extends androidx.recyclerview.widget.ListAdapter<uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity, uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter.CachingAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity, kotlin.Unit> listener;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity, kotlin.Unit> deleteListener;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity, kotlin.Unit> updateListener;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> colors;
    
    public CachingAdapter() {
        super(null);
    }
    
    public final void setColors(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> list) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity, kotlin.Unit> block) {
    }
    
    public final void setDeleteListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity, kotlin.Unit> block) {
    }
    
    public final void setUpdateListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity, kotlin.Unit> block) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public error.NonExistentClass onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    error.NonExistentClass holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/ui/adapter/CachingAdapter$MyDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Luz/alpha/qandlidiabetstartup/data/local/room/DiseaseEntity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class MyDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity> {
        @org.jetbrains.annotations.NotNull()
        public static final uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter.CachingAdapter.MyDiffUtil INSTANCE = null;
        
        private MyDiffUtil() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity oldItem, @org.jetbrains.annotations.NotNull()
        uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity oldItem, @org.jetbrains.annotations.NotNull()
        uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/ui/adapter/CachingAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Luz/alpha/qandlidiabetstartup/databinding/ItemNoteBinding;", "(Luz/alpha/qandlidiabetstartup/presentation/detection/ui/adapter/CachingAdapter;Luz/alpha/qandlidiabetstartup/databinding/ItemNoteBinding;)V", "bind", "", "data", "Luz/alpha/qandlidiabetstartup/data/local/room/DiseaseEntity;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final uz.alpha.qandlidiabetstartup.databinding.ItemNoteBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        uz.alpha.qandlidiabetstartup.databinding.ItemNoteBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity data) {
        }
    }
}