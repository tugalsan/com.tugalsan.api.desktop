module com.tugalsan.api.desktop {
    requires java.desktop;
    requires com.tugalsan.api.tuple;
    requires com.tugalsan.api.console;
    requires com.tugalsan.api.thread;
    requires com.tugalsan.api.loremipsum;
    requires com.tugalsan.api.shape;
    requires com.tugalsan.api.runnable;
    requires com.tugalsan.api.callable;
    requires com.tugalsan.api.unsafe;
    requires com.tugalsan.api.cast;
    requires com.tugalsan.api.charset;
    exports com.tugalsan.api.desktop.server;
}