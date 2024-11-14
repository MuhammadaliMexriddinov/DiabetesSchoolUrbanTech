package uz.alpha.qandlidiabetstartup.presentation.detection.ui.dialog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0014\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Luz/alpha/qandlidiabetstartup/presentation/detection/ui/dialog/StartOpenDialog;", "Landroid/app/Dialog;", "ctx", "Landroid/content/Context;", "name", "", "(Landroid/content/Context;Ljava/lang/String;)V", "binding", "Luz/alpha/qandlidiabetstartup/databinding/DialogStartOpenBinding;", "clickListener", "Lkotlin/Function0;", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setMainClickListener", "block", "app_debug"})
public final class StartOpenDialog extends android.app.Dialog {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private uz.alpha.qandlidiabetstartup.databinding.DialogStartOpenBinding binding;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> clickListener;
    
    public StartOpenDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super(null);
    }
    
    public final void setMainClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}