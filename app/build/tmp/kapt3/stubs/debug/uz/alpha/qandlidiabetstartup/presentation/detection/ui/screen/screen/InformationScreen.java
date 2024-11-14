package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/ui/screen/screen/InformationScreen;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Luz/alpha/qandlidiabetstartup/presentation/detection/ui/adapter/InformationAdapter;", "binding", "Luz/alpha/qandlidiabetstartup/databinding/ScreenInformationBinding;", "getBinding", "()Luz/alpha/qandlidiabetstartup/databinding/ScreenInformationBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "mList", "Ljava/util/ArrayList;", "Luz/alpha/qandlidiabetstartup/data/remote/model/InfoData;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "addDataToList", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class InformationScreen extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<uz.alpha.qandlidiabetstartup.data.remote.model.InfoData> mList;
    private uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter.InformationAdapter adapter;
    
    public InformationScreen() {
        super();
    }
    
    private final uz.alpha.qandlidiabetstartup.databinding.ScreenInformationBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addDataToList() {
    }
}