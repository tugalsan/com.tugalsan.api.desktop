module com.tugalsan.api.desktop {
    requires java.desktop;
    requires com.tugalsan.api.console.jdk;
    requires com.tugalsan.api.thread;
    requires com.tugalsan.api.loremipsum;
    requires com.tugalsan.api.union;
    requires com.tugalsan.api.shape;
    requires com.tugalsan.api.function;
    
    requires com.tugalsan.api.cast;
    requires com.tugalsan.api.charset;
    exports com.tugalsan.api.desktop.server;
}