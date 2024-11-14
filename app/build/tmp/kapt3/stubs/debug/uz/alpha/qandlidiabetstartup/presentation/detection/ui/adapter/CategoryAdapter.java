package uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\t2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001a\u0010\u0013\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/ui/adapter/CategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Luz/alpha/qandlidiabetstartup/presentation/detection/ui/adapter/CategoryAdapter$Holder;", "data", "", "Luz/alpha/qandlidiabetstartup/data/remote/model/CategoryData;", "(Ljava/util/List;)V", "listener", "Lkotlin/Function1;", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItemClickListener", "block", "Holder", "app_debug"})
public final class CategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter.CategoryAdapter.Holder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<uz.alpha.qandlidiabetstartup.data.remote.model.CategoryData> data = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super uz.alpha.qandlidiabetstartup.data.remote.model.CategoryData, kotlin.Unit> listener;
    
    public CategoryAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<uz.alpha.qandlidiabetstartup.data.remote.model.CategoryData> data) {
        super();
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super uz.alpha.qandlidiabetstartup.data.remote.model.CategoryData, kotlin.Unit> block) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter.CategoryAdapter.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter.CategoryAdapter.Holder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/ui/adapter/CategoryAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Luz/alpha/qandlidiabetstartup/presentation/detection/ui/adapter/CategoryAdapter;Landroid/view/View;)V", "image", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "title", "Landroid/widget/TextView;", "bind", "", "app_debug"})
    public final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView image = null;
        private final android.widget.TextView title = null;
        
        public Holder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bind() {
        }
    }
}