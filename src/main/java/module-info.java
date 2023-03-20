module com.tugalsan.api.desktop {
    requires java.desktop;
    requires com.tugalsan.api.pack;
    requires com.tugalsan.api.shape;
    requires com.tugalsan.api.executable;
    requires com.tugalsan.api.unsafe;
    requires com.tugalsan.api.charset;
    exports com.tugalsan.api.desktop.server;
}